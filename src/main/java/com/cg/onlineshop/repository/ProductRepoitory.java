package com.cg.onlineshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.onlineshop.entities.Product;
public interface ProductRepoitory extends  JpaRepository<Product, Integer>{}