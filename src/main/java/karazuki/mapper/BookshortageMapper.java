package karazuki.mapper;

import karazuki.pojo.entity.Bookshortage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookshortageMapper {

    @Select("select * from bookshortage")
    List<Bookshortage> list();

    @Insert("insert into bookshortage (bid, sid, quantity, date) VALUES (#{bid}, #{sid}, #{quantity}, #{date})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Bookshortage bookshortage);


    void update(Bookshortage bookshortage);

    @Delete("delete from bookshortage where id = #{id};")
    void delete(Integer id);
}
