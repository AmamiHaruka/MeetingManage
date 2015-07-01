<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	<style>
		 .invalid{
           color: red;
       }
       .valid{
           color: green;
       }

	</style>

  </head>
  
  <form name="regForm" class="form-horizontal col-lg-offset-4" ng-app="register" ng-controller="registerVerify" ng-submit="add(regForm.$valid)">
    <fieldset>
        <h3>填写新员工信息</h3>
        <div class="form-group">
            <label for="name" class="col-md-2 control-label">姓名：</label>
            <div class="col-md-5">
                <input type="text" id="name" name="name" placeholder="姓名" class="form-control" ng-model="clerk.name" required/><span class="invalid" ng-show="regForm.name.$error.required">姓名必填</span>
                <span class="valid" ng-show="!regForm.name.$error.required">OK</span>
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
                <input type="date" id="birthday" class="form-control" name="birthday" ng-model="clerk.birthday" required/><span class="invalid" ng-show="regForm.birthday.$error.required">生日必填</span>
                <span class="valid" ng-show="!regForm.birthday.$error.required">OK</span>
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
                <input type="text" id="location" name="address" placeholder="住址" class="form-control" ng-model="clerk.address" required/><span class="invalid" ng-show="regForm.address.$error.required">住址必填</span>
                <span class="valid" ng-show="!regForm.address.$error.required">OK</span>
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
                <input type="text" id="salary" name="salary" placeholder="基本工资" class="form-control" ng-model="clerk.salary" required/><span class="invalid" ng-show="regForm.salary.$error.required">工资必填</span>
                <span class="valid" ng-show="!regForm.salary.$error.required">OK</span>
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-md-2 control-label">邮箱：</label>
            <div class="col-md-5">
                <input type="text" ng-pattern="/.+@.+\..+/" id="email" name="email" placeholder="邮箱" class="form-control" ng-model="clerk.email" required/><span class="invalid" ng-show="regForm.email.$error.required">邮件必填</span>
                <span class="valid" ng-show="!regForm.email.$error.required&&!regForm.email.$error.pattern">OK</span><span class="invalid" ng-show="regForm.email.$error.pattern">格式错误</span>
           		
            </div>
        </div>
        <div class="col-lg-offset-3">
            <input type="submit" class="btn btn-primary" value="添加">
            <button type="button" class="btn btn-default" href="#">取消</button>
            <button type="reset" class="btn btn-group">重置</button>
        </div>
    </fieldset>
</form>
<script type="text/javascript" src="bootstrap/js/jquery.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="javascripts/angular.js"></script>
<script>
	 var register=angular.module('register',[]);
    register.controller('registerVerify',function($scope){
        $scope.clerk={}

        $scope.verify=function(content){
            if(content==""){

            }
        }
        $scope.add=function(isvalid){
            console.log(isvalid)
        }
    });
</script>
  </body>
</html>
