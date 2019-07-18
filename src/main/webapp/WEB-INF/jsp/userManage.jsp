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
	/*?"+"level="+$("#level").val()+"&name=" + $("#name").val();*/
	$(function(){
		$("#search").click(function(){
			var flag = $("#flagselect").val()
			var username = $("#username").val()
			 location.href="/findUser?flag=" + flag +"&username="+username;
		});		
	});
	$(function(){
		$(".studel").click(function(){
			var sid = $(this).attr("id");
			$.post("/deleteUserManage",{sid:sid,flag:1},function(d){
				alert(d[0]);
				var i = d[1]
				if(i > 0){
					$("#stutr"+sid).remove();
				}

			},"json");
		});
	});


</script>
</head>
<body>
<div class="row" style="width:98%;margin-left: 1%;">
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				用户登录信息
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
						<div class="form-group form-inline">
							<span>用户名</span>
							<input type="text" id = "username" class="form-control">
						</div>
					</div>
					<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
						<div class="form-group form-inline">
                            <select class="form-control" id="flagselect">
								<option value="0">未选择</option>
                                <option value="1">学生</option>
                                <option value="2">讲师</option>
                                <option value="3">班主任</option>
                                <option value="4">校长</option>
                            </select>

						</div>
					</div>
					<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
						<button type="button" class="btn btn-primary" id="search" >搜索</button>
					</div>
				</div>

				<div style="height: 400px;overflow: scroll;">
					<c:if test="${stuList != null}">
						<h4><strong>学生</strong></h4>
						<table id="tb_list" class="table table-striped table-hover table-bordered">
							<tr>
								<td>序号</td><td>用户名</td><td>操作</td>
							</tr>
							<c:forEach items="${stuList }" var="i" varStatus="v">
								<tr id="stutr${i.sid }">
									<td>${v.count }</td>
									<td>${i.username }</td>
									<td>
										<a href="/updatePass?sid=${i.sid }&flag=1"><button class="btn btn-default">重置密码</button></a>&nbsp;&nbsp;
										<button class="studel btn btn-default" id="${i.sid }">删除</button>
									</td>
								</tr>
							</c:forEach>
						</table>
					</c:if>
					<c:if test="${teaList!=null }">
						<h4><strong>讲师</strong></h4>
						<table id="tea_list" class="table table-striped table-hover table-bordered">
							<tr>
								<td>序号</td><td>用户名</td><td>操作</td>
							</tr>
							<c:forEach items="${teaList }" var="i" varStatus="v">
								<tr id="teatr${i.tid }">
									<td>${v.count }</td>
									<td>${i.username }</td>
									<td>
										<a href="/updatePass?sid=${i.tid }&flag=2"><button class="btn btn-default">重置密码</button></a>&nbsp;&nbsp;
										<button class="teadel btn btn-default" id="${i.tid }">删除</button>
									</td>
								</tr>
							</c:forEach>
						</table>
					</c:if>
					<c:if test="${advList!=null }">
						<h4><strong>班主任</strong></h4>
						<table id="adv_list" class="table table-striped table-hover table-bordered">
							<tr>
								<td>序号</td><td>用户名</td><td>操作</td>
							</tr>
							<c:forEach items="${advList }" var="i" varStatus="v">
								<tr id="advtr${i.aid }">
									<td>${v.count }</td>
									<td>${i.username }</td>
									<td>
										<a href="/updatePass?sid=${i.aid }&flag=3"><button class="btn btn-default">重置密码</button></a>&nbsp;&nbsp;
										<button class="advdel btn btn-default" id="${i.aid }">删除</button>
									</td>
								</tr>
							</c:forEach>
						</table>
					</c:if>
					<c:if test="${leaList!=null }">
						<h4><strong>校长</strong></h4>
						<table id="lea_list" class="table table-striped table-hover table-bordered">
							<tr>
								<td>序号</td><td>用户名</td><td>操作</td>
							</tr>
							<c:forEach items="${leaList }" var="i" varStatus="v">
								<tr id="leatr${i.lid }">
									<td>${v.count }</td>
									<td>${i.username }</td>
									<td>
										<a href="/updatePass?sid=${i.lid }&flag=4"><button class="btn btn-default">重置密码</button></a>&nbsp;&nbsp;
										<button class="leadel btn btn-default" id="${i.lid }">删除</button>
									</td>
								</tr>
							</c:forEach>
						</table>
					</c:if>
				</div>
			</div>
			
		</div>
	</div>
</div>
</body>
</html>