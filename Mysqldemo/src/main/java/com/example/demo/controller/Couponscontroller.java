package com.example.demo.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Couponsdao;
import com.example.demo.model.Coupons;
import com.example.demo.services.Couponservice;

@RestController
@RequestMapping("/Coupons")
public class Couponscontroller {
	
@Autowired	
private Couponsdao couponsdao;

private Couponservice couponserivce;

@Autowired
public Couponscontroller(Couponservice couponService) {
    this.couponserivce = couponService;
}
@GetMapping(value = "/list")
public Iterable<Couponsdao> getAllCoupons(){
    return Couponsdao.getAllCoupons();
}






}
