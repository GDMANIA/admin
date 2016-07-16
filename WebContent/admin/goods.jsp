<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理-商品一级分类管理</title>
        <link rel="stylesheet" type="text/css" href="css/admin_common.css"/>
        <script type="text/javascript" src="/admin/admin/js/jQuery.1.8.3.min.js"></script>
        	<script type="text/javascript">
        		$(document).ready(function(){
        			//alert(9);
        			$.ajax({
        				type:"POST",
        				url: "goods.do",
        				success: function(msg){
        					 var json_obj = eval("(" + msg + ")");
        					 var _html = "";
        					 for(var i = 0;i < json_obj.length; i++){
        					 	//alert(json_obj[i].goods_id);
        					 	_html += "<tr>";
        						_html += "<td>"+i+"</td>";
        						_html += "<td>"+json_obj[i].goods_id+"</td>";
        						_html += "<td>"; 
        						_html += "<a href='goods_modify.jsp' class='mirif_operate'>修改</a>";
        						_html += "<a href='#' class='mirif_operate'>删除</a>";
        						_html += "<a href='#' class='mirif_operate'>上架</a>";
        						_html += "</td>";
        						_html += "<td>次分类一</td>";
        						_html += "<td>次分类二</td>";
        						_html += "<td>"; 
        						_html += "<img src=img/"+json_obj[i].goods_fivepicture+"/>";
        						_html += "<img src=img/"+json_obj[i].goods_fivepicture1+"/>";
        						_html += "<img src=img/"+json_obj[i].goods_fivepicture2+"/>";
        						_html += "<img src=img/"+json_obj[i].goods_fivepicture3+"/>";
        						_html += "<img src=img/"+json_obj[i].goods_fivepicture4+"/>";
        						_html += "</td>";
        						_html += "<td>";
        						_html += "<p class='mirif_title' title="+json_obj[i].goods_storename+">"+json_obj[i].goods_storename+"</p>";
        						_html += "</td>";
        						_html += "<td>";
        						_html += "<p class='mirif_desc' title="+json_obj[i].goods_introduce+">"+json_obj[i].goods_introduce+"</p>";
        						_html += "</td>";
        						_html += "<td>188.88</td>";
        						_html += "<td>88.88</td>";
        						_html += "<td>1880</td>";
        						_html += "<td>2016-05-01 10:09:08</td>";
        						_html += "</tr>";
        					 }
        					  $(".tbodygd").html(_html);
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
    					<h2 class="miri_h2">商品管理<small>(每页显示15套商品数据)</small></h2>
    					<div class="space10px"></div>
						<div>
							<form action="#" method="post">
								<input type="button" name="button" onclick="window.location.href='goods_add.jsp'"  style="display: inline-block;width:80px;float: left;margin-right: 50px;" value="+新增商品" />
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span>ID：</span><input type="text" name="goods_sIDkey" class="goods_sIDkey" placeholder="ex:123" style="width: 100px;"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span>标题：</span><input type="text" name="goods_stkey" class="goods_stkey" placeholder="ex:时尚" style="width: 100px;"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span>描述：</span><input type="text" name="goods_sdkey" class="goods_sdkey" placeholder="ex:天然有机" style="width: 100px;"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span>价格区间：</span><input type="text" name="goods_sphkey" class="goods_sphkey" placeholder="" style="width: 50px;"/>
								<span>-</span>
								<input type="text" name="goods_sphkey" class="goods_sphkey" placeholder="" style="width: 50px;"/>
								<input type="submit" value="搜索" style="width: 60px;"/>
							</form>
						</div>
						<div class="space10px"></div>
    					<div class="miri_form">
    						<table border="0" cellspacing="0" cellpadding="0" width="1200">
    							<thead>
	    							<tr>
	    								<th>No.</th>
	    								<th>ID</th>
	    								<th>操作</th>
	    								<th>主分类</th>
	    								<th>次分类</th>
	    								<th>头像</th>
	    								<th>标题</th>
	    								<th>描述</th>
	    								<th>市场价</th>
	    								<th>优惠价</th>
	    								<th>库存</th>
	    								<th>创建时间</th>
	    							</tr>
    							</thead>
    							<tbody class="tbodygd">
    								<tr>
	    								<td>1</td>
	    								<td>0001</td>
	    								<td>
	    									<a href="goods_modify.jsp" class="mirif_operate">修改</a>
	    									<a href="#" class="mirif_operate">删除</a>
	    									<a href="#" class="mirif_operate">上架</a>
	    									<!--
	    										<a href="#">下架</a>
	    									--> <!--选其一-->
	    								</td>
	    								<td>主分类一</td>
	    								<td>次分类二</td>
	    								<td>
	    									<img src="img/goods.jpg"/>
	    									<img src="img/goods.jpg"/>
	    									<img src="img/goods.jpg"/>
	    									<img src="img/goods.jpg"/>
	    									<img src="img/goods.jpg"/>
	    								</td>
	    								<td>
	    									<p class="mirif_title" title="【嘟嘟衣舍】韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版">
	    										【嘟嘟衣舍】韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版
	    									</p>
	    								</td>
	    								<td>
	    									<p class="mirif_desc" title="韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版">
	    										韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版韩国时尚前卫设计师最新力作潮的你哭不买就计师最新力作潮的你哭不买就后悔限量版
	    									</p>
	    								</td>
	    								<td>188.88</td>
	    								<td>88.88</td>
	    								<td>1880</td>
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