package karazuki.mapper;

import karazuki.pojo.dto.UserDTO;
import karazuki.pojo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User getByUsername(String username);

    @Insert("insert into user (username, password, name, email, is_admin, create_time) VALUES (#{username}, #{password}, #{name}, #{email}, #{isAdmin}, #{createTime})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(User user);

    void update(UserDTO userDTO);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);

    @Select("select * from user")
    List<User> list();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);
}
