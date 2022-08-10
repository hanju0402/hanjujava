<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="./memberList">
		&emsp;&emsp;이름<input type="text" name="name" />
		<br />
		<br />
		&emsp;&emsp;나이<input type="number" name="age" />
		<br />
		<br />
		전화번호<input type="number" name="tell" maxlength="11"/>
		<br />
		<br /> 
		&emsp;&emsp;&emsp;&emsp;&emsp;<input type="submit" value="완료" />
	</form>
	
	

</body>
</html>