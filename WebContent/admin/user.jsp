<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理-会员管理页</title>
        <link rel="stylesheet" type="text/css" href="css/admin_common.css"/>
        <script type="text/javascript" src="/admin/admin/js/jQuery.1.8.3.min.js"></script>
           	<script type="text/javascript">
         
    			//alert(9);
    		  $(document).ready(function () {
    			
    			  $.ajax({
    			 type: "POST",
    	          url: "ready.do",
    	          //data: {"goods_id": goods_id},
    	          success: function (msg) {
    	           var json_obj = eval("(" + msg + ")");
                   var _html = "";
					for (var i = 0; i < json_obj.length; i++) {
    	        	  //alert(json_obj[i].user_name);
					_html += "<tr>";
					_html += "<td>"+i+"</td>";
					_html += "<td>"+json_obj[i].user_id+"</td>";
					_html += "<td>";
					_html += "<img src='img_user_header/user_header01.png'/>";
					_html += "</td>";
					_html += "<td>";
					_html += json_obj[i].user_name;
					_html += "</td>";
					_html += "<td>";
					_html += json_obj[i].user_phonenum;
					_html += "</td>";
					_html += "<td>VIP1</td>";
					_html += "<td>1890.90</td>";
					_html += "<td>"+json_obj[i].user_regtime+"</td>";
					_html += "<td>2016-05-01 10:09:08</td>";
					_html += "</tr>";
					
					}
	                $(".tbodyre").html(_html);

    	          }
    		
    			});
    		});
    	</script>
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
    					<h2 class="miri_h2">平台会员信息</h2>
    					<div class="space10px"></div>
    					<div class="miri_form">
    						<div>
    							<form action="#" method="post">
    								<span>ID：</span><input type="text" name="goods_sIDkey" class="goods_sIDkey" placeholder="ex:123" style="width: 100px;"/>
    								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    								<span>账号：</span><input type="text" name="goods_sdkey" class="goods_sdkey" placeholder="ex:xxx@sina.com" style="width: 150px;"/>
    								&nbsp;&nbsp;&nbsp;
    								<input type="submit" value="搜索" style="width: 60px;"/>
    							</form>
    						</div>
    						<table border="0" cellspacing="0" cellpadding="0" width="100%">
    							<thead>
	    							<tr>
	    								<th>No.</th>
	    								<th>ID</th>
	    								<th>图片</th>
	    								<th>账号</th>
	    								<th>联系电话</th>
	    								<th>等级</th>
	    								<th>消费总金额</th>
	    								<th>注册时间</th>
	    								<th>最近登录时间</th>
	    							</tr>
    							</thead>
    							<tbody  class="tbodyre" >
    								<tr>
	    								<td>1</td>
	    								<td>0001</td>
	    								<td>
	    									<img src="img_user_header/user_header01.png"/>
	    								</td>
	    								<td>
	    									yuzhilongx@163.com
	    								</td>
	    								<td>
	    									18994028876
	    								</td>
	    								<td>VIP1</td>
	    								<td>1890.90</td>
	    								<td>2016-05-01 10:09:08</td>
	    								<td>2016-05-01 10:09:08</td>
	    								
	    							</tr>
    							</tbody>
    						</table>
    						<div class="space20px"></div>
    					</div>
    					
    					
						<div class="space20px"></div>
						<div class="mir_page">
							<span>当前第&nbsp;<b>1</b>&nbsp;页，共计&nbsp;<b>n</b>&nbsp;页</span>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span>
								每页显示&nbsp;
								<select name="toPage" class="toPage">
									<option value="10">10</option>
									<option value="15">15</option>
									<option value="20">20</option>
									<option value="25">25</option>
									<option value="30">30</option>
								</select>
								&nbsp;条
							</span>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a class="mirp_btn" href="#">首　页</a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class="mirp_btn" href="#">上一页</a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class="mirp_btn" href="#">下一页</a>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class="mirp_btn" href="#">末　页</a>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span>
								前往第&nbsp;
								<select name="toPage" class="toPage">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
								</select>
								&nbsp;页
							</span>
						</div>
    				</div>
    			</div>
    			<div class="clear"></div>
    		</div>
    	</div>
    	
    	
    	
    	
    	
    	<%@ include file="common_footer.jsp" %> 
 
 	</body>
 	
</html>