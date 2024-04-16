package com.aujas.bootwebapp.controller;

import com.aujas.bootwebapp.model.ShopperPersionalizedProductListDetail;
import com.aujas.bootwebapp.service.ShopperPersionalizedProductListDetailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShopperPersonalizedPLController {
   @Autowired
    ShopperPersionalizedProductListDetailService service;
   @PostMapping("/create-shopper-product-list")
    public ResponseEntity<ShopperPersionalizedProductListDetail> createShopperProductInfo(@RequestBody @Valid ShopperPersionalizedProductListDetail obj)

    {

        ShopperPersionalizedProductListDetail resultObj = service.save(obj);

        return  new ResponseEntity<>(resultObj, HttpStatus.OK);

    }


}
