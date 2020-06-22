package net.sytes.canterosoft.pintureria.service;

import net.sytes.canterosoft.pintureria.entity.Products;

import java.util.List;

public interface IProductService {
    public List<Products> listarProductos();
    public Products listarPorId(Integer id);
    public Products guardarProducto(Products products);
    public Products modificarProducto(Products products);
    public void eliminarPorducto(Integer id);
}
