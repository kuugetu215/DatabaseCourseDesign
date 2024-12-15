package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
@Schema(description = "订单表")
public class Ticket {

    @Schema(description = "订单表id")
    private Integer id;

    @Schema(description = "价格")
    private Double price;

    @Schema(description = "数量")
    private Integer quantity;

    @Schema(description = "读者id")
    private Integer rid;

    @Schema(description = "详情描述")
    private String description;

    @Schema(description = "地址")
    private String address;

    @Schema(description = "状态 0未支付 1已支付")
    private Integer state;

    @Schema(description = "日期")
    private LocalDate date;
}
