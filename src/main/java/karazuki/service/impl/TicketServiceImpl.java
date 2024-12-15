package karazuki.service.impl;

import karazuki.mapper.TicketMapper;
import karazuki.pojo.entity.Ticket;
import karazuki.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public List<Ticket> list() {
        return ticketMapper.list();
    }

    @Override
    public List<Ticket> findByRid(Integer rid) {
        return ticketMapper.findByRid(rid);
    }

    @Override
    public void update(Ticket ticket) {
        ticketMapper.update(ticket);
    }

    @Override
    public void insert(Ticket ticket) {
        ticket.setDate(LocalDate.now());
        ticketMapper.insert(ticket);
    }

    @Override
    public void delete(Integer id) {
        ticketMapper.delete(id);
    }


}
