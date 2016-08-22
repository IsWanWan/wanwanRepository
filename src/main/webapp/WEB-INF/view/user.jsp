<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/8/22
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    </script>
</head>
<BODY>
<h1>Welcome to jQuery UI!</h1>
<br>
<br>

<table id="tt" class="easyui-datagrid" style="width:600px;height:auto"
       url="data/datagrid_data.json"
       title="Load Data" iconCls="icon-save">
    <thead>
    <tr>
        <th field="itemid" width="80">itemid</th>
        <th field="productid" width="80">listprice</th>
        <th field="listprice" width="80" align="right">List Price</th>
        <th field="unitcost" width="80" align="right">Unit Cost</th>
        <th field="attr1" width="150">Attribute</th>
        <th field="status" width="60" align="center">Stauts</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>we</td>
        <td>23.4</td>
        <td>23</td>
        <td>fdfsd</td>
        <td>已支付</td>
    </tr>
    <tr>
        <td>2</td>
        <td>ds</td>
        <td>21.4</td>
        <td>21</td>
        <td>dfdfsf</td>
        <td>已支付</td>
    </tr>
    <tr>
        <td>3</td>
        <td>hhh</td>
        <td>45.4</td>
        <td>45</td>
        <td>rere</td>
        <td>已支付</td>
    </tr>
    </tbody>
</table>
<input type="button" value="按钮" onclick="check()"/>
</BODY>
</html>
