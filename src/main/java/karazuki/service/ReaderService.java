package karazuki.service;

import karazuki.pojo.entity.Reader;

import java.util.List;

public interface ReaderService {

    /**
     * 展示所有读者信息
     * @return
     */
    List<Reader> list();

    /**
     * 展示单个读者详细信息
     * @param id
     * @return
     */
    Reader findById(Integer id);

    /**
     * 更新读者信息
     * @param reader
     */
    void update(Reader reader);

    /**
     * 新增读者信息
     * @param reader
     */
    void insert(Reader reader);

    /**
     * 删除读者信息
     * @param id
     */
    void delete(Integer id);
}
