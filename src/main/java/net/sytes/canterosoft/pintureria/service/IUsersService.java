package net.sytes.canterosoft.pintureria.service;

import net.sytes.canterosoft.pintureria.entity.Users;

import java.util.List;

public interface IUsersService {

    public List<Users> listarUsuarios();
    public Users listarPorId(Integer id);
    public Users guardarUsuario(Users users);
    public Users actualizarUsuario(Users users);
    public void eliminarUsuario(Integer id);
}
