package net.sytes.canterosoft.pintureria.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_details_sales")
public class Details_Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_details;
    private Integer quantity;
    private Double price_product;
    private Double total_price;

    @OneToMany(mappedBy = "id_sales")
    private List<Sales> sales;

    @OneToMany(mappedBy = "id_product")
    private List<Products> products;
}
