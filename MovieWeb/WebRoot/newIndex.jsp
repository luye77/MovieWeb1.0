<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="servlet.*" %>
<%@ page import="util.Test" %>
<%@ page import="entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->
<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
<link href='http://fonts.useso.com/css?family=Roboto+Condensed:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<script src="../js/responsiveslides.min.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
   
   function jump(){
   	window.location.href="../servlet/SingleServlet";
   	/*
   	如果不加这句则跳转无效，原因是 a标签的href跳转会执行在window.location.href设置的跳转之前:如果是表单form的话  也会先执行form提交。
   	提交之后 就已经不在当前页面了。所以 window.location.href无效。
   	*/
   	window.event.returnValue=false;
   }
    
</script>
</head>
<body>

<div class="container">
	<div class="container_wrap">
		<div class="header_top">
		    <div class="col-sm-3 logo"><a href="../index.jsp"><img src="../images/logo.png" alt=""/></a></div>
		    <div class="col-sm-6 nav">
			  <ul>
				 <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="comic"><a href="../movie.jsp"> </a></span></li>
				 
			 </ul>
			</div>
			<div class="col-sm-3 header_right">
			   <ul class="header_right_box">
				 <li><img src="../images/p1.png" alt=""/></li>
				 <li><p><a href="../login.jsp">Carol Varois</a></p></li>
				 <li class="last"><i class="edit"> </i></li>
				 <div class="clearfix"> </div>
			   </ul>
			</div>
			<div class="clearfix"> </div>
	      </div>
	      <div class="slider">
	   <div class="callbacks_container">
	      <ul class="rslides" id="slider">
	        <li><img src="../images/banner.jpg" class="img-responsive" alt=""/>
	        	<div class="button">
			      <a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
			    </div>
			</li>
	        <li><img src="../images/banner1.jpg" class="img-responsive" alt=""/>
	        	<div class="button">
			      <a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
			    </div>
			</li>
	        <li><img src="../images/banner2.jpg" class="img-responsive" alt=""/>
	        	<div class="button">
			      <a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
			    </div>
			</li>
	      </ul>
	    </div>
	    <div class="banner_desc">
			    	<div class="col-md-9">
			    		<ul class="list_1">
			    			<li>Published <span class="m_1">Feb 20, 2015</span></li>
			    			<li>Updated <span class="m_1">Feb 20 2015</span></li>
			    			<li>Rating <span class="m_1"><img src="../images/rating.png" alt=""/></span></li>
			    		</ul>
			    	</div>
			    	<div class="col-md-3 grid_1">
			    		<ul class="list_1 list_2">
			    			<li><i class="icon1"> </i><p>2,548</p></li>
			    			<li><i class="icon2"> </i><p>215</p></li>
			    			<li><i class="icon3"> </i><p>546</p></li>
			    		</ul>
			    	</div>
			    </div>
      </div>
      <div class="content">
      	<div class="box_1">
      	<form action="servlet/IndexServlet" method="post">
			<input type="submit" value="Featurd Movies">
		    </form>
      	 <!--<h1 class="m_2">Featurd Movies</h1>  -->
      	 <div class="search">
		    <form>
			
				<input type="text" name="mname" value="Search..." onFocus="this.value='';" onBlur="if (this.value == '') {this.value ='';}">
				<input type="submit" value="">
		    </form>
		</div>
		<div class="clearfix"> </div>
   </div>
 </div>
 <%
 	Test t=new Test();
 	Movie m=new Movie();
 	m=t.quaryMovieById("1");
 	String name=m.getMname();
 	String actor=m.getMactor();
 	String type=m.getMtype();
 	String coun=m.getMcoun();
 	String photo=m.getMpic();
 	
  %>
        <div class="box_2">
			<div class="col-md-5 grid_3">
			  <div class="row_1">
			  <div class="col-md-6 grid_4">
				  <div class="grid_2">
					<img src=<%=photo %> class="img-responsive" alt="" onclick="jump()"/>
					<div class="caption1">
						<ul class="list_3">
				    		<li><i class="icon5"> </i><p>3,548</p></li>
				    	</ul>
				    	<i class="icon4"> </i>
				    	<p class="m_3"><%=name %></p>
					</div>
				   </div>
				   <div class="col-md-6 grid_7">
				   <!-- <div class="col_2"> -->
				   	    <ul class="list_4">
			    			<li><i >actior: &nbsp;&nbsp;</i><p><%=actor %></p></li>
			    			<li><i >type: &nbsp;&nbsp;</i><p><%=type %></p></li>
			    			<li><i >country: &nbsp;&nbsp;</i><p><%=coun %></p></li>
			    			<!--<li>Rating : &nbsp;&nbsp;<p><img src="images/rating1.png" alt=""/></p></li>-->
			    			<li>Release Date : &nbsp;<span class="m_4">Mar 15, 2015</span> </li>
			    			<!-- <div class="clearfix"> </div> -->
			    		</ul>
			    
				   </div>
			 </div>
<div class="container"> 
 
</div>		
</body>
</html>