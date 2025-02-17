package com.telusko.simpleWebApp.service;
import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    // As we are created Object of ProductRepo interface we can use all the methods of JpaRepository
    // JpaRepository is the interface which is having all the methods to perform the CRUD operations
    // this interface is extending the JpaRepository
    // this is the interface implemented by class and that all spring will manage
    // and we need to use that it interface with direct object creation


//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 500000),
//            new Product(102, "canon camera", 700000),
//            new Product(103, "mic", 10000)
//    )
//    );



    public List<Product> getProduct(){
       return repo.findAll();

    }

    public Product getProductById(int prodId) {

        return repo.findById(prodId).orElse(new Product());
    }



    public void addProduct(Product prod) {
     repo.save(prod);// this save method is used to insert the data

    }

    public void updateProduct(Product prod) {
repo.save(prod);
// this save method is used to update the data
// save method is used to insert and update the data
        // if the data is already present then it will update the data
        // if the data is not present then it will insert the data
          //  }
        }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
            }
        }

