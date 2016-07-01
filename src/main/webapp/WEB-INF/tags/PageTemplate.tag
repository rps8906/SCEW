<%@ tag description="Material Admin Template" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ attribute name="css" fragment="true"%>
<%@ attribute name="js" fragment="true"%>
<%@ attribute name="title"%>

<c:set var="resourcesMaterial" value="${pageContext.request.contextPath}/resources/assets" scope="application" />
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>

<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="Simple material admin template">
		<title>
			<c:choose>
				<c:when test="${empty title}">
		  			SCEW | ARKDIA
		  		</c:when>
				<c:otherwise>
		  			${title}
		  		</c:otherwise>
			</c:choose>
		</title>
		<link href='http://fonts.googleapis.com/css?family=Roboto:300italic,400italic,300,400,500,700,900' rel='stylesheet' type='text/css'/>
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/bootstrap.css" />
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/materialadmin.css" />
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/font-awesome.min.css" />
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/material-design-iconic-font.min.css" />
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/libs/rickshaw/rickshaw.css" />
		<link type="text/css" rel="stylesheet" href="${resourcesMaterial}/css/theme-1/libs/morris/morris.core.css" />
	</head>
	<body class="menubar-hoverable header-fixed menubar-pin menubar-first">
		<header id="header">
			<div class="headerbar">
				<div class="headerbar-left">
					<ul class="header-nav header-nav-options">
						<li class="header-nav-brand" >
							<div class="brand-holder">
								<c:if test=""></c:if>
								<a href="principal.jsp">
									<span class="text-lg text-bold text-primary">SCEW</span>
								</a>
							</div>
						</li>
						<li>
							<a class="btn btn-icon-toggle menubar-toggle" data-toggle="menubar" href="javascript:void(0);">
								<i class="fa fa-bars"></i>
							</a>
						</li>
					</ul>
				</div>
			</div>
		</header>
	</body>
</html>

