package edu.icet.service.impl;

import edu.icet.dto.CategoryDto;
import edu.icet.entity.CategoryEntity;
import edu.icet.repository.CategoryRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository repository;

    final ModelMapper mapper;

    @Override
    public void addCategory(CategoryDto categoryDto) {
        repository.save(mapper.map(categoryDto, CategoryEntity.class));
    }

    @Override
    public void updateCategory(CategoryDto categoryDto) {
        repository.save(mapper.map(categoryDto, CategoryEntity.class));
    }

    @Override
    public void deleteCategory(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public List<CategoryDto> getAllCategory() {
        List<CategoryEntity> entityList = repository.findAll();
        List<CategoryDto> dtoList = new ArrayList<>();

        entityList.forEach(categoryEntity -> {
            dtoList.add(mapper.map(categoryEntity, CategoryDto.class));
        });
        return dtoList;
    }

    @Override
    public CategoryDto searchCategoryByName(String name) {
        return mapper.map(repository.findByname(name), CategoryDto.class);
    }

    @Override
    public CategoryDto searchCategoryById(Integer id) {
        return mapper.map(repository.findByid(id), CategoryDto.class);
    }
}
