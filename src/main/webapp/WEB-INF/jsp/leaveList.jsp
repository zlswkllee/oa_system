<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/DatePicker.js"></script>
<title>待审批请假信息列表</title>
<script type="text/javascript">
	$(function(){
		$(".agree").click(function(){
			var leid = $(this).attr("id");
			$.post("agreeLeave",{leid:leid},function(d){
				alert(d.resp);
				$("#tr"+leid).remove();
			},"text");
		});
	});
</script>
	<style>
		@media ( min-width :768px ) {
			#left_tab {
				width: 250px;
				position: absolute;
				z-index: 1;
				height: 640px;
			}
			.mysearch {
				margin: 10px;
			}
			.page_main {
				margin-left: 255px;
			}
			.dv_content{
				width: 100%;
				height: 500px;
			}
		}
	</style>



</head>
<body>


	<nav class="navbar navbar-default navbar-static-top">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#left_tab,#top_right">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand">OA办公系统</a>
		</div>
		<ul id="top_right" class="collapse navbar-collapse nav navbar-nav navbar-right"	style="margin-right: 20px;">
			<li>
				<a href="#">
					<span class="badge"	style="background-color: red;">${sessionScope.username}</span>
				</a>
			</li>
			<li>
				<a href="/jump/login">
					<span class="glyphicon glyphicon-off"></span>注销
				</a>
			</li>
		</ul>
		<!--左侧边栏 -->
		<div id="left_tab" style="margin-top: 70px;" class="collapse navbar-default navbar-collapse">
			<ul class="nav panel-group" id="myPanel">
				<!--栏目-->
				<li class="panel">
					<a href="#sub0" data-toggle="collapse" data-parent="#myPanel"> 个人中心
						<span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
					</a>
					<ul id="sub0" class="nav collapse panel-collapse">
						<li>
							<a href="#" id="changepassword">
								<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<b>修改密码</b>
							</a>
						</li>
						<li>
							<a href="#" id="studentinfo">
								<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<b>资料修改</b>
							</a>
						</li>

					</ul>
				</li>
				<li class="panel">
					<a href="#sub1" data-toggle="collapse" data-parent="#myPanel"> 请假管理
						<span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
					</a>
					<ul id="sub1" class="nav collapse panel-collapse">
						<li>
							<a href="/jump/addLeave" id="addleave">
								<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<b>请假申请</b>
							</a>
						</li>
						<li>
							<a href="/leaveList" id="dealleave">
								<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<b>请假审批</b>
							</a>
						</li>
					</ul>
				</li>
				<li class="panel">
					<a href="#sub2" data-toggle="collapse" data-parent="#myPanel"> 周报管理
						<span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
					</a>
					<ul id="sub2" class="nav panel-collapse collapse">
						<li>
							<a href="../ShowGoodsTypeServlet" id="addReport">
								<span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;填写周报
							</a>
						</li>
						<li>
							<a href="../AddGoodsTypeServlet" id="showReport">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;查看周报
							</a>
						</li>
						<li>
							<a href="../AddGoodsTypeServlet" id="dealReport">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;周报打分
							</a>
						</li>
					</ul>
				</li>
				<li class="panel">
					<a href="#sub3" data-toggle="collapse" data-parent="#myPanel"> 超级管理
						<span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
					</a>
					<ul id="sub3" class="nav panel-collapse collapse">
						<li>
							<a href="../GoodsServlet" id="coursemanage" >
								<span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;课程管理
							</a>
						</li>
						<li>
							<a href="/selectRole" id="rolemanage">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;角色管理
							</a>
						</li>
						<li>
							<a href="../addGoodsServlet" id="usermanage">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;用户管理
							</a>
						</li>
						<li>
							<a href="../addGoodsServlet" id="permmanage">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;权限管理
							</a>
						</li>
						<li>
							<a href="../addGoodsServlet" id="emplmanage">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;员工管理
							</a>
						</li>
						<li>
							<a href="../addGoodsServlet" id="classmanage">
								<span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;班级管理
							</a>
						</li>
					</ul>
				</li>
				<li class="panel">
					<a href="#sub4" data-toggle="collapse" data-parent="#myPanel"> 学生管理
						<span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
					</a>
					<ul id="sub4" class="nav panel-collapse collapse">
						<li>
							<a href="#" id="showOrder">
								<span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;学生管理
							</a>
						</li>
						<li>
							<a href="#" id="addsocre">
								<span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;成绩录入
							</a>
						</li>
						<li>
							<a href="#" id="analyzescore">
								<span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;成绩分析
							</a>
						</li>

					</ul>

				</li>
			</ul>
		</div>
	</nav>
	<!--右侧部分-->
	<div class="page_main">





		<div class="row" style="width:98%;margin-left:1%;">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<div class="panel panel-default">

					<div class="panel-body">
						<div class="row">
							<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
								<div class="form-group form-inline">
								<form action="" accept-charset="UTF-8">
									<span>请假信息</span>
								</form>

								</div>
							</div>

							</form>
						</div>
						<div style="height:500px;overflow: scroll;">
							<table id="tb_list" class="table table-striped table-hover table-bordered">
								<tr>
									<td>序号</td><td>请假人</td><td>开始时间</td><td>结束时间</td><td>请假理由</td><td>操作</td>
								</tr>
								<c:forEach items="${leaves }" var="leave" varStatus="i">
									<tr id ="tr${leave.leid }">
										<td>${i.count }</td>
										<td>${leave.name }</td>
										<td>${leave.starDate }</td>
										<td>${leave.endDate }</td>
										<td>${leave.reason}</td>
										<td><button class="agree" id="${leave.leid}">审批</button></td>

							<!-- -----------------------这里tid需要调用类别表得到类别名称-------------------------- -->

									</tr>
								</c:forEach>

							</table>
						</div>
					</div>

				</div>
			</div></div>





	</div>

</body>
</html>