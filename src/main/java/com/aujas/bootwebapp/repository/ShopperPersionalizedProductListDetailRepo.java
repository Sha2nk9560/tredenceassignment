package com.aujas.bootwebapp.repository;

import com.aujas.bootwebapp.model.ShopperPersionalizedProductListDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopperPersionalizedProductListDetailRepo extends JpaRepository<ShopperPersionalizedProductListDetail,Long> {

public ShopperPersionalizedProductListDetail findByShopperId(String shopperId);

}
