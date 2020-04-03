package h_inherit3;

public class Dvd extends Item {
	String actor, dircetor;

	Dvd() {
		System.out.println("Dvd 기본생성자");
	}

	public Dvd(String num, String title, String actor, String director) {
		this.num = num;
		this.title = title;
		this.actor = actor;
		this.dircetor = director;
		System.out.println("Dvd 인자생성자");
	}

	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(dircetor);

	}
}
