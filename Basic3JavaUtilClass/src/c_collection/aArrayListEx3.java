package c_collection;

import java.util.ArrayList;

public class aArrayListEx3 {

	public static void main(String[] args) {

		ArrayList<Student> list = method();
		for (Student data : list) {
			System.out.println(data);
		}
		// 여기서 출력
		for (int i = 0; i < list.size(); i++) {
			Student data = (Student) list.get(i);
			System.out.println(data);
		}
	}

	static ArrayList<Student> method() {
		// 세명의 학생 정보를 저장 : ArrayList 저장
		Student a = new Student("1번 학생", 25);
		Student b = new Student("2번 학생", 30);
		Student c = new Student("3번 학생", 40);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(a);
		list.add(b);
		list.add(c);

		return list;
	}
}

//----------------------------------------------------------
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "학생은 " + age + "세 입니다.";
	}
}
