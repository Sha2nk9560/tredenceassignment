package com.aujas.bootwebapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@Entity
@Table(name="shopperproductinfo")

public class ShopperPersionalizedProductListDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column
    @NotBlank
    private String shopperId;


@OneToMany(mappedBy = "obj",cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private List<Shelf> shelf;



}
