package karazuki.controller;

import karazuki.pojo.entity.Result;
import karazuki.pojo.entity.Store;
import karazuki.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;


    /**
     * 手动插入库存信息
     * @param store
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody Store store){
        log.info("手动插入库存信息");
        storeService.insert(store);
        return Result.success();
    }

    /**
     * 更新位置或状态
     * @param store
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody Store store){
        log.info("更新位置或状态");
        storeService.update(store);
        return Result.success();
    }

    /**
     * 删除存储位置信息
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除存储位置信息");
        storeService.delete(id);
        return Result.success();
    }
}
