package karazuki.mapper;

import karazuki.pojo.dto.BookQueryDTO;
import karazuki.pojo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Insert("insert into book (name, price, publish, keyword, stock, sid, series_id, time) VALUES (#{name}, #{price}, #{publish}, #{keyword}, #{stock}, #{sid}, #{seriesId}, #{time})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(Book book);

    List<Book> list(BookQueryDTO bookQueryDTO);

    @Select("select * from book where id = #{id}")
    Book findById(Integer id);


    @Delete("delete from book where id = #{id}")
    void delete(Integer id);

    void update(Book book);
}
