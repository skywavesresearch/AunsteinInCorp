<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<!doctype html>
<html class="no-js" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel='shortcut icon' type='image/x-icon' href='/favicon.ico' />
    <title>Trimaximum Produces: Test Your Skills!</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <link rel="stylesheet" href="${contextPath}/resources/css/foundation.css" />
	<link rel="stylesheet" href="${contextPath}/resources/css/demo.css" />
	<script src="${contextPath}/resources/js/jquery.bxslider.js"></script>
	<link rel="stylesheet" href="${contextPath}/resources/css/jquery.bxslider.css" />
  </head>
  <body>
	 <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>
	<section id="quiz-container">
	    <div class="row">
	      <div class="large-12 columns">
	        <h1>${technology} Exam Cram</h1>
	      </div>
	    </div>
		
				
			
        <div class="row">
  		  <div class="medium-10 medium-centered small-12 columns">
			<form method="post" id="examAnswers" name="examAnswers-form" action="${contextPath}/submitAnswers">
			<input type="hidden"  name="level"   value="${level}"/>
			<input type="hidden"  name="technology"   value="${technology}"/>
			<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
			<input type="hidden"  name="userName"   value="${pageContext.request.userPrincipal.name}"/>
		   <div class="slider2">
  			
		    <c:forEach var="listValue" items="${questList}">
			<div class="slide">
			    <div class="row">
				      <div class="large-12 columns">
				        <h2>${listValue.question}</h2>

				        <div class="row questions">
						
						<div class="small-12">
				            <section title=".squaredTwo">
								<!-- .squaredTwo -->
								<div class="squaredTwo">
								  <input type="checkbox" value="${listValue.id}" id="${listValue.id}#ans1" name="${listValue.id}#ans1" >
								  <label for="${listValue.id}#ans1">${listValue.answer1}</label></input>
								</div>
								<!-- end .squaredTwo -->
							 </section>
				          </div>
  
				           <div class="small-12">
				            <section title=".squaredTwo">
								<!-- .squaredTwo -->
								<div class="squaredTwo">
								  <input type="checkbox" value="${listValue.id}" id="${listValue.id}#ans2" name="${listValue.id}#ans2" />
								  <label for="${listValue.id}#ans2">${listValue.answer2}</label>
								</div>
								<!-- end .squaredTwo -->
							 </section>
				          </div>
  
				           <div class="small-12">
				            <section title=".squaredTwo">
								<!-- .squaredTwo -->
								<div class="squaredTwo">
								  <input type="checkbox" value="${listValue.id}" id="${listValue.id}#ans3" name="${listValue.id}#ans3" />
								  <label for="${listValue.id}#ans3">${listValue.answer3}</label>
								</div>
								<!-- end .squaredTwo -->
							 </section>
				          </div>
  
				        <div class="small-12">
				            <section title=".squaredTwo">
								<!-- .squaredTwo -->
								<div class="squaredTwo">
								  <input type="checkbox" value="${listValue.id}" id="${listValue.id}#ans4" name="${listValue.id}#ans4" />
								  <label for="${listValue.id}#ans4">${listValue.answer4}</label>
								</div>
								<!-- end .squaredTwo -->
							 </section>
				          </div>
  			        </div>
   
				      </div>     
				
				</div>
			</div>
			  </c:forEach>  
			</div>
				
			
				</form>
			</div>
		</div>
	</section>
	
	<section id="result-container">
		<div id="result"></div>
		<div id="error" class="hide">Oops! Please make sure you selected answers for all the questions!</div>
	</section>
    
	
	<script>
	 // $(document).foundation();
	  $(document).ready(function(){
		  //sCustom.init;
		  $('.slider2').bxSlider({
			  mode: 'fade',
			  minSlides: 1,
			  infiniteLoop: false,
			  hideControlOnEnd: true
			});
			
		});
	</script>
  </body>
</html>
