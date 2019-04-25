<%@ page import="com.java.service.AdminService" %>
<%@ page import="com.java.ServiceImpl.AdminServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.text {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<form action="Myadmin" method="post">
Enter QuestionId<input type="text"class="text" name="Question_id"><br>
Enter QuestionCreator<input type="text" class="text" name="Question_creator"><br>
Enter the Question
<textarea rows="3" cols="20" class="text" name="Question"></textarea><br>
Enter choice 1<input type="text"class="text" name="Choice1"><br>
Enter choice 2<input type="text"class="text" name="Choice2"><br>
Enter choice 3<input type="text"class="text" name="Choice3"><br>
Enter choice 4<input type="text"class="text" name="Choice4"><br>
Enter Option type<select name="Selection" class="text">
  <option value="R">R</option>
  <option value="C">C</option>
  </select><br>
 Enter skill<select name="SkillSet" class="text">
  <option value="java">java</option>
  <option value="python">python</option>
</select><br>
Enter competency level<select name="CompetencyLevel" class="text">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  </select><br>
Enter Marks<input type="text"class="text" name="Mark"><br>  
Enter Answer<input type="text"class="text" name="Answer"><br>
<input type="submit" value="submit" class="text">

</form>


</body>
</html>