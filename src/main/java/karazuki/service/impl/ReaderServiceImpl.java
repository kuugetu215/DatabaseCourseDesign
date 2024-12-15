package karazuki.service.impl;

import karazuki.mapper.ReaderMapper;
import karazuki.pojo.entity.Reader;
import karazuki.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderMapper readerMapper;

    @Override
    public List<Reader> list() {
        return readerMapper.list();
    }

    @Override
    public Reader findById(Integer id) {
        return readerMapper.findById(id);
    }

    @Override
    public void update(Reader reader) {
        readerMapper.update(reader);
    }

    @Override
    public void insert(Reader reader) {
        if (reader.getBalance() < 100){
            reader.setCreditRating(1);
        } else if (reader.getBalance() < 500){
            reader.setCreditRating(2);
        } else if (reader.getBalance() < 1000){
            reader.setCreditRating(3);
        } else if (reader.getBalance() < 3000){
            reader.setCreditRating(4);
        } else {
            reader.setCreditRating(5);
        }
        readerMapper.insert(reader);
    }

    @Override
    public void delete(Integer id) {
        readerMapper.delete(id);
    }
}
