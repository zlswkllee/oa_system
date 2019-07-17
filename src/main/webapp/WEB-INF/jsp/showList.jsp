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
<title>商品列表</title>
<script type="text/javascript">
	$(function(){
		$(".delstu").click(function(){
			location.href="/deletePermRole?"+"rid="+$("#stuselect").val()+"&uid=" + $(".delstu").attr("id")+"&flag=" +1;
		});
	});
	$(function(){
		$(".addstu").click(function(){
			location.href="/addPermRole?"+"rid="+$("#stuaddselect").val()+"&uid=" + $(".delstu").attr("id")+"&flag=" +1;
		});
	});
	/*讲师*/
	$(function(){
		$(".deltea").click(function(){
			location.href="/deletePermRole?"+"rid="+$("#teaselect").val()+"&uid=" + $(".deltea").attr("id")+"&flag=" +2;
		});
	});
	$(function(){
		$(".addtea").click(function(){
			location.href="/addPermRole?"+"rid="+$("#teaaddselect").val()+"&uid=" + $(".deltea").attr("id")+"&flag=" +2;
		});
	});
	/*班主任*/
	$(function(){
		$(".deladv").click(function(){
			location.href="/deletePermRole?"+"rid="+$("#advselect").val()+"&uid=" + $(".deladv").attr("id")+"&flag=" +3;
		});
	});
	$(function(){
		$(".addadv").click(function(){
			location.href="/addPermRole?"+"rid="+$("#advaddselect").val()+"&uid=" + $(".deladv").attr("id")+"&flag=" +3;
		});
	});
	/*校长*/
	$(function(){
		$(".dellea").click(function(){
			location.href="/deletePermRole?"+"rid="+$("#leaselect").val()+"&uid=" + $(".dellea").attr("id")+"&flag=" +4;
		});
	});
	$(function(){
		$(".addlea").click(function(){
			location.href="/addPermRole?"+"rid="+$("#leaaddselect").val()+"&uid=" + $(".dellea").attr("id")+"&flag=" +4;
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
					<span class="badge"	style="background-color: red;">23</span>
				</a>
			</li>
			<li>
				<a href="/jump">
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
							<a href="#" id="addleave">
								<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<b>请假申请</b>
							</a>
						</li>
						<li>
							<a href="#" id="dealleave">
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
							<a href="/showList" id="permmanage">
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
		<div class="row" style="width:98%;margin-left: 1%;">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						权限角色列表
					</div>
					<div class="panel-body">
						<div class="row">

						</div>
						<div style="height: 400px;overflow: scroll;">
							<div><h3><strong>学生</strong></h3></div>
							<table id="tb_list" class="table table-striped table-hover table-bordered ">
								<tr>
									<td>序号</td><td>姓名</td><td>角色名称</td><td>操作</td>
								</tr>
								<c:forEach items="${rolesStudent }" var="r" varStatus="i">
									<tr id ="tr${r.urid }">
										<td>${i.count }</td>
										<td>${r.student.sname }</td>
										<td>
											<c:forEach items="${r.roleList}" var="ro" >
												${ro.rolename }&nbsp;
											</c:forEach>
										</td>
										<td>
											<select id="stuselect" >
												<option value="0">请选择</option>
												<c:forEach items="${r.roleList}" var="ro" >
													<option value="${ro.rid }">${ro.rolename }</option>
												</c:forEach>

											</select>
												<%--删除需要sid rid--%>
											<button class="delstu btn btn-default" id="${r.student.sid }">删除</button>
											<select id="stuaddselect" >
												<option value="0" >请选择</option>
												<c:forEach items="${allroles}" var="role">
													<c:set var="flag" value="true" ></c:set>
													<c:forEach items="${r.roleList}" var="ro" >

														<c:if test="${role.rid ==  ro.rid && flag==true}">
															<c:set var="flag" value="false" ></c:set>
														</c:if>
													</c:forEach>
													<c:if test="${flag==true}">
														<option value="${role.rid}">${role.rolename }</option>
													</c:if>
												</c:forEach>



											</select>
											<button class="addstu btn btn-default">增加</button>
										</td>

											<%--<td><a href="javascrip:void(0)" class="del" id="${goods.id }">删除</a> &nbsp;<a href="/fengmi/updateGoodsServlet?gid=${goods.id }">修改</a> &nbsp;
                                                <a tabindex="0" id="example${goods.id}" class="btn btn-primary btn-xs"
                                                role="button" data-toggle="popover"
                                                data-trigger="focus"
                                                data-placement="left"
                                                data-content="${goods.intro}">描述</a>
                                            </td>--%>
									</tr>
								</c:forEach>

							</table>

							<div><h3><strong>讲师</strong></h3></div>
							<table id="tea_list" class="table table-striped table-hover table-bordered ">
								<tr>
									<td>序号</td><td>姓名</td><td>角色名称</td><td>操作</td>
								</tr>
								<c:forEach items="${rolesTeacher }" var="r" varStatus="i">
									<tr id ="tr${r.urid }">
										<td>${i.count }</td>
										<td>${r.teacher.tname }</td>
										<td>
											<c:forEach items="${r.role}" var="ro" >
												${ro.rolename }&nbsp;
											</c:forEach>
										</td>
										<td>
											<select id="teaselect" >
												<option value="0">请选择</option>
												<c:forEach items="${r.role}" var="ro" >
													<option value="${ro.rid }">${ro.rolename }</option>
												</c:forEach>

											</select>
												<%--删除需要sid rid--%>
											<button class="deltea btn btn-default" id="${r.teacher.tid }">删除</button>
											<select id="teaaddselect" >
												<option value="0" >请选择</option>
												<c:forEach items="${allroles}" var="role">
													<c:set var="flag" value="true" ></c:set>
													<c:forEach items="${r.role}" var="ro" >

														<c:if test="${role.rid ==  ro.rid && flag==true}">
															<c:set var="flag" value="false" ></c:set>
														</c:if>
													</c:forEach>
													<c:if test="${flag==true}">
														<option value="${role.rid}">${role.rolename }</option>
													</c:if>
												</c:forEach>



											</select>
											<button class="addtea btn btn-default">增加</button>
										</td>

									</tr>
								</c:forEach>

							</table>

							<div><h3><strong>班主任</strong></h3></div>
							<table id="adv_list" class="table table-striped table-hover table-bordered ">
								<tr>
									<td>序号</td><td>姓名</td><td>角色名称</td><td>操作</td>
								</tr>
								<c:forEach items="${rolesAdvisor }" var="r" varStatus="i">
									<tr id ="tr${r.urid }">
										<td>${i.count }</td>
										<td>${r.adviser.aname }</td>
										<td>
											<c:forEach items="${r.role}" var="ro" >
												${ro.rolename }&nbsp;
											</c:forEach>
										</td>
										<td>
											<select id="advselect" >
												<option value="0">请选择</option>
												<c:forEach items="${r.role}" var="ro" >
													<option value="${ro.rid }">${ro.rolename }</option>
												</c:forEach>

											</select>
												<%--删除需要sid rid--%>
											<button class="deladv btn btn-default" id="${r.adviser.aid }">删除</button>
											<select id="advaddselect" >
												<option value="0" >请选择</option>
												<c:forEach items="${allroles}" var="role">
													<c:set var="flag" value="true" ></c:set>
													<c:forEach items="${r.role}" var="ro" >

														<c:if test="${role.rid ==  ro.rid && flag==true}">
															<c:set var="flag" value="false" ></c:set>
														</c:if>
													</c:forEach>
													<c:if test="${flag==true}">
														<option value="${role.rid}">${role.rolename }</option>
													</c:if>
												</c:forEach>



											</select>
											<button class="addadv btn btn-default">增加</button>
										</td>

									</tr>
								</c:forEach>

							</table>

							<div><h3><strong>校长</strong></h3></div>
							<table id="lea_list" class="table table-striped table-hover table-bordered ">
								<tr>
									<td>序号</td><td>姓名</td><td>角色名称</td><td>操作</td>
								</tr>
								<c:forEach items="${rolesLeader }" var="r" varStatus="i">
									<tr id ="tr${r.urid }">
										<td>${i.count }</td>
										<td>${r.leader.lname }</td>
										<td>
											<c:forEach items="${r.role}" var="ro" >
												${ro.rolename }&nbsp;
											</c:forEach>
										</td>
										<td>
											<select id="leaselect" >
												<option value="0">请选择</option>
												<c:forEach items="${r.role}" var="ro" >
													<option value="${ro.rid }">${ro.rolename }</option>
												</c:forEach>

											</select>
												<%--删除需要sid rid--%>
											<button class="dellea btn btn-default" id="${r.leader.lid }">删除</button>
											<select id="leaaddselect" >
												<option value="0" >请选择</option>
												<c:forEach items="${allroles}" var="role">
													<c:set var="flag" value="true" ></c:set>
													<c:forEach items="${r.role}" var="ro" >

														<c:if test="${role.rid ==  ro.rid && flag==true}">
															<c:set var="flag" value="false" ></c:set>
														</c:if>
													</c:forEach>
													<c:if test="${flag==true}">
														<option value="${role.rid}">${role.rolename }</option>
													</c:if>
												</c:forEach>



											</select>
											<button class="addlea btn btn-default">增加</button>
										</td>

									</tr>
								</c:forEach>

							</table>
						</div>
					</div>

				</div>
			</div>
		</div>

	</div>



</body>
</html>