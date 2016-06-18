package com.myfirstservice.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pojo.Auth;
import pojo.Marks;
import pojo.Student;
import util.JsonUtil;

@Path("/")
public class FirstRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAuth() {
		
		Student stud = new Student();
		
		stud.setName("vipin yadav");
		stud.setRoll("55");
		stud.setStd("12th");
		
		List<String> subjects=new ArrayList<String>();
		subjects.add("computer science");
		subjects.add("data base");
		subjects.add("network management");
		
		Marks markss= new Marks();
		markss.setHindi("40");
		markss.setEnglish(50);
		markss.setMarathi(80);
		
		stud.setMark(markss);
		stud.setSubject(subjects);
		stud.setBatch("V.C.R.");
		
		String allStudent = JsonUtil.objectToJson(stud);
		System.out.println(allStudent);
		return Response.ok(allStudent).build();
	}
	
	@GET
	@Path("/get2")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAuth2() {
	
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
		return Response.ok(json,studentJson).build();
	}
		
	
}
