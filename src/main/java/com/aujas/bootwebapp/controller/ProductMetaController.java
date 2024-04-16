package com.aujas.bootwebapp.controller;

import com.aujas.bootwebapp.dto.ProductMetaDTO;
import com.aujas.bootwebapp.model.ProductMeta;
import com.aujas.bootwebapp.service.ProductMetaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductMetaController {
    @Autowired
    private ProductMetaService service;
    @PostMapping("/create-product-meta-data")
    public ResponseEntity<ProductMetaDTO> createProductMeta(@RequestBody @Valid ProductMeta obj)
    {
        ProductMetaDTO resultObj = service.save(obj);
       return new ResponseEntity<ProductMetaDTO>(resultObj, HttpStatus.OK);


    }



}
