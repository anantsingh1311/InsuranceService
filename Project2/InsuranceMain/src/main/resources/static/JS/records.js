$(document).ready(function() {



	// JS function to fetch the bookings on to the current tab, for the admin review.
	/*$.get("http://localhost:6889/findBookingCurrent", {}, function(responseText) {
		$.each(responseText, function(key1, value1) {
			//let output = "";
			
			alert();
			$("#tblBooking").append("<tr><td> " + value1.bookingId + "</td><td>" + value1.firstName + "</td> <td> " + value1.lastName + "</td>  <td>" + value1.dateofInsurance + "</td>  <td>" + value1.insuranceType + "</td>  <td>" + value1.emailId + "</td>  <td>" + value1.age + "</td><td><input type='button' class='cancelButton' name='Cancel' value='Cancel'></td><td><input type='button' class='approve' value='Approve'></td></tr>");
		});
	});*/
	$.ajax({
		type: "GET",
		url: "http://localhost:6889/findBookingCurrent",
		success: function(result) {
			alert(result);
			$.each(result, function(key1, value1) {
				$("#tblBooking").append("<tr><td> " + value1.bookingId + "</td><td>" + value1.firstName + "</td> <td> " + value1.lastName + "</td>  <td>" + value1.dateofInsurance + "</td>  <td>" + value1.insuranceType + "</td>  <td>" + value1.emailId + "</td>  <td>" + value1.age + "</td><td><input type='button' class='cancelButton' name='Cancel' value='Cancel'></td><td><input type='button' class='approve' value='Approve'></td></tr>");
			});
		},
		error: function(e) {

		}
	});





	$("#tblBooking").on('click', '.approve', function() {
		//var bookingId= "4952";
		status = $(this).parent().parent().children("td").eq("0").text();
		// var obj1 = JSON.parse(obj);
		alert(status);
		// console.log(bookingId);

		$.ajax({
			type: "GET",
			url: "http://localhost:6889/findCompleted/" + status,
			success: function(result) {
				alert(result);
			},
			error: function(e) {
				alert("couldnt fetch details")
			}
		});

		return false;
	});
$("#tblBooking").on('click', '.cancelButton', function() {
		//var bookingId= "4952";
		status = $(this).parent().parent().children("td").eq("0").text();
		// var obj1 = JSON.parse(obj);
		alert(bookingId);
		// console.log(bookingId);

		$.ajax({
			type: "GET",
			url: "http://localhost:6889/cancelBooking/" + status,
			success: function(result) {
				alert(result);
			},
			error: function(e) {
				alert("couldnt fetch details")
			}
		});

		return false;
	});

	$("#tabs-2").click(function() {
		$.ajax({
			type: "GET",
			url: "http://localhost:6889/findCompletedBookings/"+status,
			success: function(result) {
				alert(result);
				$.each(result, function(key1, value1) {
					$("#tblCompleted").append(" <tr><td> " + value1.bookingId + " </td><td> " + value1.firstName + " </td> <td> " + value1.lastName + "</td>  <td>" + value1.dateofInsurance + "</td>  <td>" + value1.insuranceType + "</td>  <td>" + value1.emailId + "</td>  <td>" + value1.age + "</td> </tr>");
				});
			},
			error: function(e) {

			}
		});

	});

	$("#tabs-3").click(function() {
		$.ajax({
			type: "GET",
			url: "http://localhost:6889/findCancelled/"+status,
			success: function(result) {
				alert(result);
				$.each(result, function(key1, value1) {
					$("#tblCancelled").append(" <tr><td> " + value1.bookingId + " </td><td> " + value1.firstName + " </td> <td> " + value1.lastName + "</td>  <td>" + value1.dateofInsurance + "</td>  <td>" + value1.insuranceType + "</td>  <td>" + value1.emailId + "</td>  <td>" + value1.age + "</td> </tr>");
				});
			},
			error: function(e) {

			}
		});

	});






});

















