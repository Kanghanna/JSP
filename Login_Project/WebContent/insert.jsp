<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<b>회원 가입</b>
<form action = "insertProc.jsp" method = "post">
이름 : <input type ="text" name = "name"><br>
비밀번호 : <input type ="password" name = "pw"><br>
비밀번호 확인 : <input type ="password" name = "pw2"><br>
주소 : <input type ="password" name = "address" size = "30"><br>
<input type ="submit" value ="회원가입"><br>
</form>