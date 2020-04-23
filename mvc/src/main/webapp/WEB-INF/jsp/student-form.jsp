<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
Student registration form
</head>
<body>

<form:form action="/student/processForm" modelAttribute="student">

First name: <form:input path="name" />
<br><br>
Surname: <form:input path="surname" />
<br><br>
Country:
<form:select path="country">
<form:options items="${countryOptions}"/>
</form:select>
<br><br>
<input type="submit" value="Submit" />

</form:form>
</body>
</html>