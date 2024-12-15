package karazuki.mapper;

import karazuki.pojo.entity.Reader;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderMapper {
    
    @Select("select * from reader")
    List<Reader> list();

    @Select("select * from reader where id = #{id};")
    Reader findById(Integer id);

    void update(Reader reader);

    @Insert("insert into reader (uid, address, balance, credit_rating) VALUES (#{uid}, #{address}, #{balance}, #{creditRating})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(Reader reader);

    @Delete("delete from reader where id = #{id}")
    void delete(Integer id);
}
