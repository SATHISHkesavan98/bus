<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Passenger Registration</title>
</head>

<body>

	<div class="container">
		<div class="row">

			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<h2 style="text-align: center">Bus Info</h2>
				

				<table class="table table-striped">
					<thead>

					</thead>
					<tbody>
						<tr>
							<td>Bus Company:</td>
							<td>${bus.busCompany}</td>
						</tr>
						<tr>
							<td>Departure City:</td>
							<td>${bus.departureCity}</td>
						</tr>
						<tr>
							<td>Arrival City:</td>
							<td>${bus.arrivalCity}</td>
						</tr>
						<tr>
							<td>Departure Time:</td>
							<td>${bus.estimatedDepartureTime}</td>
						</tr>
					</tbody>
				</table>

				<br>
				<br> 

				<h3 style="text-align: center">
					<b>Enter Passenger Details</b>
				</h3>

				<form class="form-horizontal" action="showReservationWithCard"
					method="post">

					<div class="form-group">
						<label class="control-label col-sm-2">First Name</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="firstName">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Middle Name</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="middleName">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Last Name</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="lastName">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Email</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="email">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Phone</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="phone">
						</div>
					</div>

					<input type="hidden" name="busid" value="${bus.id}"
						style="width: 100px; height: 50px">
					<button class="btn btn-submit" type="submit"
						style="width: 150px; height: 50px; text-align: center">Confirm
						Passenger</button>

				</form>

			</div>
			<div class="col-lg-2"></div>


		</div>
	</div>

</body>
</html>