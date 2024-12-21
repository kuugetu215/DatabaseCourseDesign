package karazuki.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "书本查询时传输数据")
public class BookQueryDTO {

    @Schema(description = "书名")
    private String name;
}
