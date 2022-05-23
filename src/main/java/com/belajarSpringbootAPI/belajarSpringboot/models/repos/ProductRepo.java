package com.belajarSpringbootAPI.belajarSpringboot.models.repos;

import com.belajarSpringbootAPI.belajarSpringboot.models.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.websocket.server.PathParam;
import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.nama = :nama")
    public Product findProductByName(@PathParam("nama") String nama);

    @Query("SELECT p FROM Product p WHERE p.nama LIKE :nama")
    public List<Product> findProductByNameLike(@PathParam("nama") String nama);

    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
    public List<Product> findProductByCategory(@PathParam("categoryId") Long categoryId);

}
