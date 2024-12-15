package karazuki.controller;

import karazuki.pojo.entity.Bookshortage;
import karazuki.pojo.entity.Result;
import karazuki.service.BookshortageService;
import karazuki.service.impl.BookshortageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/book/shortage")
public class BookshortageController {

    @Autowired
    private BookshortageService bookshortageService;

    /**
     * 展示所有缺书信息
     * @return
     */
    @GetMapping("")
    public Result<List<Bookshortage>> list(){
        log.info("展示所有缺书信息");
        List<Bookshortage> bookshortageList = bookshortageService.list();
        return Result.success(bookshortageList);
    }

    /**
     * 新增缺书信息
     * @param bookshortage
     * @return
     */
    @PostMapping
    public Result insert(@RequestBody Bookshortage bookshortage){
        log.info("新增缺书信息:{}", bookshortage);
        bookshortageService.insert(bookshortage);
        return Result.success();
    }

    /**
     * 更改缺书信息
     * @param bookshortage
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody Bookshortage bookshortage){
        log.info("更改缺书信息:{}", bookshortage);
        bookshortageService.update(bookshortage);
        return Result.success();
    }

    /**
     * 删除缺书信息
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除缺书信息");
        bookshortageService.delete(id);
        return Result.success();
    }
}
