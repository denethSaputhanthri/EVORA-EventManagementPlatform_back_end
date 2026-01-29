package edu.icet.repository;

import edu.icet.dto.CategoryDto;
import edu.icet.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
    CategoryDto findByid(Integer id);
    CategoryDto findByname(String name);
}
