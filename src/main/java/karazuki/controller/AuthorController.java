package karazuki.controller;

import karazuki.pojo.dto.AuthorUpdateDTO;
import karazuki.pojo.entity.Author;
import karazuki.pojo.entity.Result;
import karazuki.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    /**
     * 新增作者信息
     * @param author
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody Author author){
        log.info("新增作者信息:{}", author);
        authorService.insert(author);
        return Result.success();
    }

    /**
     * 展示所有作者信息
     * @return
     */
    @GetMapping()
    public Result<List<String>> list(){
        log.info("展示所有作者信息");
        List<String> authors = authorService.list();
        return Result.success(authors);
    }

    /**
     * 展示作者信息
     * @param author
     * @return
     */
    @GetMapping("/{author}")
    public Result<List<Author>> author(@PathVariable String author){
        log.info("展示作者信息");
        List<Author> authors = authorService.findByName(author);
        return Result.success(authors);
    }

    /**
     * 修改作者名称
     * @param authorUpdateDTO
     * @return
     */
    @PutMapping("")
    public Result update(@RequestBody AuthorUpdateDTO authorUpdateDTO){
        log.info("修改作者名称");
        authorService.update(authorUpdateDTO);
        return Result.success();
    }

    /**
     * 删除作者
     * @param author
     * @return
     */
    @DeleteMapping("/delete/{author}")
    public Result delete(@PathVariable String author){
        log.info("删除作者信息");
        authorService.delete(author);
        return Result.success();
    }

    /**
     * 删除某本书的作者
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除某本书的作者");
        authorService.deleteById(id);
        return Result.success();
    }
}
