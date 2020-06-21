package net.sytes.canterosoft.pintureria.service;

import net.sytes.canterosoft.pintureria.dao.IUsersDAO;
import net.sytes.canterosoft.pintureria.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUsersService{

    @Autowired
    IUsersDAO iUsersDAO;

    @Override
    public List<Users> listarUsuarios() {
        return iUsersDAO.findAll();
    }

    @Override
    public Users listarPorId(Integer id) {
        return iUsersDAO.findById(id).get();
    }

    @Override
    public Users guardarUsuario(Users users) {
        return iUsersDAO.save(users);
    }

    @Override
    public Users actualizarUsuario(Users users) {
        return iUsersDAO.save(users);
    }

    @Override
    public void eliminarUsuario(Integer id) {
        iUsersDAO.deleteById(id);
    }
}
