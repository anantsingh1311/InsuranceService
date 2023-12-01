$(document).ready(function(){
	$.get("http://localhost:6889/getAutoModel", {
            }, function(responseText) {
                $.each(responseText, function(key1, value1) {
                let output = "";
                for(var i in value1.AutoMakeAndModel){               
                output = output+value1.AutoMakeAndModel[i].autoModel+",";                
                }
                $("#carmakeAndmodel").append("<option>"+value1.autoModel+"</option>");
	                
                
      });
      });
      
      $.get("http://localhost:6889/getIsuranceType", {
            }, function(responseText) {
                $.each(responseText, function(key1, value1) {
                let output = "";
                for(var i in value1.InsuranceType){               
                output = output+value1.InsuranceType[i].insurance_type+",";                
                }
                $("#insuranceType").append("<option>"+value1.insurance_type+" $"+value1.cost+"</option>");
                
	                
                
      });
      });
		
	
	//Search for your preffered provider 
	$('#searchButton').click(function(){
		var searchText = $("#searchCompany").val();
        $('#tblInsurance tr').not(':first').remove();
		$.get("http://localhost:6889/searchProvider/"+searchText, {
            }, function(responseText) {
                $.each(responseText, function(key1, value1) {
                let output = "";
                for(var i in value1.Providers){               
                output = output+value1.Providers[i].providerName+",";                
                }
	                $("#tblInsurance").append("<tr><td>"+value1.providerName+"</td><td><img class='hotelImage' src='"+value1.imageurl+"' width='300' heigth='300'/></td><td>"+value1.companyName+"</td>");
                
      });
             
            
            
                                 
         }); 
                    
    });
    
    // No 
    $("#insurance-no").click(function(){
		
		alert("Sorry We dont provide insurance to first-time appliers");
		
		
	});
	
	$("#submit").click(function(){
		
		var firstName = $("#fname").val();
		var lastName = $("#lname").val();
		var age = $("#age").val();
		var adress1 = $("#adress1").val();
		var adress2 = $("#adress2").val();
		var YesorNoInsurance = $("#doyouHaveInsurance").val();
		var city = $("#city").val();
		var state = $("#state").val();
		var carMakeAndModel=$("#carmakeAndmodel").val();
		var typeOfInsurance = $("#insuranceType").val();
		var emailAddress = $("#emailId").val();
		var Date = $("#datepicker").val();
		
		var insurance = {"firstName": firstName, "lastName": lastName, "age": age  , "adress1": adress1,  "adress2": adress2, "doyouHaveInsurance": YesorNoInsurance, 
		             "city":city, "state":state, "carMakeModel":carMakeAndModel, "insuranceType":typeOfInsurance, "emailId": emailAddress, "dateofInsurance": Date}
		
		 $.ajax({
			type: "POST",
			contentType: "application/json",
			url: "http://localhost:6889/saveBooking",
			data: JSON.stringify(insurance),
			dataType: 'json',
			success: function(result) {
				//alert(result);
				alert("Submitted!");
			},
			error: function(e) {

			}
		});
		
		
		
		
		
		
	
	
	
	
	
	
	
	});
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	});
	
	