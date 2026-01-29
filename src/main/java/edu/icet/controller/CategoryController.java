package edu.icet.controller;

import edu.icet.dto.CategoryDto;
import edu.icet.service.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Category")
@Tag(name = "Category-Controller" , description = "Category API Collection")

public class CategoryController {

    final CategoryService service;

    @PostMapping("/add")
    public void addCategory(@RequestBody CategoryDto categoryDto){
        service.addCategory(categoryDto);
    }

    @PutMapping("/update")
    public void updateCategory(@RequestBody CategoryDto categoryDto){
        service.updateCategory(categoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Integer id){
        service.deleteCategory(id);
    }

    @GetMapping("/search")
    public List<CategoryDto> getAllCategory(){
        return service.getAllCategory();
    }

    @GetMapping("/search-by-name/{name}")
    public CategoryDto searchCategoryByName(@PathVariable String name){
        return service.searchCategoryByName(name);
    }

    @GetMapping("/search-by-id/{userId}")
    public CategoryDto searchCategoryById(@PathVariable Integer userId){
        return service.searchCategoryById(userId);
    }


}
