package karazuki.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "登录注册时传输数据")
public class LoginOrRegisterDTO {

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;
}
