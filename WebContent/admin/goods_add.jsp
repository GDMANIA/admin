<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理-新增加商品页</title>
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
    					<h2 class="miri_h2">商品管理--新增加商品信息</h2>
    					<div class="space20px"></div>
    					<div class="miri_form">
							<form action="#" method="post" enctype="multipart/form-data">
								<table border="0" cellspacing="0" cellpadding="0" width="100%">
									<tr>
										<th>商品所属分类</th>
										<td>请选择一级分类：&nbsp;
											<select name="goods_categoryfirst">
												<option value="default">--请选择--</option>
												<option value="cfid1">--主分类一--</option>
												<option value="cfid2">--主分类二--</option>
												<option value="cfid3">--主分类三--</option>
											</select>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											请选择二级分类：&nbsp;
											<select name="goods_categoryfirst">
												<option value="default">--请选择--</option>
												<option value="cfid1">--次分类一--</option>
												<option value="cfid2">--次分类二--</option>
												<option value="cfid3">--次分类三--</option>
											</select>
										</td>
									</tr>
									<tr>
										<th>标题</th>
										<td>
											<input type="text" name="goods_title" class="goods_title" placeholder="请输入标题信息..." style="width: 500px;" />
										</td>
									</tr>
									<tr>
										<th>描述</th>
										<td>
											<textarea name="goods_desc" rows="4" cols="81" placeholder="请输入描述内容..." style="resize: none;"></textarea>
										</td>
									</tr>
									<tr>
										<th>图片</th>
										<td>
											<table border="0" cellspacing="0" cellpadding="0">
												<tr>
													<th>商品图</th>
													<th>商品图</th>
													<th>商品图</th>
													<th>商品图</th>
													<th>商品图</th>
												</tr>
												<tr>
													<td>
														<div id="goods_div_img01">
															<img src="img/goods.jpg" style="width: 100px;height: 100px;" id="goods_img_img01"/>
														</div>
													</td>
													<td>
														<div id="goods_div_img02">
															<img src="img/goods.jpg" style="width: 100px;height: 100px;;" id="goods_img_img02"/>
														</div>
													</td>
													<td>
														<div id="goods_div_img03">
															<img src="img/goods.jpg" style="width: 100px;height: 100px;" id="goods_img_img03"/>
														</div>
													</td>
													<td>
														<div id="goods_div_img04">
															<img src="img/goods.jpg" style="width: 100px;height: 100px;" id="goods_img_img04"/>
														</div>
													</td>
													<td>
														<div id="goods_div_img05">
															<img src="img/goods.jpg" style="width: 100px;height: 100px;" id="goods_img_img05"/>
														</div>
													</td>
													
													
												</tr>
												<tr>
													<td>
														<div id="">
															<input type="file" name="goods_img01" style="width: 120px;" 
																onchange="PreviewImage(this,'goods_img_img01','goods_div_img01');"/>
														</div>
													</td>
													<td>
														<div id="">
															<input type="file" name="goods_img01" style="width: 120px;" 
																onchange="PreviewImage(this,'goods_img_img02','goods_div_img02');"/>
														</div>
													</td>
													<td>
														<div id="">
															<input type="file" name="goods_img01" style="width: 120px;" 
																onchange="PreviewImage(this,'goods_img_img03','goods_div_img03');"/>
														</div>
													</td>
													<td>
														<div id="">
															<input type="file" name="goods_img01" style="width: 120px;" 
																onchange="PreviewImage(this,'goods_img_img04','goods_div_img04');"/>
														</div>
													</td>
													<td>
														<div id="">
															<input type="file" name="goods_img01" style="width: 120px;" 
																onchange="PreviewImage(this,'goods_img_img05','goods_div_img05');"/>
														</div>
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<th>价格</th>
										<td>
											市场价：&nbsp;&nbsp;<input type="text" name="goods_mprice" placeholder="例如：18.80" style="width: 160px;"/>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											优惠价：&nbsp;&nbsp;<input type="text" name="goods_rprice" placeholder="例如：16.80" style="width: 160px;"/>
										</td>
									</tr>
									<tr>
										<th>库存</th>
										<td>
											<input type="text" name="goods_stock" placeholder="例如：888" style="width: 220px;"/>
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
    	
    	<script src="js/jQuery.1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    	<script src="js/PreviewImage.js" type="text/javascript" charset="utf-8"></script>
 	</body>
</html>