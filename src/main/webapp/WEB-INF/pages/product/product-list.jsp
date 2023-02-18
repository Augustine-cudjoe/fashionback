<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>>

<h1>Product list</h1>

<table class="table  table-striped">
  <thead>
    <tr>
       <th> Title</th>
       <th> price</th>
       <th> discount </th>
       <th> stock</th>
       <th> Description</th>
       
       
        
    </tr>
  </thead>
  <tbody>
      <c:forEach var="product" items="${production}">
       <tr>
        <td>${product.getTitle() }</td> 
        <td>${product.getPrice() }</td>
        <td>${product.getDiscount() }</td>
        <td>${product.getStock() }</td>
         <td>${product.getDescription() }</td>
        
    </tr>
    </c:forEach>
  </tbody>
</table>