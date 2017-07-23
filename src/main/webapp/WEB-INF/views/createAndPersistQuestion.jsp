<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="Ritesh Rai Chawla">

    <title>Create and Persist Question</title>

    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/responsive.css" rel="stylesheet">
	 <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>
	<c:if test="${success}">
	
	<h5>${success} </h5>
	
	</c:if>
	<c:if test="${failure}">
	
	<h5>${failure} </h5>
	
	</c:if>
	<section id="container">
		<h2>Create Questions and Persist into Database Interface</h2>
		<form name="questionForm" id="questionForm-form" method="post" action="${contextPath}/persistQuestion">
		<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
		
		<div id="wrapping" class="clearfix">
			<section id="aligned">
			
			<textarea name="question" id="question" placeholder="Enter a cool Question..." tabindex="5" class="txtblock"></textarea>
			
			<input type="text" name="answer1" id="answer1" placeholder="Answer 1" autocomplete="off" tabindex="1" class="txtinput">
		
			<input type="text" name="answer2" id="answer2" placeholder="Answer 2" autocomplete="off" tabindex="1" class="txtinput">
		
			<input type="text" name="answer3" id="answer3" placeholder="Answer 3" autocomplete="off" tabindex="1" class="txtinput">
		
			<input type="text" name="answer4" id="answer4" placeholder="Answer 5" autocomplete="off" tabindex="1" class="txtinput">
		
			
			</section>
			<section id="aside" class="clearfix">
			<section id="levelcase">
				<h3>Level:</h3>
					<select id="level" name="level" tabindex="6" class="selmenu">
  						<option value="Fresher">Fresher</option>
  						<option value="Fresher and Experienced">Fresher and Experienced</option>
  						<option value="Experienced">Experienced</option>
  						<option value="Proficient">Proficient</option>
  						<option value="Expert">Expert</option>
					</select>
				</section>
				<section id="technologycase">
				<h3>Technology:</h3>
					<select id="technology" name="technology" tabindex="6" class="selmenu">
  						<option value="Core Java">Core Java</option>
  						<option value="Spring IOC">Spring IOC</option>
  						<option value="Spring MVC">Spring MVC</option>
  						<option value="Hibernate">Hibernate</option>
  						<option value="Core Java Collections">Core Java Collections</option>
						<option value="Core Java Multithreading">Core Java Multithreading</option>
						<option value="Core Java Garbage Collections">Core Java Garbage Collections</option>
						<option value="Core Java OOPS">Core Java OOPS</option>
						<option value="JSP">JSP</option>
						<option value="Servlets">Servlets</option>
						<option value="J2EE">J2EE</option>
						<option value="Core Java Exceptions">Core Java Exceptions</option>
						<option value="Database">Database</option>
					</select>
				</section>
				
				<section id="answerscase">
					<h3>Answers:</h3>
					<span class="radiobadge">
						<input type="checkbox" name="ans1" value="1" >
						<label for="low">Answer 1</label>
					</span>
				
					<span class="radiobadge">
						<input type="checkbox" name="ans2" value="2">
						<label for="med">Answer 2</label>
					</span>
				
					<span class="radiobadge">
						<input type="checkbox" name="ans3" value="3">
						<label for="high">Answer 3</label>
					</span>
					<span class="radiobadge">
						<input type="checkbox" name="ans4" value="4">
						<label for="high">Answer 4</label>
					</span>
				</section>
				<section id="comments">
				<h3>Comments:</h3>
					<textarea name="comments" id="comments" placeholder="Enter Comments..." tabindex="5" class="txtblock"></textarea>
				</section>
			</section>
		</div>


		<section id="buttons">
			<input type="reset" name="reset" id="resetbtn" class="resetbtn" value="Reset">
			<input type="submit" name="submit" id="submitbtn" class="submitbtn" tabindex="7" value="Submit this!">
			<br style="clear:both;">
		</section>
		
		</form>
	</section>
	
	
	
</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
