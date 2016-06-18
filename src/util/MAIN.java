package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pojo.Auth;
import pojo.Marks;
import pojo.Student;

public class MAIN{

	public static void main(String[] args) {
		//=========================================================================
		    String json1 = "{\"user\":\"abcdef\",\"pass\":\"12345\"}";
			
			Auth auth = (Auth)JsonUtil.jsonToObject(json1, Auth.class);
			
			System.out.println(auth);
		//===============================================================================	   
			/* Object to Json
			 * 
			 * 
			 * Auth auth = new Auth();
			
			 auth.setUser("vipin");
			 auth.setPass("12345");
			 
			String userone = JsonUtil.objectToJson(auth);
			
			System.out.println(userone);*/
	 //==============================================================================
		/*Json to Object with array into Object
		 * 
		 * 
		 * String json = "{\"name\":\"vipin\",\"roll\":\"12\",\"std\":\"10th\",\"batch\":\"B\",\"subject\":[\"Hindi\",\"Marathi\",\"English\"]}";
				
			Student student = (Student)JsonUtil.jsonToObject(json, Student.class);
			
			System.out.println(student);*/
	//=================================================================================	
		/*Object to Json with array into Object
		 * 
		 * 
		 * Student stud = new Student();
		
		stud.setName("vipin");
		stud.setRoll("12");
		stud.setStd("10th");
		
		List<String> subjects=new ArrayList<String>();
		subjects.add("hindi");
		subjects.add("English");
		subjects.add("marathi");
		
		stud.setSubject(subjects);
		stud.setBatch("B");
		
		String allStudent = JsonUtil.objectToJson(stud);
		System.out.println(allStudent);*/
	//================================================================================
		//Json to Object with array and Object into Object
		 
		 String json = "{\"name\":\"vipin\",\"roll\":\"12\",\"std\":\"10th\",\"batch\":\"B\",\"subject\":[\"Hindi\",\"Marathi\",\"English\"],\"mark\":{\"hindi\":\"50%\",\"marathi\":60,\"english\":70}}";
		
		Student student = (Student)JsonUtil.jsonToObject(json, Student.class);
		
		
	String nam=	student.getName();
		
	 Marks marksss = student.getMark();
	 
	 int i=	marksss.getEnglish();
	 marksss.setEnglish(i+10);
	   
	 int j= marksss.getMarathi();
	 marksss.setMarathi(j-10);
		
	 student.setMark(marksss);
	 
	 String studentJson = JsonUtil.objectToJson(student);
	 System.out.println(json);
	 
		System.out.println(studentJson);
	//================================================================================
        /*Object to json with array and Object into Object
         * 
         * 
         * Student stud = new Student();
		
		stud.setName("vipin");
		stud.setRoll("12");
		stud.setStd("10th");
		
		List<String> subjects=new ArrayList<String>();
		subjects.add("hindi");
		subjects.add("English");
		subjects.add("marathi");
		
		Marks markss= new Marks();
		markss.setHindi("40%");
		markss.setEnglish(50);
		markss.setMarathi(80);
		
		stud.setMark(markss);
		stud.setSubject(subjects);
		stud.setBatch("B");
		
		String allStudent = JsonUtil.objectToJson(stud);
		System.out.println(allStudent);*/
		
		
		
}}
