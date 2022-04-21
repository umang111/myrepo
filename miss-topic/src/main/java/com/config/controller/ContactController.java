package com.config.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactController {	
//	query path based api version
	@GetMapping(value="/api/contact/v1",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact() {
		return new Contact("tom",123); 
	}
	@GetMapping(value="/api/contact/v2",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact2 getContact2() {
		return new Contact2("tom",1233); 
	}
//	Querty/ Request/ parameter based api version
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v1")
	public Contact getContactQueryV1() {
		return new Contact("tom",123); 
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v2")
	public Contact2 getContactQueryV2() {
		return new Contact2("tom",1233); 
	}
//	Header parameter Based Api
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v1")
	public Contact getContactHeaderV1() 	{
		return new Contact("tom",123); 
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v2")
	public Contact2 getContactHeaderV2() {
		return new Contact2("tom",123); 
	}
//	contant negotiation based api
	@GetMapping(value="/api/contact",produces="application/contact.v1+json")
	public Contact getContactNegoV1() 	{
		return new Contact("tom",123); 
	}
	@GetMapping(value="/api/contact",produces="application/contact.v2+json")
	public Contact2 getContactNegoV2() 	{
		return new Contact2("tom",123);         
	}
}

class Contact{
	private String name;
	private int mobile;
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + "]";
	}
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	} 	
}

class Contact2{
	private String name;
	private int mobile2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile2() {
		return mobile2;
	}
	public void setMobile2(int mobile2) {
		this.mobile2 = mobile2;
	}
	@Override
	public String toString() {
		return "Contact2 [name=" + name + ", mobile2=" + mobile2 + "]";
	}
	public Contact2(String name, int mobile2) {
		super();
		this.name = name;
		this.mobile2 = mobile2;
	}
	public Contact2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


