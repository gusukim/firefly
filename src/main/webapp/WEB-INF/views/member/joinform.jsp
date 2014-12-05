<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<h1>회원 가입</h1>
	<br />

<spring:hasBindErrors name="member"/>
<form:errors path="member" />
	<form action="join.do" method="POST">
		<table class="inputtable">
			<tr>
				<td>사용자 ID</td>
				<td><input type="text" name="userid" value="${member.userid}"/>
				<form:errors path="member.userid" />
				 
				</td>
			</tr>
			<tr>   
				<td>패스워드</td>
				<td><input type="password" name="password" value="${member.password}"/>
				<form:errors path="member.password" />
				</td>
			</tr>
			<tr>
				<td>패스워드 확인</td>
				<td><input type="password" name="password2" /></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>남 <input type="radio" name="gender" value="M" checked /> 여
					<input type="radio" name="gender" value="F" />
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>핸드폰</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>집전화</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" name="zipcode" /></td>
			</tr>
			<tr>
				<td>주소1</td>
				<td><input type="text" name="address1" /></td>
			</tr>
			<tr>
				<td>주소2</td>
				<td><input type="text" name="address2" /></td>
			</tr>
		</table>
		<br /> <input type="submit" value="가입하기" /> 
				<input type="button" value="돌아가기" onclick="history.back(-1);" />

	</form>
</section>
