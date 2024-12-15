package karazuki.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "书籍采购表")
public class Purchase {

    @Schema(description = "采购表id")
    private Integer id;

    @Schema(description = "书籍id")
    private Integer bid;

    @Schema(description = "采购数量")
    private Integer quantity;
}
