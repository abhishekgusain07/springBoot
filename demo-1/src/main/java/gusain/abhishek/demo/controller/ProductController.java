package gusain.abhishek.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.awt.Window.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gusain.abhishek.demo.service.ProductService;
import gusain.abhishek.demo.model.Product;


@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		Product updatedProduct = service.addProduct(product);
		return updatedProduct;
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable String id) {
	    try {
	        Integer productId = Integer.parseInt(id);
	        Product p = service.getProduct(productId);
	        if (p != null) {
	            return ResponseEntity.ok(p);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    } catch (NumberFormatException e) {
	        return ResponseEntity.badRequest().body(null); // or handle it in another way
	    }
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable String id) {
		try {
			Integer productId = Integer.parseInt(id);
	        return service.deleteProduct(productId);
		}catch(Exception e) {
			e.printStackTrace();
			return "some error occured";
		}
	}
	
	@PatchMapping("/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		try {
			Product updatedProduct = service.updateProduct(product);
			if(updatedProduct != null) {
				return ResponseEntity.ok(updatedProduct);
			} else {
				return ResponseEntity.notFound().build();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
