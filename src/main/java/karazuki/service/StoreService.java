package karazuki.service;

import karazuki.pojo.entity.Store;

public interface StoreService {
    /**
     * 手动插入库存信息
     * @param store
     */
    void insert(Store store);

    /**
     * 更新位置或状态
     * @param store
     */
    void update(Store store);

    /**
     * 删除存储位置信息
     * @param id
     */
    void delete(Integer id);
}
