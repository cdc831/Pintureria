package net.sytes.canterosoft.pintureria.dao;

import net.sytes.canterosoft.pintureria.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalesDAO extends JpaRepository<Sales, Integer> {
}
