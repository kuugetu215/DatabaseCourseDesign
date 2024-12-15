package karazuki.service;

import karazuki.pojo.entity.Supplier;

import java.util.List;

public interface SupplierService {

    /**
     * 展示所有供应商信息
     * @return
     */
    List<Supplier> list();

    /**
     * 根据id展示供应商信息
     * @param id
     * @return
     */
    Supplier findById(Integer id);

    /**
     * 新增供应商
     * @param supplier
     */
    void insert(Supplier supplier);

    /**
     * 修改供应商信息
     * @param supplier
     */
    void update(Supplier supplier);

    /**
     * 删除供应商信息
     * @param id
     */
    void delete(Integer id);
}
