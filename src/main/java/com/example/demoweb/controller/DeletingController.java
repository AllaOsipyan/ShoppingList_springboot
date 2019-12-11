package com.example.demoweb.controller;

import com.example.demoweb.model.Product;
import com.example.demoweb.service.PurchasesService;
import com.example.demoweb.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeletingController {

    @Autowired
    PurchasesService purchasesService;
    Product product;
    @ResponseBody
    @RequestMapping(path = "/purchase/{id}/delete", method = RequestMethod.POST)
    public void makeDelete(@PathVariable("id") int id) {
        purchasesService.delete(id);
    }
}
