package com.aujas.bootwebapp.repository;

import com.aujas.bootwebapp.model.ProductMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMetaRepository extends JpaRepository<ProductMeta,Long> {
}
