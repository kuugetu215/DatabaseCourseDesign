package karazuki.service.impl;

import karazuki.mapper.PurchaseMapper;
import karazuki.pojo.entity.Purchase;
import karazuki.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> list() {
        return purchaseMapper.list();
    }

    @Override
    public void update(Purchase purchase) {
        purchaseMapper.update(purchase);
    }

    @Override
    public void insert(Purchase purchase) {
        purchaseMapper.insert(purchase);
    }

    @Override
    public void delete(Integer id) {
        purchaseMapper.delete(id);
    }
}
