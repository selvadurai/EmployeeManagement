package com.project.model;


public class Phone {
  private int    id;
  private String type;
  private String phoneNumber;
  private String areaCode;
  private int    ownerId;

  public void setId(int id){
	  this.id=id;
  }
  
  public int getId(){
	  return id;
  }

  public void setType(String type){
	  this.type=type;
  }
  
  public String getType(){
	  return type;
  }

  public void setPhoneNumber(String phoneNumber){
	  this.phoneNumber=phoneNumber;
  }
  
  public String getPhoneNumber(){
	  return phoneNumber;
  }


  public void setAreaCode(String areaCode){
	  this.areaCode=areaCode;
  }

  public String getAreaCode(){
	  return areaCode;
  }

  public void SetOwnerId(int ownerId){
	  this.ownerId=ownerId;
  }

  public int getOwnerId(){
	  return ownerId;
  }
}
