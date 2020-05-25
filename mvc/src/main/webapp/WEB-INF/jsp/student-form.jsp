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
Favourite language:
<br>
C++ <form:radiobutton path="programingLanguage" value="C++" />
<br>
Java <form:radiobutton path="programingLanguage" value="Java" />
<br>
C# <form:radiobutton path="programingLanguage" value="C#" />
<br>
<br>
I have experience with:
<br>
Linux<form:checkbox path="operatingSystems" value="Linux"/>
Windows<form:checkbox path="operatingSystems" value="Linux"/>
MacOS<form:checkbox path="operatingSystems" value="Linux"/>


<br><br>
<input type="submit" value="Submit" />

</form:form>
</body>
</html>