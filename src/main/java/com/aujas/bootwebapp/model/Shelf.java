package com.aujas.bootwebapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "shelf")
@Data
public class Shelf {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long shelfId;
@Column

        private String productId;
@Column
    private Double relevancyScore;
@JsonIgnore
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id")
    private ShopperPersionalizedProductListDetail obj;



}
