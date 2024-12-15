package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "库存相关信息")
public class Store {

    @Schema(description = "库存表id")
    private Integer id;

    @Schema(description = "库存状态 0借出 1在库")
    private Integer state;

    @Schema(description = "书本id")
    private Integer bid;

    @Schema(description = "书本位置")
    private String location;
}
