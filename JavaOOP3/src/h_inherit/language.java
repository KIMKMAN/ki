package h_inherit;

public class language {
	protected String greeting, introduce, mention;
		
		public language(){}
		public language(String greeting, String introduce, String mention){
			this.greeting = greeting;
			this.introduce  = introduce;
			this.mention = mention;}
		

		
		public void greeting() {
			System.out.println(greeting);
			}
		public void introduce() {
			System.out.println(introduce); //객체변수
		}
		public void mention() {
			System.out.println(mention);
		}
	}

