
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div class="container">
    <h3>product form</h3>    
    <form action = "/product/form" method ="POST">
     <h3> ${title}</h3>
     <br/>
      <input type="hidden" 
      	name="id"
      	required
      	class="form-control" 
      	value="${product.getId()}" 
      	id="productId">

	  <div class="mb-3">
	    <label class="form-label">Categories</label>
	    <div class="mb-3">
	    <c:forEach items="${categories }" var="category" >
	      <div class="col-2">
	      <input type="checkbox"
	      name="categories"
	      value="${category.id}"
           id="categories${category.getId()}"/>
           <labal for="categories${category.id}" }> ${category.getTitle() }</labal>	    
	    
	    </div>
	    </c:forEach>
	  </div>
	  </div>
	  <div class="mb-3">
	    <label for="productitle" class="form-label">Product Title</label>
	    <input type="text" 
	    	name="title"
	    	required
	    	class="form-control" 
	    	id="productitle"
	    	value="${product.getTitle() }">	   
	  </div>
	  <div class="mb-3">
	    <label for="productDiscount" class="form-label">Discount Amount</label>
	    <input type="number" 
	    	name="discount"
	    	required
	    	class="form-control" 
	    	id="productdiscount"
	    	value="${product.getDiscount() }">	   
	  </div>
	   <div class="mb-3">
	    <label for="productquantity" class="form-label">Stock Quantity</label>
	    <input type="number" 
	    	name="stock"
	    	required
	    	class="form-control" 
	    	id="productquantity"
	    	value="${product.getStock() }">	   
	  </div>

	  <div class="mb-3">
	    <label for="price" class="form-label">Price(&euro;)</label>
	     <input type="number" min="0.00" max="100000" step="0.01" 
	    	name="price"
	    	required
	    	class="form-control" 
	    	id="productprice"
	    	value="${product.getPrice() }">	
	    	
	    	
	    </div>
	   
	      <div class="mb-3">
	      <label for="description" class="form-label">Description</label>
	    <textarea 
	    	name="description"
	    	class="form-control" 
    		id="productDescription"></textarea>
	      
	      </div>
	  	  
	  <input type="submit" value="Save" class="btn btn-secondary"/>
	  <input type="submit" value="Save and add another" class="btn btn-secondary"/>
	  <a class="btn btn-warning" href="/category/list">Cancel</a>
	</form>
</div>