package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
@Schema(description = "书本缺失信息")
public class Bookshortage {

    @Schema(description = "书本缺失表id")
    private Integer id;

    @Schema(description = "书本id")
    private Integer bid;

    @Schema(description = "供应商id")
    private Integer sid;

    @Schema(description = "需要数量")
    private String quantity;

    @Schema(description = "创立日期，插入时不使用")
    private LocalDate date;
}
