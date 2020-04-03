package h_inherit3;

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

	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
		

	}
}
