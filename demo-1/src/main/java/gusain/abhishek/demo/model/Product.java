package gusain.abhishek.demo.model;

import org.springframework.stereotype.Component;


@Component
public class Product {
	
	private Integer productId;
	private String productName;
	private Integer productPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String productName, Integer productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
 