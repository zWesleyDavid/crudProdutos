package com.crud.demo.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "TBL_PRODUCT")
@Data
@NoArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    private String name;

    @NotBlank(message = "A descrição do produto é obrigatória")
    private String description;

    @NotNull(message = "O preço do produto é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    private BigDecimal price;

    @NotNull(message = "A quantidade em estoque é obrigatória")
    @Positive(message = "A quantidade deve ser maior que zero")
    private Integer stockQuantity;

    @NotBlank(message = "A categoria do produto é obrigatória")
    private String category;
}