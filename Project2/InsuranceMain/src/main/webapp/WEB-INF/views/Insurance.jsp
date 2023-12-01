<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %> 
<html>
<head>
  <title>HomePage (Insurance)</title>
  <script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
  <script src="./JS/insurance.js"></script>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <style>
    body {
      background-color: #f8f8f8;
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
    }
    
    #tabs {
      max-width: 600px;
      margin: 50px auto;
      background-color: #ffffff;
      border-radius: 5px;
      padding: 20px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    
    h1, h2, p {
      text-align: center;
      color: #333333;
    }
    
    label {
      display: block;
      font-weight: bold;
      margin-top: 10px;
      color: #333333;
    }
    
    input[type="text"],
    input[type="radio"] {
      width: 100%;
      padding: 8px;
      border: 1px solid #cccccc;
      border-radius: 5px;
    }
    
    input[type="button"],
    input[type="submit"] {
      background-color: #007bff;
      color: #ffffff;
      border: none;
      padding: 10px 20px;
      font-weight: bold;
      border-radius: 5px;
      cursor: pointer;
      margin-top: 20px;
    }
    
    input[type="button"]:hover,
    input[type="submit"]:hover {
      background-color: #0056b3;
    }
    
    #listInsurance {
      margin-top: 20px;
      text-align: center;
    }
    
    #tblInsurance {
      width: 100%;
    }
    
    #tblInsurance th,
    #tblInsurance td {
      padding: 8px;
    }
    
    #tblInsurance th {
      background-color: #f2f2f2;
    }
  </style>
  <script>
    $(function() {
      $("#tabs").tabs();
      $("#datepicker").datepicker({
        range: 'period', // Enable range selection
        onSelect: function(dateText, inst) {
          var startDate = new Date(inst.selectedYear, inst.selectedMonth, inst.selectedDay);
          var endDate = new Date(inst.endYear, inst.endMonth, inst.endDay);
          $("#selected-dates").text("Selected Dates: " + $.datepicker.formatDate('mm/dd/yy', startDate) + " - " + $.datepicker.formatDate('mm/dd/yy', endDate));
        }
      });
    });
  </script>
</head>
<body>
  <div id="tabs">
    <ul>
      <li><a href="#tabs-1">Insurance form</a></li>
      <li><a href="#tabs-2">About Us</a></li>
      <li><a href="#tabs-3">Help?</a></li>
    </ul>
    <div id="tabs-1">
      <h1><strong>AMG Insurance</strong></h1>
      <img class="starimg" src="./Imgs/Star.jpeg"/>
      <h2>Answer the following questions to get started</h2>

      <label for="fname">First Name:</label>
      <input type="text" id="fname" name="fname"/>

      <label for="lname">Last Name:</label>
      <input type="text" id="lname" name="lname"/>

      <label for="age">Age:</label>
      <input type="text" id="age" name="age"/>

      <label for="city">City:</label>
      <input type="text" id="city" name="city"/>

      <label for="state">State:</label>
      <select id="state" name="state">
        <option value="">Select a state</option>
        <option value="CA">California</option>
        <option value="WA">Washington</option>
        <option value="MN">Minnesota</option>
      </select>

      <label for="adress1">Address 1:</label>
      <input type="text" id="adress1" name="adress1"/>

      <label for="adress2">Address 2:</label>
      <input type="text" id="adress2" name="adress2"/>

      <label for="insurance">Do you currently have auto insurance?</label>
      <input type="radio" id="insurance-yes" name="insurance" value="yes"/>
      <label for="insurance-yes">Yes</label>
      <input type="radio" id="insurance-no" name="insurance" value="no"/>
      <label for="insurance-no">No</label>

      <label for="datepicker">The day you want this insurance:</label>
      <input type="text" id="datepicker" name="datepicker"/>

      <label for="searchCompany">Company Search:</label>
      <input class="form-control" type="text" id="searchCompany" name="searchCompany"/>
      <input value="Search" type="button" id="searchButton"/>

      <div class="col-7 border rounded" style="margin-left:50px;">
        <div style="text-align:center; font-size:20px; font-family:'Trebuchet MS', Helvetica, sans-serif">List of Providers:</div>
        <div id="listInsurance">
          <table border="1" id="tblInsurance">
            <tr>
              <th>Provider</th>
              <th>Image</th>
              <th>CompanyName</th>
              <th>Select<br><br><br><br><input value="select" type="radio" id="SelectCompany"></th>
            </tr>
          </table>
        </div>
      </div>

      <label for="carmakeAndmodel">Car Make/Model:</label>
      <select class="form-control" id="carmakeAndmodel"></select>

      <label for="insuranceType">Type of Insurance:</label>
      <select class="form-control" id="insuranceType"></select>

      <label for="emailId">Enter your email address:</label>
      <input type="text" id="emailId" name="Email_Id">

      <input type="button" id="submit" value="Submit">
    </div>
    <div id="tabs-2">
      <p>About Us</p>
      <p>Welcome to AMG Insurance!</p>
      <p>We are an Easy-get Insurance service.</p>
      <p>Here we provide insurance for selected luxury Mercedes cars. To get started, fill out the form and after you click submit, you will receive a quote.</p>
    </div>
    <div id="tabs-3">
      <p>Help?</p>
      <p>Contact us at AmgInsurance@insur.net to send us inquiries.</p>
    </div>
  </div>
</body>
</html>


