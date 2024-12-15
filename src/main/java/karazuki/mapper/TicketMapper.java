package karazuki.mapper;

import karazuki.pojo.entity.Ticket;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TicketMapper {

    @Select("select * from ticket")
    List<Ticket> list();

    @Select("select * from ticket where rid = #{rid}")
    List<Ticket> findByRid(Integer rid);


    void update(Ticket ticket);

    @Insert("insert into ticket (price, quantity, rid, description, address, state, date) " +
            "value (#{price}, #{quantity}, #{rid}, #{description}, #{address}, #{state}, #{date})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Ticket ticket);

    @Delete("delete from ticket where id = #{id}")
    void delete(Integer id);
}
