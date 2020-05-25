<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<body>

The student is confirmed:
<br><br>
name: ${student.name}
<br><br>
surname: ${student.surname}
<br><br>
country: ${student.country}
<br><br>
programingLanguage: ${student.programingLanguage}
<br><br>
operatingSystem:
<ul>
<c:forEach var="system" items="${student.operatingSystems}">
<li>${system}</li>
</ul>
</c:forEach>
</body>

</html>