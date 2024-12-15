package karazuki.controller;

import karazuki.pojo.entity.Purchase;
import karazuki.pojo.entity.Result;
import karazuki.service.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * 展示所有采购单信息
     * @return
     */
    @GetMapping
    public Result<List<Purchase>> list(){
        log.info("展示所有采购单信息");
        List<Purchase> purchaseList = purchaseService.list();
        return Result.success(purchaseList);
    }

    /**
     * 修改采购单信息
     * @param purchase
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Purchase purchase){
        log.info("修改采购单信息:{}", purchase);
        purchaseService.update(purchase);
        return Result.success();
    }

    /**
     * 新增采购单
     * @param purchase
     * @return
     */
    @PostMapping
    public Result insert(@RequestBody Purchase purchase){
        log.info("新增采购单:{}", purchase);
        purchaseService.insert(purchase);
        return Result.success();
    }

    /**
     * 删除采购单
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除采购单:{}", id);
        purchaseService.delete(id);
        return Result.success();
    }
}
