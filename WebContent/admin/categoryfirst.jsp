<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理-商品一级分类管理</title>
<link rel="stylesheet" type="text/css" href="css/admin_common.css" />

</head>
<body>
	<%@ include file="common_header.jsp"%>


	<div class="main">
		<div class="main_inner">
			<div class="mi_left">
				<%@ include file="common_left.jsp"%>
			</div>
			<div class="mi_right">
				<div class="mir_inner">
					<h2 class="miri_h2">
						商品一级分类管理<small>(最多添加10个商品的一级分类)</small>
					</h2>
					<div class="miri_form">
						<form class="" action="categaryfirstadd.do" method="post">
							<table border="0" cellspacing="0" cellpadding="0" width="100%">
								<tr>
									<th align="right">新增加商品一级分类&nbsp;&nbsp;</th>
									<td width="210">
<!-- 									<input type="text" name="categrayfirst" class="categrayfirst" placeholder="请输入一级分类名称..." />
 -->								<input type="text" name="classfy_name11" class="categrayfirst" placeholder="请输入一级分类名称...">	
									</td>
									<td><input type="submit" value="确认添加" /></td>
								</tr>
							</table>
						</form>
						<table border="0" cellspacing="0" cellpadding="0" width="100%">

							<thead>
								<tr>
									<th>No.</th>
									<th>ID</th>
									<th>一级分类名称</th>
									<th>Admin</th>
									<th>AddTime</th>
								</tr>
								</thead>
							<tbody class="tbodyre">	
								<tr>
									<td>1</td>
									<td>0001</td>
									<td>蔬菜</td>
									<td>lg</td>
									<td>2016-05-01 10:09:08</td>
								</tr>

							</tbody>

						</table>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>





	<%@ include file="common_footer.jsp"%>
<script type="text/javascript" src="/admin/admin/js/jQuery.1.8.3.min.js"></script>
<script type="text/javascript">
	//alert(9);
	$(document).ready(function() {

		$.ajax({
			type : "POST",
			url : "showclassfy.do",
			//data: {"classfy_id": 1},
			success : function(msg) {
				var json_obj = eval("(" + msg + ")");
				var _html = "";
				for (var i = 0; i < json_obj.length; i++) {
					//alert(json_obj[i].classfy_id);
					_html += "<tr>";
					_html += "<td>"+i+"</td>";
					_html += "<td>"+json_obj[i].classfy_id+"</td>";
					_html += "<td>"+json_obj[i].classfy_name+"</td>";
 					/* _html += "<td>"+json_obj[i].keypoint_name+"</td>"; */
 					_html += "<td>"+ ${cookie.a_name.value}  +"</td>";
 					_html += "<td>2016-05-01 10:09:08</td>";
					_html += "</tr>";
				}
				$(".tbodyre").html(_html);

			}

		});
		
	});
</script>
</body>
</html>