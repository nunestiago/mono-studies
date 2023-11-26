package com.example.demo.module.category;

import com.example.demo.module.category.CategoryController.CategoryInput;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public CategoryEntity addCategory(CategoryInput category) {
    // TODO check if category already exists

    List<CategoryEntity> categoryFound =
      this.categoryRepository.findByName(category.name());
    CategoryEntity categoryCreated =
      this.categoryRepository.save(new CategoryEntity(category.name()));
    return categoryCreated;
  }
}
