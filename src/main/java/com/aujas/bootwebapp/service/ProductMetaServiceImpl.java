package com.aujas.bootwebapp.service;

import com.aujas.bootwebapp.dto.ProductMetaDTO;
import com.aujas.bootwebapp.model.ProductMeta;
import com.aujas.bootwebapp.repository.ProductMetaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductMetaServiceImpl implements ProductMetaService{

   @Autowired
    private ProductMetaRepository repository;
   @Autowired
   ModelMapper modelMapper;
    @Override
    public ProductMetaDTO save(ProductMeta obj) {

        return modelMapper.map(repository.save(obj),ProductMetaDTO.class);

    }
}
