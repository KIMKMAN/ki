package h_inherit4;

public class Cd extends Item{
	String singer;

	public Cd() {
		System.out.println("Cd 기본생성자");
	}

	public Cd(String num, String title, String singer) {
		this.num = num;
		this.title = title;
		this.singer = singer;
		System.out.println("Cd 인자생성자");
	}

	public void output() { // 추상을 쓰는이유는 강제로 오버라이딩을 하기위해 추상을 선언
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
		

	}
}
