package h_inherit2;

/* has-a : MyFrame2 is a Frame */
import java.awt.Frame;

class myFrame2 extends Frame{

	myFrame2(){
	//super();
	super("나의 두번째 화면");
	setSize(500,300);
	setVisible(true);
		
		
	}
}

public class Test2 {
	public static void main(String[] args) {
		new myFrame2();
	}
}
