package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name="Coupons")
public class Coupons {
	
	
	@Id
	@GeneratedValue
	private String id;
    private String company;
    private String code;
    private String offer_details;
    private String price;
    
	public Coupons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coupons(String id, String company, String code, String offer_details, String price) {
		super();
		this.id = id;
		this.company = company;
		this.code = code;
		this.offer_details = offer_details;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOffer_details() {
		return offer_details;
	}

	public void setOffer_details(String offer_details) {
		this.offer_details = offer_details;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coupons [id=" + id + ", company=" + company + ", code=" + code + ", offer_details=" + offer_details
				+ ", price=" + price + "]";
	}

}
