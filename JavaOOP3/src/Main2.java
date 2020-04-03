
public class Main2 { //영역안에 클래스만들 수있다

	public static void main(String[] args) {
		
		
		Person p = method();
		//출력
		System.out.println("나의 소개"+p.getName());
		
	}

	static Person method() {
		String name =  "홍길자";
		int age = 24;
	double height = 190.99;
	
	Person p = new Person();
	p.setName(name);// p.setName("홍길자");
	p.setAge(age);
	p.setHeigt(height);
	
	return p;
	}
}

class Person{ // 권장하지않음 찾기 매우 힘듬 자바 파일은 하나이지만 클래스가 2개
				// 임시적 설계도
	private String name;
	private int age;
	private double heigt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeigt() {
		return heigt;
	}
	public void setHeigt(double heigt) {
		this.heigt = heigt;
	}
	
	
}
