package karazuki.service.impl;

import karazuki.context.BaseContext;
import karazuki.mapper.UserMapper;
import karazuki.pojo.dto.LoginOrRegisterDTO;
import karazuki.pojo.dto.UserDTO;
import karazuki.pojo.entity.User;
import karazuki.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(LoginOrRegisterDTO loginOrRegisterDto) {
        String username = loginOrRegisterDto.getUsername();
        String password = loginOrRegisterDto.getPassword();

        //1、根据用户名查询数据库中的数据
        User user = userMapper.getByUsername(username);

        //2、处理各种异常情况（用户名不存在、密码不对）
        if (user == null) {
            //账号不存在
            throw new RuntimeException("用户名不存在");
        }

        //密码比对
        if (!password.equals(user.getPassword())) {
            //密码错误
            throw new RuntimeException("密码错误");
        }

        //3、返回实体对象
        return user;
    }

    @Override
    public void register(LoginOrRegisterDTO loginOrRegisterDTO) {
        String username = loginOrRegisterDTO.getUsername();
        String password = loginOrRegisterDTO.getPassword();

        //1、根据用户名查询数据库中的数据
        User u = userMapper.getByUsername(username);

        //2、处理异常情况（用户名已存在）
        if(u != null){
            throw new RuntimeException("用户名已存在");
        }

        User user = new User();

        //3、封装实体类并插入到用户表中
        user.setUsername(username);
        user.setPassword(password);
        user.setName("用户" + LocalDateTime.now());
        user.setCreateTime(LocalDateTime.now());
        user.setIsAdmin(0);

        userMapper.insert(user);
    }

    @Override
    public void insert(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setCreateTime(LocalDateTime.now());
        userMapper.insert(user);
    }

    @Override
    public void update(UserDTO userDTO) {
        if (userDTO.getId() == null){
            userDTO.setId(BaseContext.getCurrentId());
        }
        userMapper.update(userDTO);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
