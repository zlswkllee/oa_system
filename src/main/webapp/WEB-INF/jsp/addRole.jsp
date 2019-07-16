<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>

<title>商品分类</title>
<script type="text/javascript">

/*	$(function(){
		$("#search").click(function(){
			 location.href="/fengmi/ShowGoodsTypeServlet?"+"level="+$("#level").val()+"&name=" + $("#name").val();
		});		
	});*/
	$(function(){
		$(".del").click(function(){
			var rid = $(this).attr("id");
			$.post("/deleteRole",{rid:rid},function(d){

				alert(data);
				$("#tr"+rid).remove();
			},"text");
		});
	});


</script>
</head>
<body>
<div class="row" style="width:98%;margin-left: 1%;">
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				角色分类
			</div>
			<div class="panel-body">
				
				<form action="${pageContext.request.contextPath }/addRole" method="post">

				<div class="row">
					<div class="form-group form-inline">
						<span>角色名称</span>
						<input type="text" name="rolename" class="form-control" id="inRoleName">
					</div>
				</div>

				<div class="row">
					<div class="btn-group">
						<button type="reset" class="btn btn-default">清空</button>
						<button type="submit" class="btn btn-default btn-primary" id="addRoleBtn">添加</button>
					</div>
				</div>
			</form>
			
				<div style="height: 400px;overflow: scroll;">
				<table id="tb_list" class="table table-striped table-hover table-bordered">
					<tr>
						<td>序号</td><td>角色名称</td><td>操作</td>
					</tr>
					<c:forEach items="${roles }" var="i" varStatus="index">
						
						<tr id="tr${i.rid }">
							<td>${index.count }</td>
							<td>${i.rolename }</td>

							<td>
								<a href="/updateShow?rid=${i.rid }"><button >修改</button></a>&nbsp;&nbsp;
								<button class="del" id="${i.rid }">删除</button>
							</td>
						</tr>
					</c:forEach>
					
					
				</table>
				</div>
			</div>
			
		</div>
	</div>
</div>
</body>
</html>