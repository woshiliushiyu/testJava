<%--
  Created by IntelliJ IDEA.
  User: liushiyu
  Date: 2017/6/29
  Time: 下午5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>你好这是首页面</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.1.1.min.js"></script>
  </head>
  <body>

  运行成功了;<br>

  <div onclick="request()" style="width: 100px; height: 50px;background: cyan"></div>

  <a href="<%=request.getContextPath()%>/mfblog/download?name=img.png">点击我,下载</a>


  <script type="text/javascript">

      function request() {

          alert("弹出来");

          $.ajax({
              type:"get",
              url:"<%=request.getContextPath()%>/mfblog/index?num=1&size=10",
              data:{},
              dataType:"json",
              success:function (data) {
                  console.log(data);
              },
              error:function (message) {
                  console.log("获取失败");
              }
          })
      }
  </script>
  </body>
</html>
