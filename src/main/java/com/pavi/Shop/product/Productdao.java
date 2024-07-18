package com.pavi.Shop.product;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Productdao {
    @Autowired
    private ProductRepo productRepo;

    public Productdto saveDaoProduct(Productdto a) {
        return productRepo.save(a);
    }

    public List<Productdto> GetAllProduct() {
        return productRepo.findAll();
    }

    @Autowired
    private EntityManager entityManager;

    public List<Productdto> findbyallname(String name) {
        Query q = entityManager.createQuery("select a from Productdto a where a.name=?1");
        q.setParameter(1, name);
        return q.getResultList();
    }
    public Optional<Productdto> getbyId(int id){
        return productRepo.findById(id);
    }

}
