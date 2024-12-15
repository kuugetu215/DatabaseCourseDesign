package karazuki.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "更改作者姓名时传输数据")
public class AuthorUpdateDTO {
    @Schema(description = "旧名称")
    private String oldName;

    @Schema(description = "新名称")
    private String newName;
}
