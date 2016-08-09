package com.project.model;


public class Project {
  
  private int    id;
  private String type;
  private String name;
  private double budget;
  private int    leaderId;
	 
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
	
  
  public void setName(String name){
	  this.name=name;
  }
  
  public String getName(){
	  return name;
  }
	
  public void setBudget(double budget){
	  this.budget=budget;
  }
  
  public double getBudget(){
	  return budget;
  }
  
  public void setLeaderId(int leaderId){
	  this.leaderId=leaderId;
  }
  
  public int getLeaderId(){
	  return leaderId;
  }
}
