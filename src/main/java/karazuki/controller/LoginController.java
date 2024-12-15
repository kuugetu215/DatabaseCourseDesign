package karazuki.controller;

import karazuki.pojo.dto.LoginOrRegisterDTO;
import karazuki.pojo.entity.Result;
import karazuki.pojo.entity.User;
import karazuki.pojo.vo.LoginVO;
import karazuki.service.UserService;
import karazuki.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param loginOrRegisterDto
     * @return
     */
    @PostMapping("/login")
    public Result<LoginVO> login(@RequestBody LoginOrRegisterDTO loginOrRegisterDto){
        log.info("用户登录");

        //根据用户名、密码查询并返回用户信息
        User user = userService.login(loginOrRegisterDto);

        Map<String, String> map = new HashMap<>();
        map.put("id", "" + user.getId());
        map.put("username", user.getUsername());
        map.put("isAdmin", "" + user.getIsAdmin());

        String token = JwtUtils.getToken(map);

        LoginVO loginVO = LoginVO.builder().
                id(user.getId()).
                username(user.getUsername()).
                token(token).
                        build();

        return Result.success(loginVO);
    }

    /**
     * 用户注册
     * @param loginOrRegisterDTO
     */
    @PostMapping("/register")
    public Result register(@RequestBody LoginOrRegisterDTO loginOrRegisterDTO){
        log.info("用户注册");
        userService.register(loginOrRegisterDTO);
        return Result.success();
    }
}
