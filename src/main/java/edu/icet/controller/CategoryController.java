package edu.icet.controller;

import edu.icet.model.Category;
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
    public void addCategory(@RequestBody Category category){
        service.addCategory(category);
    }

    @PutMapping("/update")
    public void updateCategory(@RequestBody Category category){
        service.updateCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Integer id){
        service.deleteCategory(id);
    }

    @GetMapping("/search")
    public List<Category> getAllCategory(){
        return service.getAllCategory();
    }

    @GetMapping("/search-by-name/{name}")
    public Category searchCategoryByName(@PathVariable String name){
        return service.searchCategoryByName(name);
    }

    @GetMapping("/search-by-id/{userId}")
    public Category searchCategoryById(@PathVariable Integer userId){
        return service.searchCategoryById(userId);
    }


}
