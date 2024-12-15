package karazuki.mapper;

import karazuki.pojo.entity.Purchase;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PurchaseMapper {

    @Select("select * from purchase")
    List<Purchase> list();

    void update(Purchase purchase);

    @Insert("insert into purchase (bid, quantity) VALUES (#{bid}, #{quantity})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Purchase purchase);

    @Delete("delete from purchase where id = #{id}")
    void delete(Integer id);
}
