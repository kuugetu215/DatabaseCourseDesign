package karazuki.service.impl;

import karazuki.mapper.SupplierBookMapper;
import karazuki.mapper.SupplierMapper;
import karazuki.pojo.entity.Supplier;
import karazuki.pojo.entity.SupplierBook;
import karazuki.pojo.vo.SupplierVO;
import karazuki.service.SupplierService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Autowired
    private SupplierBookMapper supplierBookMapper;

    @Override
    public List<Supplier> list() {
        return supplierMapper.list();
    }

    @Override
    public SupplierVO findById(Integer id) {
        Supplier supplier = supplierMapper.findById(id);
        SupplierVO supplierVO = new SupplierVO();
        BeanUtils.copyProperties(supplier, supplierVO);
        List<SupplierBook> supplierBookList = supplierBookMapper.findBySid(id);
        supplierVO.setSupplierBookList(supplierBookList);
        return supplierVO;
    }

    @Override
    public void insert(Supplier supplier) {
        supplierMapper.insert(supplier);
    }

    @Override
    public void update(Supplier supplier) {
        supplierMapper.update(supplier);
    }

    @Override
    public void delete(Integer id) {
        supplierMapper.delete(id);
    }
}
