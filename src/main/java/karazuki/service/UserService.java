package karazuki.service;

import karazuki.pojo.dto.LoginOrRegisterDTO;
import karazuki.pojo.dto.UserDTO;
import karazuki.pojo.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 用户登录
     * @param loginOrRegisterDto
     * @return
     */
    User login(LoginOrRegisterDTO loginOrRegisterDto);

    /**
     * 用户注册
     * @param loginOrRegisterDTO
     */
    void register(LoginOrRegisterDTO loginOrRegisterDTO);

    /**
     * 手动新增用户
     * @param userDTO
     */
    void insert(UserDTO userDTO);

    /**
     * 更新用户信息
     * @param userDTO
     */
    void update(UserDTO userDTO);

    /**
     * 删除用户
     * @param id
     */
    void delete(Integer id);

    /**
     * 查看所有用户
     * @return
     */
    List<User> list();

    /**
     * 查看某一用户信息
     * @param id
     * @return
     */
    User findById(Integer id);
}
