package karazuki.pojo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import karazuki.pojo.entity.Supplier;
import karazuki.pojo.entity.SupplierBook;
import lombok.Data;

import java.util.List;

@Data
public class SupplierVO {


    @Schema(description = "供应商id")
    private Integer id;

    @Schema(description = "供应商名称")
    private String name;

    @Schema(description = "供应商电话")
    private String phoneNumber;

    @Schema(description = "供应商信息")
    private String supplyInfo;

    private List<SupplierBook> supplierBookList;
}
