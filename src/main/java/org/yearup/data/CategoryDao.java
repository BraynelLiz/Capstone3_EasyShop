package org.yearup.data;

import org.yearup.models.Category;

import java.util.List;

public interface CategoryDao
{
    List<Category> getAllCategories();
    Category getById(int categoryId);
    Category create(Category category);
    void update(int categoryId, Category category);
    void delete(int categoryId);

    List<Category> getAll();

    Category getById(Long id);

    void update(Long id, Category cat);

    void delete(Long id);
}
