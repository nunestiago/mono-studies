package com.example.demo.init.module.category;

import com.example.demo.init.module.category.CategoryController.CategoryInput;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  private CategoryRepository categoryRepository;

  public CategoryEntity addCategory(CategoryInput category) {
    // TODO check if category already exists

    CategoryEntity categoryCreated =
      this.categoryRepository.save(new CategoryEntity(category.name()));
    return categoryCreated;
  }
}
