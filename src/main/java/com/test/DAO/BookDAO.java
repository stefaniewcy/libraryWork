package com.test.DAO;

import com.test.model.bookstore.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface BookDAO {
    /**
     * 获得所有图书
     */
    public List<Book> getAllBooks();

    /**
     * 根据图书编号获得图书对象
     */
    public Book getBookById(@Param("id") int id);

    /**
     * 添加图书
     */
    public int add(Book entity);

    /**
     * 根据图书编号删除图书
     */
    public int delete(int id);
    /**
     * 更新图书
     */
    public int update(Book entity);

    List<Book> queryBookBySql(Map<String,Object> data);
    public Book getBook(Book book) ;
}
