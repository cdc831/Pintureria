package net.sytes.canterosoft.pintureria.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_sales")
@Data
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sales;
    private String canceled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_details")
    private Details_Sales details_sales;
}
