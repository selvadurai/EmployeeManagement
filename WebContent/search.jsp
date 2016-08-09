<%@page import="com.project.model.*" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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

<% 
	List<Employee> employeeList =(List) request.getAttribute( "employeeList");

 %> 





</head>

<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li><a href="home.jsp">Home</a></li>
      <li><a href="employee.jsp">Add Employee</a></li>
      <li class="active"><a href="search.jsp">Search Employee</a></li>
      <li><a href="project.jsp">Add Project</a></li>
    </ul>
  </div>
</nav>



<div class="container">

<form action="SearchController" method="GET"  > 
         
          	<table>
             <tr>
               <th><input type="text" name="search" class="form-control"/></th>
               <th>  <input id="search" type="submit" value="Search" class="form-control" /> </th>
            </tr>
            </table> 	 	
         
       
</form>


<br>
<br>

 <table border="1">
  <tr>
    <th>Id        </th>
    <th>First Name</th>
    <th>Last  Name</th>
    <th>Salary   </th>
    <th>MangerId </th>
  </tr>
  
 <%if (employeeList!=null) {
  for(int i=0; i<employeeList.size();i++ )
  { 
  Employee employee=employeeList.get(i); %>
  <tr>
     <td><%out.println(employee.getId()); %></td>
    <td><%out.println(employee.getFirstName()); %></td>
    <td><%out.println(employee.getLastName()); %></td>
    <td><%out.println(employee.getSalary()); %></td>
  </tr>
  <%} 
    } %>
</table>







</table>


</div>



</body>
</html>