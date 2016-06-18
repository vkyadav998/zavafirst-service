package pojo;

import java.util.List;

public class Student{
	private String name;
	private String roll;
	private String std;
	private String batch;
	private List<String> subject;
	private Marks mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Marks getMark() {
		return mark;
	}
	public void setMark(Marks mark) {
		this.mark = mark;
	}
}
