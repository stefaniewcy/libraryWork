package com.test.DAO.Impl;

import com.test.DAO.BookDAO2;
import com.test.model.bookstore.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BookDAO2Impl implements BookDAO2 {

    @Resource
    private SqlSession sqlSession;

    @Override
    public Book getBookById(int id) {
        return (Book) sqlSession.selectOne("org.mybatis.spring.sample.mapper.BookMapper.getBookById", id);
    }
}
