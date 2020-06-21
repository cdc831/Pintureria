package net.sytes.canterosoft.pintureria.dao;

import net.sytes.canterosoft.pintureria.entity.Details_Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailsSalesDAO extends JpaRepository<Details_Sales, Integer> {
}
