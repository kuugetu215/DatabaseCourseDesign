package karazuki.mapper;

import karazuki.pojo.entity.SupplierBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupplierBookMapper {

    @Select("select * from supplier_book where sid = #{sid}")
    List<SupplierBook> findBySid(Integer sid);
}
