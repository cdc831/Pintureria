package net.sytes.canterosoft.pintureria.dao;

import net.sytes.canterosoft.pintureria.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersDAO extends JpaRepository<Users, Integer> {
}
