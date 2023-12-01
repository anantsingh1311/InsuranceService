<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored="false" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>  
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <style>
    h2 {
      font-family: "Arial", sans-serif;
      font-size: 28px;
      color: #333;
      text-align: center;
      text-transform: uppercase;
      letter-spacing: 2px;
      padding: 10px;
      background-color: #f2f2f2;
      border-radius: 5px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
  </style>
<head>
  <meta charset="UTF-8">
  <title>Bookings Page</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
 /*  <script src="./JS/records.js"></script> */
 <script>
 $.get("http://localhost:6889/findBookingCurrent", {
            }, function(responseText) {
                $.each(responseText, function(key1, value1) {
                let output = "";
                for(var i in value1.InsuranceBooking){               
                output = output+value1.InsuranceBooking[i].bookingId+",";                
                }
                $("#tabs-1").append("<tr><td>"+value1.bookingId+"</td><td>"+value1.firstName+"</td><td>"+value1.lastName+"</td><td>"+value1.dateofInsurance+"</td><td>"+value1.insuranceType+"</td><td>"+value1.emailId+"</td><td>"+value1.age+"</td>");
                
	                
                
      });
      });
 </script>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
</head>

<body>
<h3><security:authorize access="isAuthenticated()">
    		 <span id="username" ><security:authentication property="principal.username"/> </span> 
    		<security:authorize access="hasRole('USER')">
    		</security:authorize>
		</security:authorize></h3>
  <h2>Insurance Approval/Rejection Details</h2>
  <div id="tabs">
    <ul>
     <li><a href="#tabs-1">Upcoming </a></li>
<li><a href="#tabs-2">Completed</a></li>
<li><a href="#tabs-3">Cancelled</a></li>
</ul>

<div id="tabs-1">
<p>Upcoming.</p>
<div id="listBooking">
		<table border="1" id="tblBooking">
		<tr><th>BookingId</th><th>First Name</th><th>Last-Name</th><th>Date(requested)</th><th>Type</th><th>Email</th><th>Age</th><th>Cancel</th><th>Approve</th></tr>
		</table>
	</div>
</div>
<div id="tabs-2">
<p>Completed.</p>
<div id="listBooking1">
		<table border="1" id="tblCompleted">
		<tr><th>BookingId</th><th>First Name</th><th>Last-Name</th><th>Date(requested)</th><th>Type</th><th>Email</th><th>Age</th><th>Cancel</th></</tr>
		</table>
	</div>
</div>
<div id="tabs-3">
<p>Cancelled.</p>
<div id="listBooking2">
		<table border="1" id="tblCancelled">
		<tr><th>BookingId</th><th>First Name</th><th>Last-Name</th><th>Date(requested)</th><th>Type</th><th>Email</th><th>Age</th><th>Cancel</th></</tr>
		</table>
	</div>
</div>
</div>

  <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="http://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
  <script>
    $(function() {
      $("#tabs").tabs({
        activate: function(event, ui) {
          if (ui.newPanel.attr("id") === "tabs-2") {
           // alert("tab2 is selected");
          }
        }
      });
    });
  </script>
</body>
</html>

