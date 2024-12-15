package karazuki.service.impl;
import karazuki.mapper.AuthorMapper;
import karazuki.pojo.dto.AuthorUpdateDTO;
import karazuki.pojo.entity.Author;
import karazuki.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public void insert(Author author) {
        authorMapper.insert(author);
    }

    @Override
    public List<String> list() {

        return authorMapper.list();
    }

    @Override
    public List<Author> findByName(String author) {

        return authorMapper.findByName(author);
    }

    @Override
    public void delete(String author) {
        authorMapper.deleteByName(author);
    }

    @Override
    public void update(AuthorUpdateDTO authorUpdateDTO) {
        authorMapper.update(authorUpdateDTO);
    }

    @Override
    public void deleteById(Integer id) {
        authorMapper.deleteById(id);
    }
}
