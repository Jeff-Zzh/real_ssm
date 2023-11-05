package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)//要测的业务层接口在Spring环境中
public class BookServiceTest {
    //要调业务层接口，需要自动装配
    @Autowired
    private BookService bookService;

    /**
     * 单元测试
     * 测试业务层接口getById()
     */
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    /**
     * 测试业务层接口getAll
     */
    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
