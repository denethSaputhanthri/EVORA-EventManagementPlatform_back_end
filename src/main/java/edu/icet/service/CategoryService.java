package edu.icet.service;

import edu.icet.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    void addCategory(CategoryDto categoryDto);
    void updateCategory(CategoryDto categoryDto);
    void deleteCategory(Integer id);
    List<CategoryDto> getAllCategory();
    CategoryDto searchCategoryByName(String name);
    CategoryDto searchCategoryById(Integer id);
}
