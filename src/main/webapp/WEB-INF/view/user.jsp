<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/8/22
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>table</title>
    <link rel="stylesheet" type="text/css" href="/static/jQuery/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/jQuery/themes/icon.css" />
    <script type="text/javascript" src="/static/jQuery/jquery.min.js"></script>
    <script type="text/javascript" src="/static/jQuery/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/static/jQuery/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
      $(function () {
          $('#adminTable').datagrid({
              url: '/user/listPage',
              method: 'POST',
              title:'用户列表',
              idField: 'id',
              striped: true,  //斑马线效果
              fitColumns: true,  //自适应
              singleSelect: true,
              rownumbers: true,
              pagination: true,  //分页
              nowrap: false,
              toolbar:'#tb',
              pageSize: 10,
              pageList: [10, 20, 50, 100, 150, 200],
              remoteSort:false,
              columns: [[
                  { field: 'id', title: 'id', width: 180, align: 'left' ,sortable:true},
                  { field: 'username', title: '用户名', width: 150, align: 'left' },
                  { field: 'nickname', title: '昵称', width: 100, align: 'left' },
                  { field: 'name', title: '名称', width: 100, align: 'left' },
                  { field: 'age', title: '年龄', width: 100, align: 'right' },
                  { field: 'address', title: '地址', width: 100, align: 'right' },
                  { field: 'mobile', title: '电话', width: 100, align: 'right' }

              ]]

          });

      });

        function add(){
            alert('添加');
        }


        function check(){
            var ids=[];
            var rows = $('#tb').datagrid('getSelections');
            for(var i=0;i<rows.length;i++){
                ids.push(rows[i].itemid);

            }
            alert(ids);
        }
         //查询
        function doSearch(){
            $('#adminTable').datagrid('load',{
                username:$.trim($('#username').val())
            })
        }
    </script>
</head>
<BODY>


   <table id="adminTable" style="width:auto" >

   </table>
   <div id="tb">
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="add()">添加</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a>
   </div>
       <div style="padding: 2px;">
           用户名:<input type="text" class="textbox" name="username" id="username">
           开始日期:<input type="text" class="easyui-datetimebox" name="dataform" editable="false" size ="30">
           结束日期:<input type="text" class="easyui-datetimebox" name="dataTo" editable="false" size="30">
           <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">查询</a>
       </div>

   </div>


</BODY>
</html>
