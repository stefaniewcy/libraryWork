package com.test.service.Impl;

import com.test.DAO.BookDAO;
import com.test.model.bookstore.Book;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookDAO bookDAO ;

    @Override
    public int addBook(Book book) {
        book.setPublishDate(new Date());
        return bookDAO.add(book);
    }

    @Override
    public int modifyBook(Book book) {
        book.setPublishDate(new Date());
        return bookDAO.update(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookDAO.delete(id);
    }

    @Override
    public Book queryBook(int id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public List<Book> queryAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    public List<Book> queryBookBySql(int currPage, int pageSize) {
        Map<String, Object> data = new HashMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        return bookDAO.queryBookBySql(data);
    }


    @Override
    public Book getBook(Book book) {
        return bookDAO.getBook(book);
    }

    private Book setBook(int id ,String title ,double price , Date publishDate){
        Book book = new Book() ;
        if( id != 0)
            book.setId(id);
        book.setPrice(price);
        book.setPublishDate(publishDate) ;
        book.setTitle(title);
        return book ;
    }
}
