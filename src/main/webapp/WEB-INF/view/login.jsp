<%--
  Created by IntelliJ IDEA.
  User: wanwan
  Date: 16/7/10
  Time: 下午6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="post" action="/login/login" >

      <table>
          <tr>

            <td> 姓名:</td>
              <td><input type="text"  name="username"></td>

          </tr>
          <tr>
              <td>密码:</td>
              <td><input type="text" name="password"></td>
          </tr>
          <tr>

              <td><input type="submit" value="提交"></td>
          </tr>
      </table>

  </form>
</body>
</html>
