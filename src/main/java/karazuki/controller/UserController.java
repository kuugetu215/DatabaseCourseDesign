package karazuki.controller;

import karazuki.pojo.dto.UserDTO;
import karazuki.pojo.entity.Result;
import karazuki.pojo.entity.User;
import karazuki.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public Result<List<User>> list(){
        log.info("查看所有用户");
        List<User> userList = userService.list();
        return Result.success(userList);
    }

    @GetMapping("/{id}")
    public Result<User> findById(@PathVariable Integer id){
        log.info("查看某一用户信息");
        User user = userService.findById(id);
        return Result.success(user);
    }

    /**
     * 手动新增用户
     * @param userDTO
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody UserDTO userDTO){
        log.info("手动新增用户:{}", userDTO);
        userService.insert(userDTO);
        return Result.success();
    }

    /**
     * 更新用户信息
     * @param userDTO
     * @return
     */
    @PutMapping
    public Result update(@RequestBody UserDTO userDTO){
        log.info("更新用户信息");
        userService.update(userDTO);
        return Result.success();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除用户");
        userService.delete(id);
        return Result.success();
    }
}
