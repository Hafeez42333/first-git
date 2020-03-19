package com.hbs.productinfo;

import java.io.Serializable;

public class ProductInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private int prodId;
	private String prodName;
	private String prodLocation;
	
	
	public ProductInfo(int prodId, String prodName, String prodLocation) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodLocation = prodLocation;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdLocation() {
		return prodLocation;
	}
	public void setProdLocation(String prodLocation) {
		this.prodLocation = prodLocation;
	}
	@Override
	public String toString() {
		return "ProductInfo [prodId=" + prodId + ", prodName=" + prodName + ", prodLocation=" + prodLocation + "]";
	}
	

}
