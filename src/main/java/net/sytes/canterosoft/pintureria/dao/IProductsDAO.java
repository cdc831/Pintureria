package net.sytes.canterosoft.pintureria.dao;

import net.sytes.canterosoft.pintureria.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductsDAO extends JpaRepository<Products, Integer> {
}
