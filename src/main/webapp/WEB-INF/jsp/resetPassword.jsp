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
	<script src="/js/jquery.validate.min.js"></script>
	<script src="/js/messages_zh.js"></script>

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

				alert(d[0]);
				var i = d[1]
				if(i > 0){
					$("#tr"+rid).remove();
				}

			},"json");
		});
	});



		$(function(){

			$("#ff").validate({
				rules:{

					pass:{required:true,digits:true},
					repass:{equalTo:"[name='password']"}

				},
				messages:{

					pass:{required:"必填字段",digits:"密码为数字"},
					repass:{equalTo:"输入不一致"}
				}
			});
		})
	</script>
	<style type="text/css">

		label.error{
			color:red;
			margin-left: 5px;
		}

	</style>
</head>
<body>
<div class="row" style="width:98%;margin-left: 1%;">
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				重置密码
			</div>
			<div class="panel-body">
				
				<form action="${pageContext.request.contextPath }/updatePassdeal" method="post" id="ff">

				<div class="row">
					<div class="form-group form-inline">
						<span>重置密码：</span>
						<input type="text" name="password" class="form-control" id="pass">
					</div>
				</div>
					<div class="row">
						<div class="form-group form-inline">
							<span>确认密码：</span>
							<input type="text"  class="form-control" id="repass">
						</div>
					</div>


				<div class="row">
					<div class="btn-group">
						<button type="reset" class="btn btn-default">清空</button>
						<button type="submit" class="btn btn-default btn-primary" id="addRoleBtn">确认修改</button>
					</div>
				</div>
			</form>
			

			</div>
			
		</div>
	</div>
</div>
</body>
</html>