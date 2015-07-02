<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>人员管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
	<style>
		 .invalid{
           color: red;
       }
       .valid{
           color: green;
       }

	</style>

  </head>
  
  <body>
   <div class="container col-md-9">
    <table class="table table-striped table-bordered">
        <caption>
            <h4><strong>查询结果</strong></h4>
            <ul class="pagination pagination-sm" style="float:left;">
                <li title="第一页"><a href="#">&laquo;</a></li>
                <li title="上一页"><a href="#">&lsaquo;</a></li>
                <li title="当前页" class="active"><a href="#">3</a></li>
                <li title="下一页"><a href="#">&rsaquo;</a></li>
                <li title="最末页"><a href="#">&raquo;</a></li>
                <li>
                    <a href="">共<strong>98</strong>条记录，<strong>10</strong>页</a>
                </li>
            </ul>
            <div style="float:right;padding:5px">
                <button type="button" class="btn btn-primary"
                        data-toggle="modal" data-target="#add">添加员工</button>
            </div>
        </caption>
        <thead>
        <tr>
            <th>职工号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>地址</th>
            <th>邮箱</th>
            <th>工资</th>
            <th>所属部门</th>
            <th>职位</th>
            <th>学历</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>10001</td>
            <td>Jerry</td>
            <td>男</td>
            <td>25</td>
            <td>北京</td>
            <td>123@abc.com</td>
            <td>200</td>
            <td>技术部</td>
            <td>普通员工</td>
            <td>本科</td>
            <td>
                <button type="button" class="btn btn-success"
                        data-toggle="modal" data-target="#modify">编辑</button>
                <a href="#" class="btn btn-danger btn-sm" onclick="deleteConfirm();">删除</a>
            </td>
        </tr>
        <tr>
            <td>10002</td>
            <td>Jam</td>
            <td>男</td>
            <td>25</td>
            <td>北京</td>
            <td>123@abc.com</td>
            <td>200</td>
            <td>技术部</td>
            <td>普通员工</td>
            <td>本科</td>
            <td>
                <button type="button" class="btn btn-success"
                        data-toggle="modal" data-target="#modify">编辑</button>
                <a href="#" class="btn btn-danger btn-sm" onclick="deleteConfirm();">删除</a>
            </td>
        </tr>
        <tr>
            <td>10003</td>
            <td>David</td>
            <td>男</td>
            <td>25</td>
            <td>北京</td>
            <td>123@abc.com</td>
            <td>200</td>
            <td>技术部</td>
            <td>普通员工</td>
            <td>本科</td>
            <td>
                <button type="button" class="btn btn-success"
                        data-toggle="modal" data-target="#modify">编辑</button>
                <a href="#" class="btn btn-danger btn-sm" onclick="deleteConfirm();">删除</a>
            </td>
        </tr>
        <tr>
            <td>10004</td>
            <td>Nancy</td>
            <td>男</td>
            <td>25</td>
            <td>北京</td>
            <td>123@abc.com</td>
            <td>200</td>
            <td>技术部</td>
            <td>普通员工</td>
            <td>本科</td>
            <td>
                <button type="button" class="btn btn-success"
                        data-toggle="modal" data-target="#modify">编辑</button>
                <a href="#" class="btn btn-danger btn-sm" onclick="deleteConfirm();">删除</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<!-- 修改对话框开始 -->
<div id="modify" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">修改员工</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="username" class="control-label col-md-2">姓名：</label>
                        <div class="col-md-8">
                            <input type="text" id="username" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="control-label col-md-2">年龄：</label>
                        <div class="col-md-8">
                            <input type="password" id="password" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="control-label col-md-2">职位：</label>
                        <div class="col-md-8">
                            <label class="radio-inline">
                                <input id="man" name="position" type="radio" value="1"checked="checked" />部门员工
                            </label>
                            <label class="radio-inline">
                                <input id="manager" name="position" type="radio" value="0"  />部门经理
                            </label>
                            <label class="radio-inline">
                                <input id="boss" name="position" type="radio" value="0"  />总经理
                            </label>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="gender" class="col-md-2 control-label">性别：</label>
                        <div class="col-md-8">
                            <label class="radio-inline">
                                <input id="female" name="gender" type="radio" value="0" />女
                            </label>
                            <label class="radio-inline">
                                <input id="male" name="gender" type="radio" value="1" checked="checked" />男
                            </label>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="birthday" class="col-md-2 control-label">生日：</label>
                        <div class="col-md-8">
                            <input type="date" id="birthday" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="homeland" class="col-md-2 control-label">部门：</label>
                        <div class="col-md-8">
                            <select id="homeland" class="form-control">
                                <option value="">选择一个部门</option>
                                <option value="1">技术部</option>
                                <option value="2">销售部</option>
                                <option value="3">市场部</option>
                                <option value="4">人事部</option>
                                <option value="5">财务部</option>

                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="address" class="col-md-2 control-label">地址：</label>
                        <div class="col-md-8">
                            <input type="text" id="address" placeholder="地址" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="col-md-2 control-label">邮箱：</label>
                        <div class="col-md-8">
                            <input type="text" id="email" placeholder="邮箱" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="tel" class="col-md-2 control-label">电话：</label>
                        <div class="col-md-8">
                            <input type="text" id="tel" placeholder="电话" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="salary" class="col-md-2 control-label">工资：</label>
                        <div class="col-md-8">
                            <input type="text" id="salary" placeholder="工资" class="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="number" class="col-md-2 control-label">职工号：</label>
                        <div class="col-md-8">
                            <input type="text" id="number" placeholder="职工号" class="form-control" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="eduction" class="col-md-2 control-label">学历：</label>
                        <div class="col-md-8">
                            <input type="text" id="eduction" placeholder="学历" class="form-control" />
                        </div>
                    </div>







                    <div class="text-center form-group">
                        <button type="button" class="btn btn-default">确定</button>
                        <button type="button" class="btn btn-default">取消</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <div class="text-center">

                </div>
            </div>
        </div>
    </div>
