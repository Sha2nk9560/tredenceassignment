package com.aujas.bootwebapp.controller;

import com.aujas.bootwebapp.dto.ProductMetaDTO;
import com.aujas.bootwebapp.model.ProductMeta;
import com.aujas.bootwebapp.service.ShopperPersionalizedProductListDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductsByShopperController {
@Autowired
   private  ShopperPersionalizedProductListDetailService service;

    @GetMapping("/get-productsby-shopperid/{shopperid}")
    public List<ProductMetaDTO> getShopperProducts(@PathVariable String shopperid)
    {
return service.findByShopperId(shopperid);



    }

}
