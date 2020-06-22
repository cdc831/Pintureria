package net.sytes.canterosoft.pintureria.service;

import net.sytes.canterosoft.pintureria.dao.IProductsDAO;
import net.sytes.canterosoft.pintureria.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements IProductService{

    @Autowired
    IProductsDAO iProductsDAO;

    @Override
    public List<Products> listarProductos() {
        return iProductsDAO.findAll();
    }

    @Override
    public Products listarPorId(Integer id) {
        return null;
    }

    @Override
    public Products guardarProducto(Products products) {
        return null;
    }

    @Override
    public Products modificarProducto(Products products) {
        return null;
    }

    @Override
    public void eliminarPorducto(Integer id) {

    }
}
