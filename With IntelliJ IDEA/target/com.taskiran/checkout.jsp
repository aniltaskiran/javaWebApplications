<!DOCYTPE html>
<head>
    <title> Sending cookies </title>
    <meta charset="UTF-8">
</head>
<body>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<String> items = (ArrayList<String>) 						session.getAttribute("items");
    for(String str: items){
%>
<p> <%= str %> </p>
<%
    }
//    session.invalidate();
%>
</body>
</html>
