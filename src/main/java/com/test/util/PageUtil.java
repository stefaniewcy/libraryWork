package com.test.util;

import com.test.model.bookstore.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PageUtil {
    private int firstIndex;
    private int pageSize=5;
    private int pageCount=1;
    private int totalPageCount;
    private int totalDataCount;
    private List<Book> list;

    public int getFirstIndex() {
        return (this.getPageCount()-1)*this.getPageSize();
    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getTotalPageCount() {
        return (this.getTotalDataCount()-1)/this.getPageSize()+1;
    }

    public int getTotalDataCount() {
        return totalDataCount;
    }
    public void setTotalDataCount(int totalDataCount) {
        this.totalDataCount = totalDataCount;
    }
    public List<Book> getList() {
        return list;
    }
    public void setList(List<Book> list) {
        this.list = list;
    }
}
