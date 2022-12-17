package com.edu.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Change The Table Name
@Table(name="product_tab")

public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private int productId;
	@Column(name="pname",length = 40,nullable=false)
	private String productName;
	@Column(name="pprice",nullable=false)
	private float productprice;
	
	public product() {
		super();
	}

	public product(int productId, String productName, float productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductprice() {
		return productprice;
	}

	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", productprice=" + productprice
				+ "]";
	}
	
}
