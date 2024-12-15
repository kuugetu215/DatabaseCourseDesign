package karazuki.service.impl;

import karazuki.mapper.SupplierMapper;
import karazuki.pojo.entity.Supplier;
import karazuki.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<Supplier> list() {
        return supplierMapper.list();
    }

    @Override
    public Supplier findById(Integer id) {
        return supplierMapper.findById(id);
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
