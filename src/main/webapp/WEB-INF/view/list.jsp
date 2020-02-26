<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resource/index.css">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	//全选、全不选
	function chose(own){
		$("[name=check]").each(function(){
			$(this).attr("checked",own.checked);
		})
	}
	//删除影片
	function deleteAll(){
		var ids = "";
		$("[name=check]:checked").each(function(){
			ids += ","+$(this).val();
		})
		ids = ids.substring(1);
		//ajax删除
		$.post("deleteAll",{"ids":ids},function(flag){
			if(flag){
				alert("批量删除成功!");
				location="list";
			}else{
				alert("批量删除失败!");
			}
		},"json")
	}
	
	//排序
	var orderMonth = "${vo.orderMonth}"; 
	
	function myorder(orderName,pageNum){
		
		orderMonth = orderMonth=='desc'?'asc':'desc';
		
		location="list?pageNum="+pageNum+"&orderName="+orderName+"&orderMonth="+orderMonth;
	}
	//下架
	function xj(id){
		$.post("xiajia",{"id":id},function(flag){
			if(flag){
				alert("下架成功!");
				location="list";
			}else{
				alert("下架失败!");
			}
		},"json")
	}
	//上架
	function sj(id){
		$.post("shangjia",{"id":id},function(flag){
			if(flag){
				alert("上架成功!");
				location="list";
			}else{
				alert("上架失败!");
			}
		},"json")
	}
</script>
</head>
<body>
	<form action="list" method="post">
			<input type="hidden" name="pageNum">
		影片名称&nbsp;<input type="text" name="name" value="${vo.name }">&nbsp;&nbsp;
		上映时间&nbsp;<input type="text" name="t1" value="${vo.t1 }">至
					<input type="text" name="t2" value="${vo.t2 }"><br>
		导演&nbsp;<input type="text" name="actor" value="${vo.actor }">&nbsp;&nbsp;&nbsp;
		价格&nbsp;<input type="text" name="p1" value="${vo.p1 }">--
				 <input type="text" name="p2" value="${vo.p2 }"><br>
		电影年代&nbsp;<input type="text" name="years" value="${vo.years }">&nbsp;&nbsp;
		电影时长&nbsp;<input type="text" name="l1" value="${vo.l1 }">--
				 <input type="text" name="l2" value="${vo.l2 }"><br>
		<input type="submit"  class="btn btn-info" value="查询影片">
		<button >添加影片</button>
		<button onclick="deleteAll()">删除影片</button>
	</form>
	
	
	<table>
		<tr>
			<td>
				<input type="checkbox" onclick="chose(this)">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td onclick="javascript:myorder('uptime',${page.pageNum})">上映时间</td>
			<td onclick="javascript:myorder('longtime',${page.pageNum})">时长</td>
			<td>类型</td>
			<td onclick="javascript:myorder('years')">年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="m" varStatus="i">
			<tr>
				<td>
					<input type="checkbox" value="${m.id }" name="check">
				</td>
				<td>${m.name }</td>
				<td>${m.actor }</td>
				<td>${m.price }</td>
				<td>${m.uptime }</td>
				<td>${m.longtime }</td>
				<td>${m.type }</td>
				<td>${m.years }</td>
				<td>${m.area }</td>
				<td>
					<c:if test="${m.status==1}">即将上映</c:if>
					<c:if test="${m.status==2}">正在热映</c:if>
					<c:if test="${m.status==3}">已经下架</c:if>
				</td>
				<td>
					<button>详情</button>
					<button>编辑</button>
					<c:if test="${m.status==2 }">
						<button onclick="xj(${m.id})">下架</button>
					</c:if>
					<c:if test="${m.status!=2 }">
						<button onclick="sj(${m.id})">上架</button>
					</c:if>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				当前${page.pageNum }页/共${page.pages }页，共${page.total }条
			</td>
		</tr>
	</table>
	
</body>
</html>