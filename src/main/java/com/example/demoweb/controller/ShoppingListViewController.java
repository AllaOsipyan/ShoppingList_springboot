package com.example.demoweb.controller;


import com.example.demoweb.service.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ShoppingListViewController {
    @Autowired
    PurchasesService purchasesService;
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("purchases", purchasesService.listOfPurchases());
        return "shoppingList";
    }




}
