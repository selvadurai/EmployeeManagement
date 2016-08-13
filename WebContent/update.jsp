<%@page import="com.project.model.*" %>
<%@page import="java.util.*" %>
<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>

<%  
    Employee employee =(Employee) request.getAttribute( "employee");
    Address  address =(Address) request.getAttribute( "address");
    Phone    phone =(Phone) request.getAttribute( "phone");

 %> 

 <%EmployeeDoa empDoa=new EmployeeDoa();
     	    empDoa.open();
     	    List<Employee>emplist=empDoa.CreateEmployeeList();
     	    empDoa.close();%>   


<body>

  <nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li ><a href="home.jsp">Home</a></li>
      <li class="active"><a href="employee.jsp">Add Employee</a></li>
      <li><a href="search.jsp">Search Employee</a></li>
      <li ><a href="project.jsp">Add Project</a></li>
    </ul>
  </div>
</nav>


<div class="container">

<form action="UpdateController" method="GET"  role="form" > 

          <input name="emp" type="hidden" value=<%out.println(employee.getId()); %> > 
 
         
         <fieldset class="form-group row"> 
          	<div class="col-sm-3">
             	 	<label "col-sm-1 form-control-label" for="fname"> FirstName: </label>
             		<input type="text" value=<%out.println(employee.getFirstName()); %> name="fname" class="form-control" id="fname"/>
             </div>
         </fieldset>
         
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="lname">LastName:</label>
     		    <input type="text" name="lname" value=<%out.println(employee.getLastName()); %> class="form-control" id="lname"/>
              </div>
     	 </fieldset>
                
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="salary">salary: </label>
     		    <input type="text" name="salary" value=<%out.println(employee.getSalary()); %> class="form-control" id="salary"/>
              </div>
     	 </fieldset>

         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="startDate">startDate: </label>
     		    <input type="text" name="startDate" value=<%out.println(employee.getStartDate()); %>  class="form-control" id="startDate"/>
              </div>
     	 </fieldset>
          
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="endDate">EndDate: </label>
     		    <input type="text" name="endDate" <%out.println(employee.getEndDate()); %>  class="form-control" id="endDate"/>
              </div>
     	 </fieldset>
    
         <fieldset class="form-group row">
         
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="leaderId">Project Manager</label>
     		    <select  type="text" value=<%out.println(employee.getManagerId()); %> name="leaderId"  class="form-control" id="LeaderId"> 
     		        <% for( int i=0;i<=emplist.size()-1;i++ ){
     		         Employee emp=emplist.get(i);%>
     		        <option value=<%out.println(emp.getId()); %> > <% out.println(emp.getLastName()); %></option>
   				   
   				  <%} %>
     		       
     		       
     		       
     		       
     		    </select>
              </div>
     	 </fieldset> 



       <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="street">street: </label>
     		     <input type="text" name="street" value=<%out.println(address.getStreet()); %>   class="form-control" id="street"/>
              </div>
     	 </fieldset>

         <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="city">city: </label>
     		     <input type="text" name="city" value=<%out.println(address.getCity()); %> class="form-control" id="city"/>
              </div>
     	 </fieldset>
 
          <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="provience"> provience: </label>
     		     <input type="text" name="provience" value=<%out.println(address.getProvience()); %>  class="form-control" id=" provience"/>
              </div>
     	 </fieldset>      
    
           <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="country"> country: </label>
     		     <input type="text" name="country" value=<%out.println(address.getCountry()); %> class="form-control" id="country"/>
              </div>
     	 </fieldset>  
     	 
     	 <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="postcode"> postcode: </label>
     		     <input type="text" name="postcode" value=<%out.println(address.getPostCode()); %>   class="form-control" id="postcode"/>
              </div>
     	 </fieldset> 
     	 
     	<fieldset class="form-group row">
         
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="ptype">Phone Type</label>
     		    <select  type="text" name="ptype" value=<%out.println(phone.getType()); %> class="form-control" id="ptype"> 
     		        <option value="cellphone">landline</option>
   				    <option value="landline">cellphone</option>
     		    </select>
              </div>
     	 </fieldset> 
     	 
     	  <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="areacode"> area code: </label>
     		     <input type="text" name="arecode" value=<%out.println(phone.getAreaCode()); %>class="form-control" id="areacode"/>
              </div>
     	 </fieldset> 
     	 
     	 
     	 <fieldset class="form-group row">
              <div class="col-sm-3">
     		     <label "col-sm-1 form-control-label" for="phonenumber"> phone number </label>
     		     <input type="text" name="phonenumber" value=<%out.println(phone.getPhoneNumber()); %> class="form-control" id="phonenumber"/>
              </div>
     	 </fieldset> 
 
     <fieldset class="form-group row">
          <div class="col-sm-3">
               <input type="submit" value="Submit" class="form-control" class="btn btn-lg btn-primary btn-block" />
          </div>
     </fieldset>   
  
  </form>
 
 
 </div>



</body>
</html>
