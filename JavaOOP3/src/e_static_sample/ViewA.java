package e_static_sample;

public class ViewA {
	DBConnet db; // null 값이 자동으로 들어간다 클래스명과 똑같은면

	public ViewA() {
		db = DBConnet.getIntance();
	}

	public void use() {
		System.out.println("디비 작업중");
	}
}
