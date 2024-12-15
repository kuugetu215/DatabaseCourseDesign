package karazuki.service;

import karazuki.pojo.dto.BookDTO;
import karazuki.pojo.dto.BookQueryDTO;
import karazuki.pojo.entity.Book;
import karazuki.pojo.vo.BookVO;

import java.util.List;

public interface BookService {
    /**
     * 新增书本信息
     * @param bookDTO
     */
    void insert(BookDTO bookDTO);

    /**
     * 查询书本信息
     * @return
     */
    List<Book> list(BookQueryDTO bookQueryDTO);

    /**
     * 查看单个书本信息
     * @param id
     * @return
     */
    BookVO findById(Integer id);

    /**
     * 删除书本信息
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新书本信息
     * @param book
     */
    void update(Book book);
}
