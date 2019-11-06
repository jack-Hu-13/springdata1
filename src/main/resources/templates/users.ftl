<html>
<head>
    <title>spring boot</title>
</head>
<body>
<table border="1px">
    <thead>
    <!--tr>th*4-->
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>
            <#list list as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.gender}</td>
            </tr>
            </#list>
    </tbody>
</table>
</body>
</html>