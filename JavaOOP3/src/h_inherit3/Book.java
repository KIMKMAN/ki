package h_inherit3;

public class Book extends Item  {
			
	public String autor, pulisher;
		
		Book(){
			System.out.println("Book 기본생성자");
		}
		
		public Book(String num, String title, String autor, String pulisher){
//			super.num = num;
//			super.title = title;
			super(num,title); // 부모 함수 생성자를 직접 갖다쓴다
			this.autor = autor; // 북에있는 생성자를 호출
			this.pulisher = pulisher;
			System.out.println("Book 인자생성자");
		}
		
		public void output() {
			System.out.println(num);
			System.out.println(title);
			System.out.println(autor);
			System.out.println(pulisher);
	}
}
