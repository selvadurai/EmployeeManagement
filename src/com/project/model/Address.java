package com.project.model;

public class Address {
	private int     id;
	private String  street;
	private String  city;
    private String  provience;
    private String  country;
    private String  postcode;

    public Address(){
    	
    }

    public void setId(int id){
    	this.id=id;
    }

    public int getId(){
    	return id;
    }
    
    public void setStreet(String street){
    	this.street=street;
    }

    public String getStreet(){
    	return street;
    }


    public void setCity(String city){
    	this.city=city;
    }
    
    public String getCity(){
    	return city;
    }

    public void setProvience(String provience){
    	this.provience=provience;
    }
    
    public String getProvience(){
        return provience;
    }

    public void setCountry(String country){
    	this.country=country;
    }

    public String getCountry(){
    	return country;
    }

    public void setPostCode(String postcode){
    	this.postcode=postcode;
    }
  
    public String getPostCode(){
    	return postcode;
    }
}
