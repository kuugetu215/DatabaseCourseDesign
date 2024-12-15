package karazuki.controller;

import karazuki.pojo.entity.Result;
import karazuki.pojo.entity.Ticket;
import karazuki.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * 展示所有订单信息
     * @return
     */
    @GetMapping()
    public Result<List<Ticket>> list(){
        log.info("展示所有订单信息");
        List<Ticket> ticketList = ticketService.list();
        return Result.success(ticketList);
    }

    /**
     * 根据读者信息查找订单信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<List<Ticket>> findByRid(@PathVariable Integer id){
        log.info("根据读者信息查找订单信息");
        List<Ticket> ticketList = ticketService.findByRid(id);
        return Result.success(ticketList);
    }

    /**
     * 修改订单信息
     * @return
     */
    @PostMapping()
    public Result update(@RequestBody Ticket ticket){
        log.info("修改订单信息:{}", ticket);
        ticketService.update(ticket);
        return Result.success();
    }

    /**
     * 新增订单信息
     * @param ticket
     * @return
     */
    @PutMapping
    public Result insert(@RequestBody Ticket ticket){
        log.info("新增订单信息:{}", ticket);
        ticketService.insert(ticket);
        return Result.success();
    }

    /**
     * 删除订单信息
     * @param id
     * @return
     */
    @DeleteMapping()
    public Result delete(@PathVariable Integer id){
        log.info("删除订单信息:{}", id);
        ticketService.delete(id);
        return Result.success();
    }
}
