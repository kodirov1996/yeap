package ru.otus.yeap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.yeap.entities.Category;
import ru.otus.yeap.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll() {
        return (List<Category>) categoryRepository.findAll();
    }


    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category getById(Long id) {

        if (categoryRepository.findById(id).isPresent()) {
            return categoryRepository.findById(id).get();
        } else return null;
    }

    public boolean detele(Long id) {
        if (categoryRepository.findById(id).isPresent()) {
            categoryRepository.delete(getById(id));
            return true;
        } else return false;
    }



}
