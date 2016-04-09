<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery-2.2.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/login.js"></script>

<title>TP Login</title>
</head>
<body>
	<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">DDS TP Login</h1>
            <div class="account-wall">
                <img class="profile-img" src="image/login.png">
                <form action="Validation" method="post" class="form-signin">
                	<input type="text" name="user" class="form-control" placeholder="Usuario" required autofocus>
                	<input type="password" name="password" class="form-control" placeholder="Contraseña" required>
                	<label id="error"></label>
                	<input type="submit" id="btn" class="btn btn-lg btn-primary btn-block"  value="Entrar">
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>