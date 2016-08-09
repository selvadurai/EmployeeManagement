package com.project.model;


public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private double salary;
  private String startDate;
  private String endDate;
  private int    managerId;
  private int    addressId;
 
  public void setId(int id){
	  this.id=id;
  }
  
  public int getId(){
	  return id;
  }
  
  public void setFirstName(String firstName){
	  this.firstName=firstName;
  }
  
  public String getFirstName(){
	  return firstName;
  }
  
  public void setLastName(String lastName){
	  this.lastName=lastName;
  }

 public String getLastName(){
	 return lastName;
 }


public void setSalary(double salary){
	this.salary=salary;
}


public double getSalary(){
	return salary;
}


public void setStartDate(String startDate){
   this.startDate=startDate;
}

public String getStartDate(){
	return startDate;
}


public void setEndDate(String endDate){
	   this.endDate=endDate;
}

public String getEndDate(){
		return endDate;
}


public void setManagerId(int managerId){
	this.managerId=managerId;
}

public int getManagerId(){
	return managerId;
}


public void SetAddressId(int addressId){
	this.addressId=addressId;
}

public int getAdressId(){
	return addressId;
}


}
