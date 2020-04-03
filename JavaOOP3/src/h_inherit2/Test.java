package h_inherit2;

import java.awt.*;

/* is-a : MyFrame2 is a Frame */
class Frame1 {
	Frame f;

	MyFrame1(){
			f = new frame();
			f.setSize(500, 300);
			f.setVisible(true);
	}

}

public class Test {
	public static void main(String[] args) {
		new MyFrame2();

	}
}