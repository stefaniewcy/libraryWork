package com.test.service;

import com.test.model.bookstore.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface BookService {

    int addBook(Book book) ;
    int modifyBook(Book book) ;
    int deleteBook(int id) ;
    Book queryBook(int id) ;
    List<Book> queryAllBooks() ;
    List<Book> queryBookBySql(int currPage, int pageSize);
    Book getBook(Book book) ;
}
