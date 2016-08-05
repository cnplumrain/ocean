<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Insert title here</title>  
    </head>  
      
    <body>
    	<form method="post" action="registerP">
        <input type="text" name="UserName" placeholder="用户名" value="">
        <input type="password" name="Password" placeholder="密码" value="">
        <input type="submit" value="确定">
        </form>
     	${user.UserName}
    </body>  
</html>  