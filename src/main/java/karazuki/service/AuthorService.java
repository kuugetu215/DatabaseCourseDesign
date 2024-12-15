package karazuki.service;

import karazuki.pojo.dto.AuthorUpdateDTO;
import karazuki.pojo.entity.Author;

import java.util.List;

public interface AuthorService {

    /**
     * 新增作者信息
     * @param author
     */
    void insert(Author author);

    /**
     * 展示所有作者信息
     * @return
     */
    List<String> list();

    /**
     * 展示单个作者作品信息
     * @param author
     * @return
     */
    List<Author> findByName(String author);

    /**
     * 删除作者信息
     * @param author
     */
    void delete(String author);

    /**
     * 更新作者名称
     * @param authorUpdateDTO
     */
    void update(AuthorUpdateDTO authorUpdateDTO);

    /**
     * 删除某本书的作者
     * @param id
     */
    void deleteById(Integer id);
}
