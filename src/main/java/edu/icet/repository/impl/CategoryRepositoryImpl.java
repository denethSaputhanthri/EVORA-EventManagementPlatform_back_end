package edu.icet.repository.impl;

import edu.icet.model.Category;
import edu.icet.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void addCategory(Category category) {
        String sql = "INSERT INTO category VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,
                category.getId(),
                category.getName());
    }

    @Override
    public void updateCategory(Category category) {
        String sql = "UPDATE category SET name = ? WHERE category_id = ?";
        jdbcTemplate.update(sql,
                category.getName(),
                category.getId());
    }

    @Override
    public void deleteCategory(Integer id) {
        String sql = "DELETE FROM category WHERE category_id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Category> getAllCategory() {
        String sql = "SELECT * FROM category";
        return jdbcTemplate.query(sql,(rs, rowNum) ->{
            Category category = new Category();
            category.setId(rs.getInt(1));
            category.setName(rs.getString(2));
            return category;
        });
    }

    @Override
    public Category searchCategoryByName(String name) {
        String sql = "SELECT * FROM category WHERE name = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) ->{
            Category category = new Category();
            category.setId(rs.getInt(1));
            category.setName(rs.getString(2));
            return category;
        },name);
    }

    @Override
    public Category searchCategoryById(Integer id) {
        String sql = "SELECT * FROM category WHERE category_id = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) ->{
            Category category = new Category();
            category.setId(rs.getInt(1));
            category.setName(rs.getString(2));
            return category;
        },id);
    }


}
