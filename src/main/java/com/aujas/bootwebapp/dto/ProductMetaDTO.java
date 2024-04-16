package com.aujas.bootwebapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class ProductMetaDTO {

@JsonIgnore
private Long pmdId;



    private String productId;

    private String category;

    private String brand;



}
