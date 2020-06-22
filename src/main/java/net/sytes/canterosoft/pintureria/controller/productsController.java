package net.sytes.canterosoft.pintureria.controller;

import lombok.extern.java.Log;
import net.sytes.canterosoft.pintureria.entity.Products;
import net.sytes.canterosoft.pintureria.service.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@Log
public class productsController {

    @Autowired
    ProductsServiceImpl productsServiceImpl;

    @GetMapping("/formNuevoPedido")
    public String formNuevoPedido(Model model){
        List<Products> listaProductos = productsServiceImpl.listarProductos();
//        for (Products products: listaProductos) {
//            log.info(products.getId_product() + " " + products.getProduct() + " " + products.getPrice());
//        }
        model.addAttribute("listaDeProductos",listaProductos);
        return "frmNuevoPedido";
    }

    @GetMapping("/formNuevoPedido/{id}")
    public String formNuevoPedido(@PathVariable(name = "id") Integer id, Model model){

        return "frmNuevoPedido";
    }
}
