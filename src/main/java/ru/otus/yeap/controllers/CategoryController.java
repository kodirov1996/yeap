package ru.otus.yeap.controllers;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.otus.yeap.entities.Category;
import ru.otus.yeap.repositories.CategoryRepository;
import ru.otus.yeap.services.CategoryService;
import ru.otus.yeap.template.ResponseData;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("rest/category")
public class CategoryController {


    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public ResponseData<List<Category>> getAll() {
        return new ResponseData(categoryService.getAll());
    }


    @PostMapping("/save")
    public ResponseData save(@RequestBody Category category) {
        categoryService.save(category);
        return new ResponseData(HttpStatus.OK);
    }

    @GetMapping("delete/{id}")
    public ResponseData deleteById(@PathVariable("id") Long id) {

        if (categoryService.detele(id) == true)
            return new ResponseData(HttpStatus.OK);
        else return new ResponseData(HttpStatus.BAD_REQUEST);

    }
}
