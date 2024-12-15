package karazuki.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
@Schema(description = "书本相关传输数据")
public class BookDTO {

    @Schema(description = "书本id")
    private Integer id;

    @Schema(description = "书名")
    private String name;

    @Schema(description = "价格")
    private Double price;

    @Schema(description = "出版社")
    private String publish;

    @Schema(description = "关键字，关键字之间用\"、\"隔开")
    private String keyword;

    @Schema(description = "库存数量")
    private Integer stock;

    @Schema(description = "供应商id")
    private Integer sid;

    @Schema(description = "系列号")
    private Integer seriesId;

    @Schema(description = "发行时间")
    private LocalDate time;

    @Schema(description = "作者名，作者名之间用\" \"隔开，更新时不使用")
    private String authors;

    @Schema(description = "书本位置，书本位置之间用\" \"隔开， 更新时不使用")
    private String locations;
}
