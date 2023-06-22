package com.ecommerce.microcommerce.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

     @GetMapping ("/Produits")
    public String listsProduits (){
         return "my product";
     }

     @GetMapping("/Produits/{id}")
    public String afficherUnProduit(@PathVariable int id){
         return "voici le produit avec l'id " + id;
     }
}