</div>
<!-- 修改对话框结束 -->


<!-- 添加对话框开始 -->
<div id="add" class="modal fade" ng-app="register" ng-controller="registerVerify">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">添加员工</h4>
            </div>
            <div class="modal-body">
            {{clerk}}
                <form name="regForm" class="form-horizontal"   ng-submit="add(regForm.$valid)">
    <fieldset>
        
        <div class="form-group">
            <label for="name" class="col-md-3 control-label">姓名：</label>
            <div class="col-md-8">
                <input type="text" id="name" name="name" placeholder="姓名" class="form-control" ng-model="clerk.name" required/><span class="invalid" ng-show="regForm.name.$error.required">姓名必填</span>
                <span class="valid" ng-show="!regForm.name.$error.required">OK</span>
            </div>
        </div>
        <div class="form-group">
            <label for="gender" class="col-md-3 control-label">性别：</label>
            <div class="col-md-8">
                <label class="radio-inline">
                    <input id="female" name="gender" type="radio" value="0" ng-model="clerk.gendar" ng-checked="true"/>女
                </label>
                <label class="radio-inline">
                    <input id="male" name="gender" type="radio" value="1"  ng-model="clerk.gendar"/>男
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="birthday" class="col-md-3 control-label">出生日期：</label>
            <div class="col-md-8">
                <input type="date" id="birthday" class="form-control" name="birthday" ng-model="clerk.birthday" required/><span class="invalid" ng-show="regForm.birthday.$error.required">生日必填</span>
                <span class="valid" ng-show="!regForm.birthday.$error.required">OK</span>
            </div>
        </div>
        <div class="form-group">
            <label for="edu" class="col-md-3 control-label">学历：</label>
            <div class="col-md-8">
                <select id="edu" class="form-control" ng-model="clerk.education">
                    <option>高中</option>
                    <option>大专</option>
                    <option selected>大学本科</option>
                    <option>硕士</option>
                    <option>博士</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="location" class="col-md-3 control-label">住址：</label>
            <div class="col-md-8">
                <input type="text" id="location" name="address" placeholder="住址" class="form-control" ng-model="clerk.address" required/><span class="invalid" ng-show="regForm.address.$error.required">住址必填</span>
                <span class="valid" ng-show="!regForm.address.$error.required">OK</span>
            </div>
        </div>
        <div class="form-group">
            <label for="department" class="col-md-3 control-label">所属部门：</label>
            <div class="col-md-8">
                <select id="department" class="form-control" ng-model="clerk.department">
                    <option>市场部</option>
                    <option>财务部</option>
                    <option ng-selected="true">人事部</option>
                    <option>武装部</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="post" class="col-md-3 control-label">职位：</label>
            <div class="col-md-8">
                <select id="post" class="form-control" ng-model="clerk.position">
                    <option>组长</option>
                    <option>副组长</option>
                    <option ng-selected="true">员工</option>
                    <option>部门经理</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="salary" class="col-md-3 control-label">基本工资：</label>
            <div class="col-md-8">
                <input type="text" id="salary" name="salary" placeholder="基本工资" class="form-control" ng-model="clerk.salary" required/><span class="invalid" ng-show="regForm.salary.$error.required">工资必填</span>
                <span class="valid" ng-show="!regForm.salary.$error.required">OK</span>
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-md-3 control-label">邮箱：</label>
            <div class="col-md-8">
                <input type="text" ng-pattern="/.+@.+\..+/" id="email" name="email" placeholder="邮箱" class="form-control" ng-model="clerk.email" required/><span class="invalid" ng-show="regForm.email.$error.required">邮件必填</span>
                <span class="valid" ng-show="!regForm.email.$error.required&&!regForm.email.$error.pattern">OK</span><span class="invalid" ng-show="regForm.email.$error.pattern">格式错误</span>
           		
            </div>
        </div>
        <div class="col-lg-offset-3">
            <input type="submit" class="btn btn-primary" value="添加" ng-disable="!regForm.$valid">
            <button type="button" class="btn btn-default" href="#">取消</button>
            <button type="reset" class="btn btn-group">重置</button>
        </div>
    </fieldset>
</form>
            </div>
            <div class="modal-footer">
                <div class="text-center">

                </div>
            </div>
        </div>
    </div>
</div>
<!-- 添加对话框结束 -->




<script src="bootstrap/js/jquery.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="javascripts/bootbox.min.js"></script>
<script src="javascripts/angular.js"></script>
<script type="text/javascript">
    function deleteConfirm() {
        bootbox.confirm("确实要删除该员工吗？", function (choice) {
            if (choice) {
                // 使用AJAX向服务器发送删除命令
                bootbox.alert("信息已经删除！");
            }
        });
    }
    
	 var register=angular.module('register',[]);
    register.controller('registerVerify',function($scope,$http){
        $scope.clerk={
        	"gendar":"0",
        	"department":"人事部",
        	"position":"员工"
        }

        $scope.verify=function(content){
            if(content==""){
				
            }
        }
        $scope.add=function(isvalid){
            if(isvalid==true){
            	$http.post("person/addPerson.action",$scope.clerk).success(function(result){
            		bootbox.alert("添加员工"+result);
            	});
            }
        }
    });
</script>

  </body>
</html>
