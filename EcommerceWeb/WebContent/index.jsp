<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bienvenue sur E-Movies - ISSC 3A </title>
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
<body>
	<!-- header-section-starts -->

<jsp:include page="includes/header.jsp" />
	<div class="banner">
		<div class="container">
<div class="banner-bottom">
	<div class="banner-bottom-left">
		<h2>    <br> <br>    </h2>
	</div>
	<div class="banner-bottom-right">
		<div  class="callbacks_container">
					<ul class="rslides" id="slider4">
					<li>
								<div class="banner-info">
									<h3>Achetez nos DVD svp</h3>
									<p>DVDs pas chers...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
								   <h3>Pour tous les goûts</h3>
									<p>Créez votre compte dès maintenant...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
								  <h3>Promotions</h3>
									<p>Bénéficiez de promotions exceptionnelles...</p>
								</div>								
							</li>
						</ul>
					</div>
					<!--banner-->
	  			<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager:true,
			        nav:false,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
	</div>
	<div class="clearfix"> </div>
</div>
<h4></h4>
<h4></h4>
<h4></h4>
<h4></h4>
<h4></h4>
<h4></h4>
<h4></h4>
<h4></h4>
	<div class="shop">
		<a href="register.jsp">Créez un compte maintenant</a>
	</div>
	</div>
		</div>
		<!-- content-section-starts-here -->

		<!-- content-section-ends-here -->

		<div class="footer">
		<div class="container">
		 <div class="footer_top">
			
		  <div class="copyright text-center">
				<p>© 2016 - ENSIMAG - Mohamed TILSAGHANI - Kim LE VU - Philipes CHAUMES . All Rights Reserved </p>
		  </div>
		</div>
		</div>
</body>
</html>