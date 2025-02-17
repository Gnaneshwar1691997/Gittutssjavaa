package com.telusko.simpleWebApp.repository;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    //Product means Class name we are working the  and the Interger is for primary key ..
    // for what data we are keeping primary key tha tdata type we keep here
    //this is the interface which is extending the JpaRepository
    //JpaRepository is the interface which is having all the methods to perform the CRUD operations


}
