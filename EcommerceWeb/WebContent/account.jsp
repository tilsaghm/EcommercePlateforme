<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Login - E-Movies ISSC 3A</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Eshop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<!-- for bootstrap working -->
	<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<!-- cart -->
	<script src="js/simpleCart.min.js"> </script>
<!-- cart -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
</head>
<!-- header-section-starts -->
	<jsp:include page="includes/header.jsp" />
		<!-- content-section-starts -->
	<div class="content">
	<div class="container">
		<div class="login-page">
			    <div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                       <a href="index.jsp" title="Go to Home Page">Home</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Identification
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="index.jsp">Retour Ã  la page d'accueil</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
			   <div class="account_grid">
			   <div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
			  	 <h2>Bienvenue</h2>
				 <p> En créant un compte sur <B>E-Movie</B> vous pourrez accéder Ã  l'ensemble de nos DVD mis en vente, ainsi qu'Ã  un processus de d'achat trÃ¨s simplifié satisfaisant tous vos besoins.</p>
				 <a class="acount-btn" href="register.jsp">Créer un compte</a>
			   </div>
			   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
			  	<h3>Bienvenue Cher Client !</h3>
				<p>Si vous êtes déjà  un de nos clients, connectez vous svp.</p>
				<form>
				  <div>
					<span>Email <label>*</label></span>
					<input type="text"> 
				  </div>
				  <div>
					<span> de passe<label>*</label></span>
					<input type="password"> 
				  </div>
				  <a class="forgot" href="#">Mot de passe?</a>
				  <input type="submit" value="Login">
			    </form>
			   </div>	
			   <div class="clearfix"> </div>
			 </div>
		   </div>
</div>
		
	<div class="footer">
		<div class="container">
		 <div class="footer_top">
			
		  <div class="copyright text-center">
				<p>Â© 2016 - ENSIMAG - Mohamed TILSAGHANI - Kim LE VU - Philipes CHAUMES . All Rights Reserved </p>
		  </div>
		</div>
		</div>
</body>
</html>