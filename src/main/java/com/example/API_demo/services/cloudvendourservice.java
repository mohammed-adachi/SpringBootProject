package com.example.API_demo.services;
import java.util.List;

import com.example.API_demo.model.vendour;
public interface cloudvendourservice {
    public String createvendour(vendour vendourid);
    public vendour getvendour(String vendourid);
    public String updatevendour(vendour vendourid);
    public String deletevendour(String vendourid);
    public List<vendour> getallvendour();   

    

}
