package karazuki.mapper;

import karazuki.pojo.entity.Supplier;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SupplierMapper {

    @Select("select * from supplier")
    List<Supplier> list();

    @Select("select * from supplier where id = #{id}")
    Supplier findById(Integer id);

    @Insert("insert into supplier (name, phone_number, supply_info) VALUES (#{name}, #{phoneNumber}, #{supplyInfo})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(Supplier supplier);

    void update(Supplier supplier);

    @Delete("delete from supplier where id = #{id}")
    void delete(Integer id);
}
