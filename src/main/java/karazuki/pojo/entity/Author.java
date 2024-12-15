package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "作者类")
public class Author {

    @Schema(description = "作者表id")
    private Integer id;

    @Schema(description = "书本id")
    private Integer bid;

    @Schema(description = "作者名")
    private String author;
}
