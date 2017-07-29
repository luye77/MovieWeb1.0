<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="util.Test" %>
<%@ page import="servlet.*" %>
<%@ page import="entity.Movie" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Single</title>
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
</head>
<body>
<%

String avg=(String)request.getSession().getAttribute("avg");
Test t=new Test();

Movie m1=(Movie)request.getSession().getAttribute("movie");

%>
<script>
	function jump5(){
		$.ajax({
	
		type:"GET",
	
		url:"../servlet/CountServlet?f5=5",
		})
  		}
	function jump4(){
		$.ajax({
	
		type:"GET",
	
		url:"../servlet/CountServlet?f4=4",
		})
  		}
  	function jump3(){
		$.ajax({
	
		type:"GET",
	
		url:"../servlet/CountServlet?f3=3",
		})
  		}
  	function jump2(){
		$.ajax({
	
		type:"GET",
	
		url:"../servlet/CountServlet?f2=2",
		})
  		}
  	function jump1(){
		$.ajax({
	
		type:"GET",
	
		url:"../servlet/CountServlet?f1=1",
		})
  		}
</script>
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
	   <div class="content">
      	   <div class="movie_top">
      	         <div class="col-md-9 movie_box">
                        <div class="grid images_3_of_2">
                        	<div class="movie_image">
														
                                <span class="movie_rating"><%=avg %></span>
                                <img src="../<%=m1.getMpic() %>" class="img-responsive" alt=""/>
                            </div>
                            <div class="movie_rate">
                            	<div class="rating_desc"><p>Your Vote :</p></div>
                            	<form action="" class="sky-form">
							     <fieldset>					
								   <section>
								   
								     <div class="rating">
										<input type="radio" name="stars-rating" id="stars-rating-5">
										<label for="stars-rating-5" onclick="jump5()"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-4">
										<label for="stars-rating-4" onclick="jump4()"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-3">
										<label for="stars-rating-3" onclick="jump3()"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-2">
										<label for="stars-rating-2" onclick="jump2()"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-1">
										<label for="stars-rating-1" onclick="jump1()"><i class="icon-star"></i></label>
									 </div>
								  </section>
							    </fieldset>
						  	   </form>
						  	   <div class="clearfix"> </div>
                            </div>
                        </div>
						
                        <div class="desc1 span_3_of_2">
                        	<p class="movie_option"><strong>Country: </strong><a href="#">established</a>, <a href="#">USA</a></p>
                        	<p class="movie_option"><strong>Year: </strong>2014</p>
                        	<p class="movie_option"><strong>Category: </strong><a href="#">Adventure</a>, <a href="#">Fantazy</a></p>
                        	<p class="movie_option"><strong>Release date: </strong>December 12, 2014</p>
                        	<p class="movie_option"><strong>Director: </strong><a href="#">suffered </a></p>
                        	<p class="movie_option"><strong>Actors: </strong><a href="#">anything</a>, <a href="#">Lorem Ipsum</a>, <a href="#"> discovered</a>, <a href="#"> Virginia</a>, <a href="#"> Virginia</a>, <a href="#">variations</a>, <a href="#">variations</a>, <a href="#">variations</a>, <a href="#"> Virginia</a> <a href="#">...</a></p>
                            <p class="movie_option"><strong>Age restriction: </strong>13</p> 
							
							
                            <div class="down_btn"><a class="btn1" href="#"><span> </span>Thumbs UP</a></div><br/>
							 <p class="movie_option"><strong>SUM: </strong>123</p> 
                         </div>
                        <div class="clearfix"> </div>
                        <p class="m_4">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet.</p>
		                <form method="post" action="../servlet/Message">
							<div class="to">
		                     	<input type="text" class="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}">
								<input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" style="margin-left:3%">
							
							<div class="text">
			                   <textarea name="messages" value="Message:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message:</textarea>
			                </div>
			                <div class="form-submit1">
					           <input name="submit" type="submit" id="submit" value="Submit Your Message"><br>
					        </div>
							<div class="clearfix"></div>
                 		</form>
		                <div class="single">
						 	
		
		                <h1>10 Comments</h1>
		                <ul class="single_list">
					        <li>
					            <div class="preview"><a href="#"><img src="../images/2.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">Movie  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					         <li>
					            <div class="preview"><a href="#"><img src="../images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">Wernay  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent </p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					         <li>
					            <div class="preview"><a href="#"><img src="../images/4.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">mr.dev  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum. qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram,</p>
					            </div>
					           <div class="clearfix"></div>
					        </li>
					     	
			  			</ul>
                      </div>
                      </div>
                      

           </div>
    </div>
</div>
	<%
        	String list="";
        	 Cookie[] cookies = request.getCookies();
        	  if(cookies!=null&&cookies.length>0)
              {
	              for(Cookie c:cookies)
	              {
	                  if(c.getName().equals("ListViewCookie"))
	                  {
	                     list = c.getValue();
	                  }
	              }
	          }
              list+=request.getParameter("mid")+",";
              //如果浏览记录超过1000条，清零.
              String[] arr = list.split(",");
              if(arr!=null&&arr.length>0)
              {
                  if(arr.length>=1000)
                  {
                      list="";
                  }
              }
              Cookie cookie = new Cookie("ListViewCookie",list);
              response.addCookie(cookie);
              
        	List<Movie> allMovie=t.cookieMovie(list);
        	for(Movie m:allMovie){
         %>
		<div class="movie movie-test movie-test-dark movie-test-left">
                                <div class="movie__images">
                                    <a href="servlet/SingleServlet?mid=<%=m.getMno() %>" class="movie-beta__link">
                                        <img alt="" src="../<%=m.getMpic() %>" class="img-responsive" alt=""/>
                                    </a>
                                </div>
								<div class="movie__info">
                                    <a href="servlet/SingleServlet" class="movie__title"><%=m.getMcoun() %>  </a>
                                    <p class="movie__time">80 min</p>
									<p class="movie__option"><a href="servlet/SingleServlet"><%=m.getMactor() %></a><br><a href="servlet/SingleServlet"><%=m.getMcoun() %></a><br><a href="servlet/SingleServlet"><%=m.getMname() %></a></p>
                                    <ul class="list_6">
						    			<li><i class="icon1"> </i><p>2,548</p></li>
						    			<li><i class="icon3"> </i><p>546</p></li>
						    			<li>Rating : &nbsp;&nbsp;<p><img src="../images/rating1.png" alt=""></p></li>
						    			<div class="clearfix"> </div>
						    		</ul>
                                 </div>
                                <div class="clearfix"> </div>
                            </div>
 		<%
 			} 
 		%>
 <div class="container"> 
</div>		
</body>
</html>