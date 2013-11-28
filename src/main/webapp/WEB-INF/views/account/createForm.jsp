<!doctype html>
<html:html>
<head>
<title>User Create</title>
<meta charset="UTF-8">
</head>
<body>
    <html:form action="/account/create">
        <label for="firstName">first name</label>
        <html:text property="firstName" />
        <br>
        <label for="lastName">last name</label>
        <html:text property="lastName" />
        <br>
        <label for="email">email</label>
        <html:text property="email" />
        <br>
        <html:submit property="submit" value="create" />
    </html:form>
</body>
</html:html>