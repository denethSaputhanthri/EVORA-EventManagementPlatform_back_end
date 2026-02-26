package edu.icet.service.impl;

import edu.icet.model.Category;
import edu.icet.repository.CategoryRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.addCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.updateCategory(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.deleteCategory(id);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public Category searchCategoryByName(String name) {
        return categoryRepository.searchCategoryByName(name);
    }

    @Override
    public Category searchCategoryById(Integer id) {
        return categoryRepository.searchCategoryById(id);
    }
}
