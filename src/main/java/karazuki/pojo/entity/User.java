package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "用户表")
public class User {
    @Schema(description = "用户id")
    private Integer id;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;


    @Schema(description = "昵称")
    private String name;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "是否是管理员")
    private Integer isAdmin;

    @Schema(description = "用户注册时间")
    private LocalDateTime createTime;
}
