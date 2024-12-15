package karazuki.mapper;

import karazuki.pojo.dto.AuthorUpdateDTO;
import karazuki.pojo.entity.Author;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthorMapper {

    @Insert("insert into author (bid, author) values (#{bid}, #{author})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(Author author);

    @Select("select author from author where bid = #{bid}")
    List<Author> findByBid(Integer bid);

    @Delete("delete from author where bid = #{bid}")
    void delete(Integer bid);

    @Select("select author from author group by author")
    List<String> list();

    @Select("select * from author where author = #{author}")
    List<Author> findByName(String author);

    @Delete("delete from author where author = #{author}")
    void deleteByName(String author);

    @Update("update author set author = #{newName} where author = #{oldName}")
    void update(AuthorUpdateDTO authorUpdateDTO);

    @Delete("delete from author where id = #{id}")
    void deleteById(Integer id);
}
