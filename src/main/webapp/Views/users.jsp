<%@ page import="com.example.Models.Personne" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.Models.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>hrrllo</h1>
<%

    Users<Personne> users = (Users<Personne>) request.getAttribute("Users");
    ArrayList<Personne> personnes = users.getUsers() ;


    for (int i = 0; i < personnes.size(); i++) {



%>


<tr>
    <td><%=personnes.get(i).getFirt_name()%></td>
    <td><%=personnes.get(i).getFirt_name()%></td>
    <td>12 May 2017</td>
    <td>
        <div>
            <button class="btn btn-danger">Delete</button>
            <button class="btn btn-secondary">Block</button>
            <button style="display: none;" class="btn badge-success">Inblock</button>
        </div>
    </td>
</tr>

<%


    }


%>

</body>
</html>
