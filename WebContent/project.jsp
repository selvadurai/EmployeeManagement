<%@ page import="com.project.model.*,java.util.*"  language="java" contentType="text/html; charset=ISO-8859-1"
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


  <%EmployeeDoa empDoa=new EmployeeDoa();
     	    empDoa.open();
     	    List<Employee>emplist=empDoa.CreateEmployeeList();
     	    empDoa.close();%>    
     	       

<script type='text/javascript'>$(document).ready(function(){
    var next = 1;
    $(".add-more").click(function(e){
        e.preventDefault();
        var addto = "#field" + next;
        var addRemove = "#field" + (next);
        next = next + 1;
       
        
        
        var newIn = '<select autocomplete="off" class="input form-control" id="field' + next + '" name="field' + next + '" type="text > ' <% for( int i=0;i<=emplist.size()-1;i++ ){  Employee emp=emplist.get(i);%> "<option value="<%out.println(emp.getId()); %> '>'<% out.println(emp.getLastName()); %> '</option>'<%} %> '</select>';
        var newInput = $(newIn);
        var removeBtn = '<button id="remove' + (next - 1) + '" class="btn btn-danger remove-me" >-</button></div><div id="field">';
        var removeButton = $(removeBtn);
        $(addto).after(newInput);
        $(addRemove).after(removeButton);
        $("#field" + next).attr('data-source',$(addto).attr('data-source'));
        $("#count").val(next);  
        
            $('.remove-me').click(function(e){
                e.preventDefault();
                var fieldNum = this.id.charAt(this.id.length-1);
                var fieldID = "#field" + fieldNum;
                $(this).remove();
                $(fieldID).remove();
            });
    });
    

    
});
</script>






<title>Project</title>
</head>
<body>
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li ><a href="home.jsp">Home</a></li>
      <li><a href="employee.jsp">Add Employee</a></li>
      <li><a href="search.jsp">Search Employee</a></li>
      <li class="active"><a href="project.jsp">Add Project</a></li>
    </ul>
  </div>
</nav>


<div class="container">

<form action="AddProjectController" method="GET"  role="form" > 
         
         <fieldset class="form-group row"> 
          	<div class="col-sm-3">
             	 	<label "col-sm-1 form-control-label" for="type"> Type: </label>
             		<input type="text" name="type" class="form-control" id="type"/>
             </div>
         </fieldset>
         
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="name">Name</label>
     		    <input type="text" name="name"  class="form-control" id="name"/>
              </div>
     	 </fieldset>
                
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="budget">Budget: </label>
     		    <input type="text" name="budget"  class="form-control" id="budget"/>
              </div>
     	 </fieldset>
     	       
     
                
      <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="category">Project Manager</label>
     		    <select  type="text" name="leaderId"  class="form-control" id="category"> 
     		      <% for( int i=0;i<=emplist.size()-1;i++ ){
     		         Employee emp=emplist.get(i);%>
     		        <option value=<%out.println(emp.getId()); %> > <% out.println(emp.getLastName()); %></option>
   				   
   				  <%} %>
     		    </select>
              </div>
     	 </fieldset>   
               
               <br/>
               <br/>
          
      <fieldset class="form-group row">
          <div class="col-sm-3">
             
             <div class="field_wrapper">
             	
        	 <select name="employee" id="some-select" multiple="multiple">
           		<% for( int i=0;i<=emplist.size()-1;i++ ){
     		         Employee emp=emplist.get(i);%>
     		  	<option value=<%out.println(emp.getId()); %> ><% out.println( emp.getFirstName() +"  "+emp.getLastName()); %></option>
   		   		 <%} %>		   
         	 </select>
 
             		           
             </div>
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