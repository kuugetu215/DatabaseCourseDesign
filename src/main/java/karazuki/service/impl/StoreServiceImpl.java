package karazuki.service.impl;

import karazuki.mapper.StoreMapper;
import karazuki.pojo.entity.Store;
import karazuki.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public void insert(Store store) {
        storeMapper.insert(store);
    }

    @Override
    public void update(Store store) {
        storeMapper.update(store);
    }

    @Override
    public void delete(Integer id) {
        storeMapper.delete(id);
    }
}
