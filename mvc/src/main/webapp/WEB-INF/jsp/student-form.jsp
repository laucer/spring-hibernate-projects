<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>


<head>
<style>
    .error{color:red}
</style>
</head>


Student registration form
</head>
<body>

<form:form action="/student/processForm" modelAttribute="student">

First name: <form:input path="name" />
<form:errors path="name" cssClass="error" />
<form:errors path="name" cssClass="error"/>
<br><br>
Surname: <form:input path="surname" />
<form:errors path="surname" cssClass="error"/>
<br><br>
Course code: <form:input path="courseCode" />
<form:errors path="courseCode" cssClass="error"/>
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
Windows<form:checkbox path="operatingSystems" value="Windows"/>
MacOS<form:checkbox path="operatingSystems" value="MacOS"/>


<br><br>
<input type="submit" value="Submit" />

</form:form>
</body>
</html>