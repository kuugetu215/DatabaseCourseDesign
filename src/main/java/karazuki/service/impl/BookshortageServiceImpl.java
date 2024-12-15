package karazuki.service.impl;

import karazuki.mapper.BookshortageMapper;
import karazuki.pojo.entity.Book;
import karazuki.pojo.entity.Bookshortage;
import karazuki.service.BookshortageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookshortageServiceImpl implements BookshortageService {

    @Autowired
    private BookshortageMapper bookshortageMapper;

    @Override
    public List<Bookshortage> list() {
        return bookshortageMapper.list();
    }

    @Override
    public void insert(Bookshortage bookshortage) {
        bookshortage.setDate(LocalDate.now());
        bookshortageMapper.insert(bookshortage);
    }

    @Override
    public void update(Bookshortage bookshortage) {
        bookshortageMapper.update(bookshortage);
    }

    @Override
    public void delete(Integer id) {
        bookshortageMapper.delete(id);
    }
}
