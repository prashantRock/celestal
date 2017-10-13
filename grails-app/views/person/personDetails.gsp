
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Person Details - Mysql</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<h2>Person Details</h2>
<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
<g:each in="${personList}" var="person" status="i">
    <tr>
        <td>${i + 1}</td>
        <td>${person.name}</td>
        <td>${person.age}</td>
    </tr>
</g:each>
    </tbody>
</table>
</div>

</body>
</html>