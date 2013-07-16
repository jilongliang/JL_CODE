<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<style type="text/css">
		.td{
			background-color:blue;
			azimuth: grad;
			border: thin;
			padding: em;
		}
		#td{
			cursor: pointer;
			border-style: outset;
			background-repeat: repeat;
			background-color: green;
		}
	</style>
	</head>

	<body>
		<form action="" method="get">
			<table align="center" border="1">
				<tr>
					<td ><a href="http://www.baidu.com">百度</a></td>
					<td><a href="http://www.google.com">谷歌</a></td>
					<td><a href="http://www.csdn.net">csdn</a></td>
				</tr>
				<tr>
					<td class="td"><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=programming-base&show=time">编程基础</a></td>
					<td id="td"><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=web-backend-development&show=time">Web编程</a></td>
					<td class="td"><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=database-programming&show=time">数据库编程</a></td>
				</tr>
				<tr>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=web-frontend-development&show=time">网页设计与交互</a></td>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=network-programming&show=time">网络编程</a></td>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=php&catalog=&show=time">PHP编程</a></td>
				</tr>
				<tr>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=graphical-interface-development-&show=time">图形界面开发/GUI/CGI</a></td>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=mobile-app-development&show=time">手机App开发</a></td>
					<td><a href="http://www.oschina.net/code/list/1/java?lang=java&catalog=security-and-encryption&show=time">安全与加密</a></td>
				</tr>
			</table>
		</form>
	</body>
</html>
