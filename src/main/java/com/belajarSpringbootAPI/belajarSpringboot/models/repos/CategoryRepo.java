package com.belajarSpringbootAPI.belajarSpringboot.models.repos;

import com.belajarSpringbootAPI.belajarSpringboot.models.entities.Category;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface CategoryRepo extends CrudRepository<Category,Long> {
}
