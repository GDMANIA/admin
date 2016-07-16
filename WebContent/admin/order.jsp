<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理-订单查询页</title>
        <link rel="stylesheet" type="text/css" href="css/admin_common.css"/>
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
    					<h2 class="miri_h2">订单一览</h2>
						<div class="space10px"></div>
    					<div class="miri_form">
    						<div>
    							<form action="#" method="post">
    								<span>ID：</span><input type="text" name="goods_sIDkey" class="goods_sIDkey" placeholder="ex:123" style="width: 100px;"/>
    								&nbsp;&nbsp;
    								<span>账号：</span><input type="text" name="goods_sIDkey" class="goods_sIDkey" placeholder="ex:123" style="width: 100px;"/>
    								&nbsp;&nbsp;
    								<span>用户电话：</span><input type="text" name="goods_sIDkey" class="goods_sIDkey" placeholder="ex:123" style="width: 100px;"/>
    								&nbsp;&nbsp;
    								<span>商品：</span><input type="text" name="goods_stkey" class="goods_stkey" placeholder="ex:时尚" style="width: 100px;"/>
    								&nbsp;&nbsp;
    								<span>金额区间：</span><input type="text" name="goods_sphkey" class="goods_sphkey" placeholder="" style="width: 50px;"/>
    								<span>-</span>
    								<input type="text" name="goods_sphkey" class="goods_sphkey" placeholder="" style="width: 50px;"/>
    								<input type="submit" value="查询" style="width: 60px;"/>
    							</form>
    						</div>
