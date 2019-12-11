package com.example.demoweb.controller;
import com.example.demoweb.service.PurchasesService;
import com.example.demoweb.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class StatusController {

        @Autowired
        StatusService statusService;
        @ResponseBody
        @RequestMapping(path = "/purchase/{id}/status", method = RequestMethod.POST)
        public boolean makeStatus(@PathVariable("id") int id) {
            boolean isBought = statusService.changeStatus(id);
            return  isBought;
        }


}
