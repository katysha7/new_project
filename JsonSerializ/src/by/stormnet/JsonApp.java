package by.stormnet;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JsonApp {

	public static void main(String[] args) {
		JsonApp theApp = new JsonApp();
		theApp.runTheApp();
	}

	private void runTheApp() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Петя", "Кукушкин", 3, 20));
		students.add(new Student("Кира", "Лялина", 1, 18));
		students.add(new Student("Женя", "Светлаков", 4, 23));
		students.add(new Student("Вера", "Житнева", 2, 20));
		students.add(new Student("Коля", "Веселовский", 1, 19));
		for (Student st : students) {
			System.out.println(st.getFirstName() + " " + st.getLastName() + " ");
		}

		Gson gs = new Gson();
		String jsonString = gs.toJson(students);
		System.out.println("json " + jsonString);
	}

}
