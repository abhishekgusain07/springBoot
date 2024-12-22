package gusain.abhishek.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import gusain.abhishek.demo.model.Product;

@Service
public class ProductService {
	
	private List<Product> products = new ArrayList<>();
	{
		products.add(new Product(1001, "Iphone 16 ", 80000));
        products.add(new Product(1002, "Macbook M3 Pro", 170000));
	}
	
	public List<Product> getProducts(){
		return products;
	}
	public Product addProduct(Product product) {
		this.products.add(product);
		return product;
	}
	public Product getProduct(Integer productId) {
		for(Product product : products) {
			if(product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;
	}
	public String deleteProduct(Integer productId) {
		for(Product product : products) {
			if(product.getProductId().equals(productId)) {
				products.remove(product);
				return "product deleted";
			}
		}
		return "could not find product with productId: "+productId;
	}
	
	public Product updateProduct(Product product) {
		for(Product prod : products) {
			if(prod.getProductId().equals(product.getProductId())) {
				prod.setProductName(product.getProductName());
				prod.setProductPrice(product.getProductPrice());
				
				return prod;
			}
		}
		return null;
	}
}
