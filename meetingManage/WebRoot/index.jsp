<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加员工</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
	
  </head>
  
  <body>

<form class="form-horizontal col-lg-offset-4">
    <fieldset>
        <h3>填写新员工信息</h3>
        <div class="form-group">
            <label for="name" class="col-md-2 control-label">姓名：</label>
            <div class="col-md-5">
                <input type="text" id="name" placeholder="姓名" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="gender" class="col-md-2 control-label">性别：</label>
            <div class="col-md-5">
                <label class="radio-inline">
                    <input id="female" name="gender" type="radio" value="0" checked="checked"/>女
                </label>
                <label class="radio-inline">
                    <input id="male" name="gender" type="radio" value="1"  />男
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="birthday" class="col-md-2 control-label">出生日期：</label>
            <div class="col-md-5">
                <input type="date" id="birthday" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="edu" class="col-md-2 control-label">学历：</label>
            <div class="col-md-5">
                <select id="edu" class="form-control" >
                    <option>高中</option>>
                    <option>大专</option>
                    <option selected>大学本科</option>
                    <option>硕士</option>
                    <option>博士</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="location" class="col-md-2 control-label">住址：</label>
            <div class="col-md-5">
                <input type="text" id="location" placeholder="住址" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="department" class="col-md-2 control-label">所属部门：</label>
            <div class="col-md-5">
                <select id="department" class="form-control" >
                    <option>市场部</option>
                    <option>财务部</option>
                    <option selected>人事部</option>
                    <option>武装部</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="post" class="col-md-2 control-label">职位：</label>
            <div class="col-md-5">
                <select id="post" class="form-control" >
                    <option>组长</option>
                    <option>副组长</option>
                    <option selected>员工</option>
                    <option>部门经理</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="salary" class="col-md-2 control-label">基本工资：</label>
            <div class="col-md-5">
                <input type="text" id="salary" placeholder="基本工资" class="form-control" />
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-md-2 control-label">邮箱：</label>
            <div class="col-md-5">
                <input type="text" id="email" placeholder="邮箱" class="form-control" />
            </div>
        </div>
        <div class="col-lg-offset-3">
            <button type="button" class="btn btn-primary">确定</button>
            <button type="button" class="btn btn-default" href="#">取消</button>
            <button type="button" class="btn btn-group">重置</button>
        </div>
    </fieldset>
</form>


<script src="javascripts/jquery.js"></script>
<script src="javascripts/angular.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>
