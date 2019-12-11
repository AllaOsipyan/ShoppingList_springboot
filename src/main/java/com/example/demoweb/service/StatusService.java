package com.example.demoweb.service;

import com.example.demoweb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    PurchasesService purchasesService;
    public boolean changeStatus(int purchaseId){
       Product product = purchasesService.listOfPurchases().get(purchaseId);
        product.setIsBought(!product.getIsBought());
        product.setStatus((product.getIsBought())?"☑":"☐");
        return product.getIsBought();
    }
}
