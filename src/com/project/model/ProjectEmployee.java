package com.project.model;

public class ProjectEmployee {
  
   private int projectId;
   private int employeeId;
   
   public void setProjectId(int projectId){
	   this.projectId=projectId;
   }
		  
   public int getProjectId(){
		return projectId;
   }  
 
   public void setEmployeedId(int employeeId){
	   this.employeeId=employeeId;
   }

   public int getEmployeeId(){
	   return employeeId;
   }


}
