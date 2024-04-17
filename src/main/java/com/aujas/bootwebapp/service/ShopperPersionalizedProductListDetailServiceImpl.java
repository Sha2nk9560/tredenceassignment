package com.aujas.bootwebapp.service;

import com.aujas.bootwebapp.dto.ProductMetaDTO;
import com.aujas.bootwebapp.model.ProductMeta;
import com.aujas.bootwebapp.model.Shelf;
import com.aujas.bootwebapp.model.ShopperPersionalizedProductListDetail;
import com.aujas.bootwebapp.repository.ProductMetaRepository;
import com.aujas.bootwebapp.repository.ShopperPersionalizedProductListDetailRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShopperPersionalizedProductListDetailServiceImpl implements ShopperPersionalizedProductListDetailService {
@Autowired
private ShopperPersionalizedProductListDetailRepo repo;
@Autowired
private ProductMetaRepository metaRepository;
@Autowired
   private  ModelMapper modelMapper;
    @Override
    @Transactional
    public ShopperPersionalizedProductListDetail save(ShopperPersionalizedProductListDetail obj) {
        List<Shelf> shelfList = new ArrayList<>();

obj.setShopperId(obj.getShopperId());
                    for(Shelf shelf:obj.getShelf())
                    {
                        Shelf obj1 = new Shelf();
                        obj1.setProductId(shelf.getProductId());
                        obj1.setRelevancyScore(shelf.getRelevancyScore());
                        obj1.setObj(obj);
                        shelfList.add(obj1);
                    }
             obj.setShelf(shelfList);

      return repo.save(obj);

    }

    @Override
    public List<ProductMetaDTO> findByShopperId(String shopperId) {
        List<ProductMetaDTO> listProductMetas = new ArrayList<>();
     ShopperPersionalizedProductListDetail obj = repo.findByShopperId(shopperId);
     if(obj != null)
     {
        for(Shelf ref :obj.getShelf())
        {

       ProductMeta productMeta =     metaRepository.findByProductId(ref.getProductId());
       if(productMeta != null)

       {
          listProductMetas.add(modelMapper.map(productMeta,ProductMetaDTO.class));


       }

        }

     }

        System.out.println("Size Of List Product Meta Data :"+listProductMetas.size());
        return listProductMetas;
    }


}