<style type="text/css">
table.miri_table tbody tr td{text-align: center;padding-top: 3px;}
table.miri_table tbody tr td a.show_order_detail{display: inline-block;width: 22px;height: 22px;background: url(img/show_order_detail.png) no-repeat center center;text-indent: -99999px;}
table.miri_table tbody tr td a.show_order_detail:hover{background-image: url(img/show_order_detail_hover.png);}
.order_detail table{border: 1px solid #D3D3D3;}




	.ucro_title{border-bottom: 1px solid #D3D3D3;height: 26px;line-height: 26px;background: #F2F2F2;text-align: left;}
	.ucro_title *{font-size: 11px;}
	.ucro_title span b{color:gray;}
	
	table.ucrol_li{background:#f8f8f8;}
	.ucro_content{padding-top: 10px;padding-bottom: 10px;}
	.ucro_content a.ucroc_img{display: inline-block;padding: 3px 3px;border: 1px solid #D3D3D3;float: left;margin-left: 10px;margin-right: 10px;}
	.ucro_content a.ucroc_img img{display: inline-block;float: left;width: 50px;height: 50px;}
	.ucro_content p.ucroc_title{display: inline-block;width: 340px;margin-top: 10px;float: left;font-size: 11px;text-align: left;}
	.ucro_content span.ucroc_count{display: inline-block;width: 85px;float: left;margin-top: 10px;text-align: center;margin-left: 2px;width: 50px;color: gray;}
		.ucroc_block{float: left;margin: 5px 10px;}



</style>
    						<table class="miri_table" border="0" cellspacing="0" cellpadding="0" width="100%">
    							<thead>
	    							<tr>
	    								<th>No.</th>
	    								<th>ID</th>
	    								<th>用户账号</th>
	    								<th>联系电话</th>
	    								<th>订单金额</th>
	    								<th>订单状态</th>
	    								<th>创建时间</th>
	    								<th>查看详情</th>
	    								<th>操作</th>
	    							</tr>
    							</thead>
    							<tbody>
	    							<tr>
	    								<td>1</td>
	    								<td>0001</td>
	    								<td>yuzhilongx@163.com</td>
	    								<td>18994028876</td>
	    								<td>1890.90</td>
	    								<td>待发货</td>
	    								<td>2016-05-01 10:09:08</td>
	    								<td>
	    									<a href="JavaScript:void(0);" class="show_order_detail">show_order_detail</a>
	    								</td>
	    								<td>
	    									<a href="#">删除</a>
	    									<a href="#">发货</a>
	    								</td>
	    							</tr>
	    							<!--动态显示order详情数据行-->
	    							<tr>
	    								<td colspan="9">
	    									<div class="order_detail" style="display: none;">
	    										<!--以下为ajax动态操作的内容-->
												<table class="ucrol_li" border="0" cellspacing="0" cellpadding="0" width="100%">
													<tr>
														<td colspan="4">
															<div class="ucro_title">
																&nbsp;
																<span>2016-07-04 12:18:50</span>
																&nbsp;&nbsp;&nbsp;
																<span><b>订单号：</b>ABC20160709121018888888</span>
															</div>
														</td>
													</tr>
													<tr class="ucro_content">
														<td>
															<div class="ucroc_block">
																<a href="../page_goods/detail.html" class="ucroc_img">
																	<img src="../../goodsImg/goods.jpg"/>
																</a>
																<p class="ucroc_title">
																	韩国时尚前卫设计师最新力作潮的你哭不买就后悔限量版
																</p>
																<span class="ucroc_count">x1</span><br />
																<span class="">成交价：<b>18.88</b>元</span>
															</div>
															<div class="ucroc_block">
																<a href="#" class="ucroc_img">
																	<img src="../../goodsImg/goods.jpg"/>
																</a>
																<p class="ucroc_title">
																	韩国时尚前卫设计师最新力作潮的你哭不买就后悔限量版
																</p>
																<span class="ucroc_count">x1</span><br />
																<span class="">成交价：<b>18.88</b>元</span>
															</div>
															<div class="ucroc_block">
																<a href="#" class="ucroc_img">
																	<img src="../../goodsImg/goods.jpg"/>
																</a>
																<p class="ucroc_title">
																	韩国时尚前卫设计师最新力作潮的你哭不买就后悔限量版
																</p>
																<span class="ucroc_count">x1</span><br />
																<span class="">成交价：<b>18.88</b>元</span>
															</div>
														</td>
													</tr>
												</table>
											</div>
	    								</td>
	    							</tr>
	    							
	    							
	    							<tr>
	    								<td>1</td>
	    								<td>0001</td>
	    								<td>yuzhilongx@163.com</td>
	    								<td>18994028876</td>
	    								<td>1890.90</td>
	    								<td>待发货</td>
	    								<td>2016-05-01 10:09:08</td>
	    								<td>
	    									<a href="JavaScript:void(0);" class="show_order_detail">show_order_detail</a>
	    								</td>
	    								<td>
	    									<a href="#">删除</a>
	    									<a href="#">发货</a>
	    								</td>
	    							</tr>
	    							<!--动态显示order详情数据行-->
	    							<tr>
	    								<td colspan="9">
	    									<div class="order_detail" style="display: none;">
	    										<!--以下为ajax动态操作的内容-->
												<table class="ucrol_li" border="0" cellspacing="0" cellpadding="0" width="100%">
													<tr>
														<td colspan="4">
															<div class="ucro_title">
																&nbsp;
																<span>2016-07-04 12:18:50</span>
																&nbsp;&nbsp;&nbsp;
																<span><b>订单号：</b>ABC20160709121018888888</span>
															</div>
														</td>
													</tr>
													<tr class="ucro_content">
														<td>
															<div class="ucroc_block">
																<a href="../page_goods/detail.html" class="ucroc_img">
																	<img src="../../goodsImg/goods.jpg"/>
																</a>
																<p class="ucroc_title">
																	韩国时尚前卫设计师最新力作潮的你哭不买就后悔限量版
																</p>
																<span class="ucroc_count">x1</span><br />
																<span class="">成交价：<b>18.88</b>元</span>
															</div>
														</td>
													</tr>
												</table>
											</div>
	    								</td>
	    							</tr>
	    							
	    							
    							</tbody>
    						</table>
    						<div class="space20px"></div>
    					</div>
    					

<script src="js/jQuery.1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
$(function(){
	$(".show_order_detail").live("click",function(){
		//这里向ajax向后台请求数据
		
			//将数据fill完毕后调用线面这句 显示出来
			var $this = $(this) ;
			$this.parent("td").parent("tr").next("tr").children("td").children(".order_detail").toggle();
	});
});
</script>
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