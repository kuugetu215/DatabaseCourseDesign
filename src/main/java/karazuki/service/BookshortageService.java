package karazuki.service;

import karazuki.pojo.entity.Bookshortage;

import java.util.List;

public interface BookshortageService {
    /**
     * 展示所有缺书信息
     * @return
     */
    List<Bookshortage> list();

    /**
     * 新增缺书信息
     * @param bookshortage
     */
    void insert(Bookshortage bookshortage);

    /**
     * 更新缺书信息
     * @param bookshortage
     */
    void update(Bookshortage bookshortage);

    /**
     * 删除缺书信息
     * @param id
     */
    void delete(Integer id);
}
