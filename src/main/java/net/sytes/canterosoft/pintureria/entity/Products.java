package net.sytes.canterosoft.pintureria.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "tbl_product")
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_product;
    private String product;
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_details")
    private Details_Sales details_sales;
}
