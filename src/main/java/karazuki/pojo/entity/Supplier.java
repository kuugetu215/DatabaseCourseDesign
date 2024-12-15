package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "供应商相关信息")
public class Supplier {

    @Schema(description = "供应商id")
    private Integer id;

    @Schema(description = "供应商名称")
    private String name;

    @Schema(description = "供应商电话")
    private String phoneNumber;

    @Schema(description = "供应商信息")
    private String supplyInfo;
}
