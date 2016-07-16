<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<div class="header">
	<div class="header_inner">
		<div class="hi_left">
			<a href="main.jsp" class="hil_logo">LOGO</a>
		</div>
		<div class="hi_center">
			<h1>电子商务后台管理系统</h1>
		</div>
		<div class="hi_right">
			<span>当前用户：<b>
			
  
    
    ${cookie.a_name.value }  
    
			</b></span>　
			<a href="#">退出登录</a>
		</div>
		<div class="clear"></div>
	</div>
</div>
