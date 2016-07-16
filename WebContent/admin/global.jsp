<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理-主页</title>
        <link rel="stylesheet" type="text/css" href="css/admin_common.css"/>
        <link rel="stylesheet" type="text/css" href="css/global.css"/>
    </head>
    <body>
    	<%@ include file="common_header.jsp" %> 
    	
    	
    	<div class="main">
    		<div class="main_inner">
    			<div class="mi_left">
    				<%@ include file="common_left.jsp" %> 
    			</div>
    			<div class="mi_right">
					<div class="mir_inner">
						
						<!--
						logo 图片管理
						版权信息 管理
						其他
						-->
						<h2 class="miri_h2">全局参数设置</h2>
						<div class="space30px"></div>
						<div class="miri_form">
							<form action="image.do" method="post" enctype="multipart/form-data">
								<table border="0" cellspacing="0" cellpadding="0" width="100%">
									<tr>
										<th>全局LOGO图片</th>
										<td>
											<input type="file" name="global_logo" class="global_logo" />
										</td>
									</tr>
									<tr>
										<th>版权信息</th>
										<td>
											<input type="text" name="global_copy" class="global_copy" />
										</td>
									</tr>
									<tr>
										<th>&nbsp;</th>
										<td>
											<input type="submit" value="确认提交" />
										</td>
									</tr>
								</table>
							</form>
						</div>
					</div>
    				
    			</div>
    			<div class="clear"></div>
    		</div>
    	</div>
    	
    	<%@ include file="common_footer.jsp" %> 
    	
 	</body>
</html>