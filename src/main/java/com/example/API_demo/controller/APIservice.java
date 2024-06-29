package com.example.API_demo.controller;
import com.example.API_demo.model.vendour;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api")
public class APIservice {
     @GetMapping("{vendourid}")
    public vendour getvendourdetail(String vendourid) {
       
        return new vendour(vendourid, "vendour name", "vendour adress", "vendour phone");
    }
    


}
