package karazuki.service;

import karazuki.pojo.entity.Ticket;

import java.util.List;

public interface TicketService {
    /**
     * 展示所有订单信息
     * @return
     */
    List<Ticket> list();

    List<Ticket> findByRid(Integer rid);

    /**
     * 修改订单信息
     * @param ticket
     */
    void update(Ticket ticket);

    /**
     * 新增订单信息
     * @param ticket
     */
    void insert(Ticket ticket);

    /**
     * 删除订单信息
     * @param id
     */
    void delete(Integer id);
}
