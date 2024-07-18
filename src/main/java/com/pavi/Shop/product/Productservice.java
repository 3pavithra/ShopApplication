package com.pavi.Shop.product;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.pavi.Shop.orders.OrderRepo;


@Service
public class Productservice {
    @Autowired
    private Productdao dao;

    @Autowired 
    private OrderRepo orderRepo;

    public Productdto saveServiceProduct(Productdto productdto){
        // Optional<Orderdto> order = orderRepo.findById(order_id);
        // productdto.setOrders(order.orElse(null));
        // productdto.setOrders(order_id);
    //  String productName = productdto.getName();
    //     List<Productdto> list= dao.findbyallname(productName);
    //     if (!list.isEmpty()) {           
    //         System.out.println(productName+" already exists");
    //     }else{
    //         System.out.println(productName+" not exists");
    //           return dao.saveDaoProduct(productdto);
    //     }  
        return dao.saveDaoProduct(productdto);
     }       
    
    public List<Productdto> AllProductservice(){
        return dao.GetAllProduct();
    }
  
    public List<Productdto> findbynameProductService(String name){
        return dao.findbyallname(name);
    }
    public Optional<Productdto> getbyId(int id){
        
        return dao.getbyId(id);
    }
}
