package com.aujas.bootwebapp.service;

import com.aujas.bootwebapp.model.Shelf;
import com.aujas.bootwebapp.model.ShopperPersionalizedProductListDetail;
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
    ModelMapper modelMapper;
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
}
