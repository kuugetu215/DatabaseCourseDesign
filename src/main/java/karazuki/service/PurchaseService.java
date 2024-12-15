package karazuki.service;

import karazuki.pojo.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    /**
     * 展示所有采购单信息
     * @return
     */
    List<Purchase> list();

    /**
     * 修改采购单信息
     * @param purchase
     */
    void update(Purchase purchase);

    /**
     * 新增采购单
     * @param purchase
     */
    void insert(Purchase purchase);

    /**
     * 删除采购单
     * @param id
     */
    void delete(Integer id);
}
