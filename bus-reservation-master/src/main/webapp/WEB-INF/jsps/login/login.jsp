<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>User Login</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">

				<h2 style="text-align: center">Login</h2>

				<form class="form-horizontal" action="login" method="post">

					<div class="form-group">
						<label class="control-label col-sm-2">Email</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="email">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Password</label>
						<div class="col-sm-8">
							<input class="form-control" type="password" name="password">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<button class="btn btn-submit" type="submit" value="Login"
								style="width: 100px; height: 50px">Login</button>
						</div>
					</div>
					${msg}
				</form>

			</div>
			
			
			<div class="col-lg-2"></div>

		</div>
	</div>

</body>
</html>