package gusain.abhishek.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gusain.abhishek.demo.model.Product;
import gusain.abhishek.demo.respository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	
	private List<Product> products = new ArrayList<>();
	{
		products.add(new Product(1001, "Iphone 16 ", 80000));
        products.add(new Product(1002, "Macbook M3 Pro", 170000));
	}
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	public Product getProduct(Integer productId) {
		return repo.findById(productId).orElse(null);
	}
	public String deleteProduct(Integer productId) {
		try {
			repo.deleteById(productId);
			return "deleted product with id: "+productId;
		}catch(Exception e) {
			e.printStackTrace();
			return "cannot be deleted";
		}
	}
	
	public Product updateProduct(Product product) {
		return repo.save(product);
	}
}
