<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" type="text/css" href="css/admin_login.css" />
</head>
<body>
	<div class="top_div"></div>
	<div
		style="width: 400px; height: 200px; margin: auto auto; background: #ffffff; text-align: center; margin-top: -100px; border: 1px solid #e7e7e7">
		<div style="width: 165px; height: 96px; position: absolute">
			<div class="tou"></div>
			<div id="left_hand" class="initial_left_hand"></div>
			<div id="right_hand" class="initial_right_hand"></div>
		</div>
		<form action="submit.do">
			<p style="padding: 30px 0px 10px 0px; position: relative;">
				<span class="u_logo"></span> <input class="ipt" type="text"
					placeholder="请输入用户名或邮箱" name="a_name">
			</p>
			<p style="position: relative;">
				<span class="p_logo"></span> <input id="password" class="ipt"
					type="password" placeholder="请输入密码" name="a_password">
			</p>

			<div
				style="height: 50px; line-height: 50px; margin-top: 30px; border-top: 1px solid #e7e7e7;">
				<p style="margin: 0px 35px 20px 45px;">
					<!--<span style="float: left"><a href="#" style="color:#ccc;">忘记密码?</a></span>-->
					<span style="float: right"> <!--<a href="#" style="color:#ccc;margin-right:10px;">注册</a>-->
						<!--                <a href="main.jsp" style="background: #008ead;padding: 7px 10px;border-radius: 4px;border: 1px solid #1a7598;color: #FFF;font-weight: bold;">Login</a>
 -->
 				 <input type="submit" value="Login"
						style="background: #008ead; padding: 7px 10px; border-radius: 4px; border: 1px solid #1a7598; color: #FFF; font-weight: bold;">
					</span>
				</p>
			</div>
		</form>
		
	</div>

	<div
		style="position: fixed; bottom: 0px; text-align: center; width: 100%;">
		Copyright ©2015 <a
			style="margin-left: 10px; color: #000000; text-decoration: underline"
			href="http://www.sucaihuo.com">http://www.sucaihuo.com</a>
	</div>


	<!-- <script src="js/jQuery.1.8.3.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/admin_login.js" type="text/javascript" charset="utf-8"></script> -->
</body>
</html>