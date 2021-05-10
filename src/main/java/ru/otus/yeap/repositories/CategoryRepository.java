package ru.otus.yeap.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.yeap.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
