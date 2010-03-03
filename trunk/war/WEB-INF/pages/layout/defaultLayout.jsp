<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

	<head>
		<title><tiles:getAsString name="page.title" /></title>

		
	</head>

	<body id="base">

		<!-- PAGE -->
		<div id="pageHead">
	 		<tiles:insertAttribute name="header" />
		</div>
		
		<div id="body">
	 		<tiles:insertAttribute name="body" />
		</div>

	</body>

</html>