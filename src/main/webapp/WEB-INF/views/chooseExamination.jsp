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

    <title>Choose Examination</title>

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
	
	<section id="container">
		<h2>Choose Examination Technology and Level</h2>
		<form name="chooseExaminationForm" id="chooseExaminationForm-form" method="post" action="${contextPath}/takeExamination">
		<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
		
		<div id="wrapping" class="clearfix">
			<section id="aligned">
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
			
		</div>


		<section id="buttons">
			<input type="submit" name="submit" id="submitbtn" class="submitbtn" tabindex="7" value="Take and Give Examination!">
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
