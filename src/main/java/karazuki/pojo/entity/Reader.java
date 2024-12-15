package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "读者相关数据")
public class Reader {

    @Schema(description = "读者id")
    private Integer id;

    @Schema(description = "读者关联用户id")
    private Integer uid;

    @Schema(description = "住址")
    private String address;

    @Schema(description = "账户余额")
    private Double balance;

    @Schema(description = "信用等级")
    private Integer creditRating;
}
