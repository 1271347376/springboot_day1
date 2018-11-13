<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems1.0/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!${sessionScope.login.username}
					</h1>
					<table class="table">
						<tr class="table_header">
						
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Operation(删除部门员工一并删除)
							</td>
						</tr>
						<c:forEach items="${requestScope.list}" var="dept">
						<tr class="row1">
						
							<td>
								${dept.id}
							</td>
							<td>
								${dept.name}
							</td>
							<td>
								<a href="${pageContext.request.contextPath}/dept/deleteDept?id=${dept.id}">delete emp</a>&nbsp;<a href="${pageContext.request.contextPath}/ems1.0/dept/updateDept.jsp?id=${dept.id}&name=${dept.name}">update emp</a>&nbsp;<a href="${pageContext.request.contextPath}/emp/showEmp?id=${dept.id}">show emps</a>
							</td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="Add Dept" onclick="location='${pageContext.request.contextPath}/ems1.0/dept/addDept.jsp'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
