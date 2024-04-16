package com.aujas.bootwebapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="product_meta_data")
public class ProductMeta {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long pmdId;


    @Column
    @NotBlank
    private String productId;
    @Column
    @NotBlank
    private String category;
    @Column
    @NotBlank
    private String brand;



}
