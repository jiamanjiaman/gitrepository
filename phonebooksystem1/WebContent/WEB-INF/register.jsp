<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="${path }/static/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script>if(window.top !== window.self){ window.top.location = window.location;}</script>
<script type="text/javascript">
    var msg='${msg}';
    if(msg!=null && msg!=''){
    	alert(msg);
    }
    </script>
</head>
<body>
	
	
		
				<h3>欢迎注册使用</h3>
				<form class="m-t" role="form" action="${path }/doregister" method="post" />
				<div class="form-group">
					name
					<div class="form-group">
						<input type="text" class="" name="username" placeholder="请输入用户名" required="" />
					</div>
				</div>
				<div class="form-group">
					phone
					<div class="form-group">
						<input type="text" class="" name="phone" placeholder="请输入电话号码" required="" />
					</div>
				</div>
				<div class="form-group">
					age
					<div class="form-group">
						<input type="text" class="" name="age"
							placeholder="请输入年龄" required="" />
					</div>
				</div>
				<div class="form-group text-left">
					<div class="checkbox i-checks">
						<label class="checkbox"><input type="checkbox" /> 同意用户协议</label>
						<button class="btn" type="submit">注册</button>
					</div>
				</div>
				</form>
			</div>


	<script src="${path }/static/js/jquery.min.js"></script>
	<script src="${path }/static/js/bootstrap.min.js"></script>
</body>
</html>