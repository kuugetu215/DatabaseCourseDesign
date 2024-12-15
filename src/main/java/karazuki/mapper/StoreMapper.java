package karazuki.mapper;

import karazuki.pojo.entity.Store;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StoreMapper {

    @Select("select * from store where id = #{id}")
    List<Store> findByBid(Integer id);

    @Insert("insert into store (state, bid, location) VALUES (#{state}, #{bid}, #{location})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(Store store);


    void update(Store store);

    @Delete("delete from store where id = #{id}")
    void delete(Integer id);
}
