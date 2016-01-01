
<%--
  Created by IntelliJ IDEA.
  User: linuxsagar
--%>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Simple Chat</title>
</head>
<body>
<g:form controller="chat" action="join">
    <label for="nickname">Please enter your name</label>
    <g:textField name="nickname"/>
    <g:submitButton name="Join Chat"/>
</g:form>
</body>
</html>