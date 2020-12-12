<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add_product" method="post">
  
  <div class="form-group">
    <label for="name">Product Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" 
    placeholder="Enter product name here..." name="name">
  </div>
  
  <div class="form-group">
    <label for="Description">Product Description</label>
    <input type="text" class="form-control" id="description" aria-describedby="emailHelp" 
    placeholder="Enter product details..." name="description">
  </div>
  
  <div class="form-group">
    <label for="price">Product Price</label>
    <input type="text" class="form-control" id="price" 
    aria-describedby="emailHelp" placeholder="Enter product price" name="price">
  </div>
  <div class="container text-center">
  <a href="${pageContext.request.contextPath}/"
  class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
  
  </div>
  
  
  
  

  
  </form>
</body>
</html>