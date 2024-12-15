package karazuki.service.impl;

import karazuki.mapper.StoreMapper;
import karazuki.pojo.dto.BookQueryDTO;
import karazuki.pojo.entity.Store;
import karazuki.mapper.AuthorMapper;
import karazuki.mapper.BookMapper;
import karazuki.pojo.dto.BookDTO;
import karazuki.pojo.entity.Author;
import karazuki.pojo.entity.Book;
import karazuki.pojo.vo.BookVO;
import karazuki.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Override
    @Transactional
    public void insert(BookDTO bookDTO) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDTO, book);
        bookMapper.insert(book);

        String authors = bookDTO.getAuthors();

        String[] as = authors.split(" ");

        Author author = new Author();
        author.setBid(book.getId());

        for(String a : as){
            author.setAuthor(a);
            authorMapper.insert(author);
        }

        String[] locations = bookDTO.getLocations().split(" ");

        Store store = new Store();
        store.setBid(book.getId());
        store.setState(1);

        for (String location : locations){
            store.setLocation(location);
            storeMapper.insert(store);
        }

    }

    @Override
    public List<Book> list(BookQueryDTO bookQueryDTO) {
        List<Book> bookList = bookMapper.list(bookQueryDTO);

        return bookList;
    }

    @Override
    public BookVO findById(Integer id) {
        Book book = bookMapper.findById(id);

        BookVO bookVO = new BookVO();

        BeanUtils.copyProperties(book, bookVO);

        List<Author> authors = authorMapper.findByBid(id);
        List<Store> stores = storeMapper.findByBid(id);

        bookVO.setAuthors(authors);
        bookVO.setStores(stores);

        return bookVO;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        bookMapper.delete(id);
        authorMapper.delete(id);
    }

    @Override
    @Transactional
    public void update(Book book) {

        bookMapper.update(book);
    }
}
