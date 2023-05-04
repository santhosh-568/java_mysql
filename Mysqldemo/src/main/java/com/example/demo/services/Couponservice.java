package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Couponsdao;
import com.example.demo.model.Coupons;


@Service
public class Couponservice {
	
	@Autowired
	private Couponsdao couponsdao;
	
	
	public List<Coupons> findBycompany(String company)
	{
	   return Couponsdao.findBycompany(company);
	}

	public Iterable<Couponsdao> getAllCoupons() {
        return couponsdao.findAll();
	}

	public Coupons addCoupons(Couponsdao coupon) {
		couponsdao.save(coupon);
        return (Coupons) coupon;
		// TODO Auto-generated method stub
		
	}

	public   String deleteoupons(String id) {
		couponsdao.deleteById(id);
        return "coupon with id = "+ id +" deleted successfully";
		
	}

	public  Coupons updateCoupon(Coupons coupon, String id) {
		return (Coupons) couponsdao.save(couponsdao);
		 
	}
	
	

}
