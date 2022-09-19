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
<title>Available Trips</title>
</head>
<body>

	<div class="container">
		<div class="row">

			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<h2 style="text-align: center">Available Trips</h2>

				<table class="table table-striped">

					<thead>
						<tr>
							<th>Bus Company</th>
							<th>Departure City</th>
							<th>Arrival City</th>
							<th>Departure Time</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${buses}" var="bus">
							<tr>
								<td>${bus.busCompany}</td>
								<td>${bus.departureCity}</td>
								<td>${bus.arrivalCity}</td>
								<td>${bus.estimatedDepartureTime}</td>
								<td><a class="btn btn-primary btn-xs"
									href="showReservationWithPassenger?busid=${bus.id}">Select</a></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
			<div class="col-lg-2"></div>



		</div>
	</div>

</body>
</html>