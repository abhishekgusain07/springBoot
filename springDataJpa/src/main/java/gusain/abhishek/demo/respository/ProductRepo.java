package gusain.abhishek.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gusain.abhishek.demo.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
