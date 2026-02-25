package edu.icet.service.impl;

import edu.icet.model.Category;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(Integer id) {

    }

    @Override
    public List<Category> getAllCategory() {
        return List.of();
    }

    @Override
    public Category searchCategoryByName(String name) {
        return null;
    }

    @Override
    public Category searchCategoryById(Integer id) {
        return null;
    }
}
