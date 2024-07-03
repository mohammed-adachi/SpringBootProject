package com.example.API_demo.controller;
import com.example.API_demo.model.vendour;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.API_demo.services.cloudvendourservice;

@RestController
@RequestMapping("/vendour")
public class APIserviceController {
     cloudvendourservice cloudvendourservice;
     
    public  APIserviceController(cloudvendourservice cloudvendourservice){
        this.cloudvendourservice = cloudvendourservice;}
    
     @GetMapping("/{vendourid}")
    public vendour getvendourdetail (@PathVariable("vendourid") String vendourid) {
       
        return cloudvendourservice.getvendour(vendourid);
    }
    @GetMapping
  public List<vendour> getallvendour() {
      return cloudvendourservice.getallvendour();
  }
    @PostMapping
    public String createvendour(@RequestBody vendour vendourid) {
        return cloudvendourservice.createvendour(vendourid);
    }
    @PutMapping
    public String updatevendour(@RequestBody vendour vendourid) {
        return cloudvendourservice.updatevendour(vendourid);
    }
    @DeleteMapping("{vendourid}")
    public String deletevendour(@PathVariable("vendourid") String vendourid) {
        return cloudvendourservice.deletevendour(vendourid);
    }
}
