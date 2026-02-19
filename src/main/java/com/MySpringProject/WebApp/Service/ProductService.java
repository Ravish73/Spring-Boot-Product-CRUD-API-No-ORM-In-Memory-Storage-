package com.MySpringProject.WebApp.Service;

import com.MySpringProject.WebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService
{
    List<Product> Products = new ArrayList<>(Arrays.asList(
            new Product(101 ,"Iphone" , 473874)
            , new Product(102,"Samsung Galaxy", 70000)
            , new Product(103 ,"Ipad ", 57908)
            ,new Product(104,"Headphone",55000)
            ,new Product(105,"Mackbook",45852)));
public List<Product> getProduct(){
    return  Products;
}

    public Product getProductById(int prodId)
    {
        return Products.stream()
                .filter(p-> p.getProdId() == prodId)
                .findFirst().orElse(new Product(0,"No Item",0));

    }

    public  void  addproduct(Product prod){

    Products.add(prod);


    }

    public void updatePro(Product Prod)
    {      int index=0;
        for (int i=0;i< Products.size();i++)
      {
          if (Products.get(i).getProdId()== Prod.getProdId())
          {

              index =i;
              Products.set(index,Prod);
          }
      }
    }

    public void Delete(int prod)
    {
        int index=0;
        for (int i=0;i< Products.size();i++)
        {
            if (Products.get(i).getProdId()== prod)
            {

                index =i;
            }
        }
        Products.remove(index);
    }
}
