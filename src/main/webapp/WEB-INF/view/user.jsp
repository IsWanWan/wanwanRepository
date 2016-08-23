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

    <link rel="stylesheet" type="text/css" href="/static/js/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/js/themes/icon.css" />
    <script type="text/javascript" src="/static/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery.easyui.min.1.2.2.js"></script>
    <script>
        function check(){
            var ids=[];
            var rows = $('#tt').datagrid('getSelections');
            for(var i=0;i<rows.length;i++){
                ids.push(rows[i].itemid);

            }
            alert(ids);
        }

        function doSearch(){
            $('#tt').datagrid('reload',{

                username:$('#username').val()
            })
        }
    </script>
</head>
<BODY>

<div id="tb" style="padding:3px">
    <span>用户名:</span>
    <input id="username" style="line-height: 20px;border: 1px solid#cccccc">
    <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
</div>

<table id="tt" class="easyui-datagrid" style="height:auto"
       url="/user/listPage"
       title="Load Data" iconCls="icon-save" rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="itemid" >itemid</th>
        <th field="productid" >listprice</th>
        <th field="listprice"  align="right">List Price</th>
        <th field="unitcost"  align="right">Unit Cost</th>
        <th field="attr1" >Attribute</th>
        <th field="status" align="center">Stauts</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userlist}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.sex}</td>
            <td>${user.nickname}</td>
            <td>${user.mobile}</td>
            <td>${user.address}</td>
            <td>已支付</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<input type="button" value="按钮" onclick="check()"/>
</BODY>
</html>
