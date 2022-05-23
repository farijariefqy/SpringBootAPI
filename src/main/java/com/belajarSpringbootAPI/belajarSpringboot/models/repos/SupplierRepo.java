package com.belajarSpringbootAPI.belajarSpringboot.models.repos;

import com.belajarSpringbootAPI.belajarSpringboot.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier,Long> {

}
