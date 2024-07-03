package com.example.API_demo.services.impl;
import com.example.API_demo.services.cloudvendourservice;
import com.example.API_demo.model.vendour;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.API_demo.repository.vendour_Repostory;
@Service
public class vendourservice implements cloudvendourservice{
    vendour_Repostory vendour_Repostory;
    @Autowired
   public vendourservice(vendour_Repostory vendour_Repostory){
         this.vendour_Repostory = vendour_Repostory;
   }
    @Override
    public String createvendour(vendour vendourid) {
        vendour_Repostory.save(vendourid);
        return "vendour created";
    }
    @Override
    public vendour getvendour(String vendourid) {
        return vendour_Repostory.findById(vendourid).get();
    }
    @Override
    public String updatevendour(vendour vendourid) {
        vendour_Repostory.save(vendourid);
        return "vendour updated";
    }
    @Override
    public String deletevendour(String vendourid) {
        vendour_Repostory.deleteById(vendourid);
        return "vendour deleted";
    }
    @Override
    public List<vendour> getallvendour() {
        return vendour_Repostory.findAll();
    }

    

}
