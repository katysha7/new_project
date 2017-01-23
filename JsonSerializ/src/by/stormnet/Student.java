package by.stormnet;

import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private int course;
	private int age;
	private List<Student> students;

	public Student(String firstName, String lastName, int course, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
