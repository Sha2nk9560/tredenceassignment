package com.aujas.bootwebapp.repository;

import com.aujas.bootwebapp.model.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepo extends JpaRepository<Shelf,Long> {
}
