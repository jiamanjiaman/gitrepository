<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>

<link rel="shortcut icon" href="favicon.ico">
<link href="${path }/static/css/bootstrap.min14ed.css?v=3.3.6"
	rel="stylesheet">
<link href="${path }/static/css/font-awesome.min93e3.css?v=4.4.0"
	rel="stylesheet">
<link href="${path }/static/css/animate.min.css" rel="stylesheet">
<link href="${path }/static/css/style.min862f.css?v=4.1.0"
	rel="stylesheet">
</head>
<body>
	<div class="col-sm-6">
		<div class="ibox float-e-margins">
			<div class="ibox-title">
				<h5>完整验证表单</h5>
				<div class="ibox-tools">
					<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
					</a> <a class="dropdown-toggle" data-toggle="dropdown"
						href="form_basic.html#"> <i class="fa fa-wrench"></i>
					</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="form_basic.html#">选项1</a></li>
						<li><a href="form_basic.html#">选项2</a></li>
					</ul>
					<a class="close-link"> <i class="fa fa-times"></i>
					</a>
				</div>
			</div>
			<div class="ibox-content">
				<form class="form-horizontal m-t" id="signupForm"
					novalidate="novalidate" action="${path }/doupdate">

					<input type="hidden" name="id" value="${id }">
					<div class="form-group has-success">
						<label class="col-sm-3 control-label">新用户名：</label>
						<div class="col-sm-8">
							<input id="username" name="username"
								class="form-control help-block m-b-none" type="text"
								aria-required="true" aria-invalid="false"
								aria-describedby="username-error"> <span
								id="username-error" class="help-block m-b-none"></span>
						</div>
					</div>
					<div class="form-group has-error">
						<label class="col-sm-3 control-label">新号码</label>
						<div class="col-sm-8">
							<input id="phone" name="phone" class="form-control" type="text"
								aria-required="true" aria-describedby="phone-error"
								aria-invalid="true"> 
						</div>
					</div>
					<div class="form-group has-error">
						<label class="col-sm-3 control-label">新年龄</label>
						<div class="col-sm-8">
							<input id="age" name="age" class="form-control" type="text"
								aria-required="true" aria-describedby="confirm_phone-error"
								aria-invalid="true"> 
						</div>
					</div>

					<div class="form-group has-error">
						<div class="col-sm-8 col-sm-offset-3">
							<div class="checkbox">
								<label> <input type="checkbox" class="checkbox"
									id="agree" name="agree" aria-required="true"
									aria-describedby="agree-error"> 我已经认真阅读并同意《H+使用协议》
								</label>
							</div>
							<span id="agree-error" class="help-block m-b-none"><i
								class="fa fa-times-circle"></i> 必须同意协议后才能注册</span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8 col-sm-offset-3">
							<button class="btn btn-primary" type="submit">提交</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="${path }/static/js/jquery.min.js?v=2.1.4"></script>
	<script src="${path }/static/js/bootstrap.min.js?v=3.3.6"></script>
	<script src="${path }/static/js/content.min.js?v=1.0.0"></script>
	<script
		src="${path }/static/js/plugins/validate/jquery.validate.min.js"></script>
	<script src="${path }/static/js/plugins/validate/messages_zh.min.js"></script>
	<script src="${path }/static/js/demo/form-validate-demo.min.js"></script>
	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>
</html>
