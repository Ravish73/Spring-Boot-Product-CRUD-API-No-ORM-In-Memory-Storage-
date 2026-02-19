package com.MySpringProject.WebApp.Controller;

import com.MySpringProject.WebApp.Model.Product;
import com.MySpringProject.WebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/Products")
      public List<Product> getProducts(){

        return service.getProduct();
    }

@GetMapping("/Products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return  service.getProductById(prodId);
    }
    @PostMapping("/Products")
    public void Addprod(@RequestBody Product prod){

        System.out.println(prod);
        service.addproduct(prod);

    }
    @PutMapping("/Products")
    public void updatePro( @RequestBody Product prod)
    {
        service.updatePro(prod);
    }
 @DeleteMapping("/Products/{ProdId}")
    public void delete(@PathVariable int ProdId)
    {
        service.Delete(ProdId);
    }
}
