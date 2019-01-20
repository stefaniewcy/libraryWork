package com.test.controller.bookcontroller;


import com.test.DAO.BookDAO;
import com.test.controller.ResultController.Result;
import com.test.model.bookstore.Book;
import com.test.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/library")
public class PagesOfLibrary {

    @Resource
    BookService bookService;

    @Resource
    BookDAO bookDAO;

    /**
     * 增加图书
     */
    @RequestMapping("/add")
    @ResponseBody
    public Result addBook(Book book) {
        int i = bookService.addBook(book);
        return result(i, (i == 0 ? "error" : "success"), (i == 0 ? "保存失败" : "保存成功"), bookService.getBook(book));
    }

    /*
     * 删除图书
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public Result deleteBook(int id) {
        Book book= bookService.queryBook(id) ;
        int i = bookService.deleteBook(id);
        return result(i, (i == 0 ? "error" : "success"), (i == 0 ? "删除失败" : "删除成功"), bookService.getBook(book));
    }

    /*
     * 修改图书
     * */
    @RequestMapping("/update")
    @ResponseBody
    public Result updateBook(Book book) {
        int i = bookService.modifyBook(book);
        return result(i, (i == 0 ? "error" : "success"), (i == 0 ? "保存失败" : "保存成功"), bookService.getBook(book));
    }

    /*
     * 查询图书
     * */
    @RequestMapping("/getBook")
    @ResponseBody
    public Result getBook(int id) {
        Book book = bookService.queryBook(id);
        return result((book == null ? 0 : 1), null, null, book);
    }

    /*
    * 获取所有图书
    * */
    @RequestMapping("/getAll")
    @ResponseBody
    public Result getBook() {
        List<Book> books = bookService.queryAllBooks();
        return result((books == null ? 0 : 1), null, null, books);
    }
    @RequestMapping("/getPage")
    @ResponseBody
    public Result getBookByPage(int currPage, int pageSize){
        List<Book> books = bookService.queryBookBySql(currPage ,pageSize) ;
        return result((books == null ? 0 : 1), null, null, books);
    }
    public Result result(int type, String status, String message, List<Book> books) {
        Result result = new Result();
        result.setType(type);
        if (status != null)
            result.setStatus(status);
        if (message != null)
            result.setMessage(message);
        if (books != null)
            result.setBooks(books);
        return result;
    }

    public Result result(int type, String status, String message, Book... books) {
        List<Book> books1 = Arrays.asList(books);
        return result(type, status, message, books1);
    }
}