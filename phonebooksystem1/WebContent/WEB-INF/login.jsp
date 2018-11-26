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
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span6">
				<h3>请登录</h3>
				<form class="m-t" role="form" action="${path }/dologin"
					method="post">
					<div class="form-group">
						<label class="control-label" for="inputEmail">username</label>
						<div class="form-group">
							<input type="text" class="form-control" name="username"
								placeholder="请输入用户名" required="" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label" for="inputEmail">phone</label>
						<div class="controls">
							<input type="text" class="form-control" name="phone"
								placeholder="请输入电话号码" required="" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label" for="inputPassword">age</label>
						<div class="form-group">
							<input type="text" class="form-control" name="age"
								placeholder="请输入您的年龄" required="" />
						</div>
					</div>
					<div class="form-group text-left">
						<div class="controls">
							<label class="checkbox"><input type="checkbox" />
								Remember me</label>
							<button type="submit" class="btn">登陆</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="${path }/static/js/jquery.min.js"></script>
	<script src="${path }/static/js/bootstrap.min.js"></script>
</body>
</html>