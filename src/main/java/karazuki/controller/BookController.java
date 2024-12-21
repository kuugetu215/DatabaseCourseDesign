package karazuki.controller;

import karazuki.pojo.dto.BookDTO;
import karazuki.pojo.dto.BookQueryDTO;
import karazuki.pojo.entity.Book;
import karazuki.pojo.entity.Result;
import karazuki.pojo.vo.BookVO;
import karazuki.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 新增书本信息
     * @param bookDTO
     * @return
     */
    @PostMapping("")
    public Result insert(@RequestBody BookDTO bookDTO){
        log.info("新增书本信息");
        bookService.insert(bookDTO);
        return Result.success();
    }

    /**
     * 查询书本信息
     * @param bookQueryDTO
     * @return
     */
    @PostMapping("list")
    public Result<List<Book>> list(@RequestBody BookQueryDTO bookQueryDTO){
        log.info("书本信息查询");
        List<Book> books = bookService.list(bookQueryDTO);
        return Result.success(books);
    }

    /**
     * 查询单个书本信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<BookVO> book(@PathVariable Integer id){
        log.info("查看单个书本信息");
        BookVO bookVO = bookService.findById(id);
        return Result.success(bookVO);
    }

    /**
     * 删除书本信息
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除书本信息");
        bookService.delete(id);
        return Result.success();
    }

    /**
     * 更新书本信息
     * @param book
     * @return
     */
    @PutMapping("")
    public Result update(@RequestBody Book book){
        log.info("更新书本信息");
        bookService.update(book);
        return Result.success();
    }
}
