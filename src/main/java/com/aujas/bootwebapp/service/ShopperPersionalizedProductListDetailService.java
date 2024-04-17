package com.aujas.bootwebapp.service;

import com.aujas.bootwebapp.dto.ProductMetaDTO;
import com.aujas.bootwebapp.model.ProductMeta;
import com.aujas.bootwebapp.model.ShopperPersionalizedProductListDetail;

import java.util.List;

public interface ShopperPersionalizedProductListDetailService {

    public ShopperPersionalizedProductListDetail save(ShopperPersionalizedProductListDetail obj);
    public List<ProductMetaDTO> findByShopperId(String shopperId);
}
