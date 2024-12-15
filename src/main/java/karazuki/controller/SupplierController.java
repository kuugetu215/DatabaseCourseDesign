package karazuki.controller;

import karazuki.pojo.entity.Result;
import karazuki.pojo.entity.Supplier;
import karazuki.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * 展示所有供应商信息
     * @return
     */
    @GetMapping()
    public Result<List<Supplier>> list(){
        log.info("展示所有供应商信息");
        List<Supplier> supplierList = supplierService.list();
        return Result.success(supplierList);
    }

    /**
     * 根据id展示供应商信息
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Result<Supplier> findById(@PathVariable Integer id){
        log.info("根据id展示供应商信息:{}", id);
        Supplier supplier = supplierService.findById(id);

        return Result.success(supplier);
    }

    /**
     * 新增供应商
     * @param supplier
     * @return
     */
    @PostMapping
    public Result insert(@RequestBody Supplier supplier){
        log.info("新增供应商:{}", supplier);
        supplierService.insert(supplier);
        return Result.success();
    }

    /**
     * 修改供应商信息
     * @param supplier
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Supplier supplier){
        log.info("修改供应商信息:{}", supplier);
        supplierService.update(supplier);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除供应商信息:{}", id);
        supplierService.delete(id);
        return Result.success();
    }
}
