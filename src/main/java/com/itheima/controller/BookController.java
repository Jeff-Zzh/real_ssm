package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//== @Controller + @ResponseBody
@RequestMapping("/books")
public class BookController {
    //要调业务层接口，依赖注入DI，自动装配
    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {//形参从请求体的json数据中得对象
        return bookService.save(book);//业务层逻辑：保存成功会返回true
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
