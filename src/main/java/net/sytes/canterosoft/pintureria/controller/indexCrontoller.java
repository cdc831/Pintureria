package net.sytes.canterosoft.pintureria.controller;

import lombok.extern.java.Log;
import net.sytes.canterosoft.pintureria.entity.Products;
import net.sytes.canterosoft.pintureria.service.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.function.Supplier;

@Controller
@Log
public class indexCrontoller {

    @Autowired
    ProductsServiceImpl productsServiceImpl;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("titulo", "Login");
        return "login";
    }

    @GetMapping({"/index","/","/home"})
    public String index(Model model){
        List<Products> listaProductos = productsServiceImpl.listarProductos();
        model.addAttribute("listaDeProductos",listaProductos);
        return "index";
    }

    @GetMapping("/gestionUsers")
    public String gestionUsers(){
        return "gestionUsers";
    }

    @GetMapping("/gestionStock")
    public String gestionStock(){
        return "gestionStock";
    }


}
