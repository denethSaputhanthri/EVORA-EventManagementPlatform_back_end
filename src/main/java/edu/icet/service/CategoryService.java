package edu.icet.service;

import edu.icet.model.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Integer id);
    List<Category> getAllCategory();
    Category searchCategoryByName(String name);
    Category searchCategoryById(Integer id);
}
