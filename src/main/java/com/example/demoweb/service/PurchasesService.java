package com.example.demoweb.service;

import com.example.demoweb.model.Product;
import com.example.demoweb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PurchasesService {
    static ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(new Product(0,"Помидоры"),
                                                              new Product(1,"Огурцы"),
                                                              new Product(2,"Капуста")));

    public void create(String text) {
        products.add(new Product(Integer.valueOf(products.get(products.size()-1).getId())+1,text));
    }

    public void delete(int id){
        products.remove(id);
    }
    public ArrayList<Product> listOfPurchases(){
        return products;
    }
}
