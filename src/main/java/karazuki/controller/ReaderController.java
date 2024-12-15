package karazuki.controller;

import karazuki.pojo.entity.Reader;
import karazuki.pojo.entity.Result;
import karazuki.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    /**
     * 展示所有读者信息
     * @return
     */
    @GetMapping()
    public Result<List<Reader>> list(){
        log.info("展示所有读者信息");
        List<Reader> readerList = readerService.list();
        return Result.success(readerList);
    }

    /**
     * 展示单个读者详细信息
     * @return
     */
    @GetMapping("{id}")
    public Result<Reader> findById(@PathVariable Integer id){
        log.info("展示单个读者详细信息:{}", id);
        Reader reader = readerService.findById(id);
        return Result.success(reader);
    }

    /**
     * 更新读者信息
     * @param reader
     * @return
     */
    public Result update(@RequestBody Reader reader){
        log.info("更新读者信息:{}", reader);
        readerService.update(reader);
        return Result.success();
    }

    /**
     * 新增读者信息
     * @param reader
     * @return
     */
    public Result insert(@RequestBody Reader reader){
        log.info("新增读者信息:{}", reader);
        readerService.insert(reader);
        return Result.success();
    }

    /**
     * 删除读者信息
     * @param id
     * @return
     */
    public Result delete(@PathVariable Integer id){
        log.info("删除读者信息:{}", id);
        readerService.delete(id);
        return Result.success();
    }
}
