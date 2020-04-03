
import java.awt.*;
import javax.swing.*;

public class Dd extends JFrame {
	JButton b, d, c, f, a;
	
	public Dd() {
		 b = new JButton("a");
		 d = new JButton("b");
		 c = new JButton("c");
		 f = new JButton("d");
		 a = new JButton("f");
		
	}
	
	void display() {
		setLayout(new GridLayout(3,2));
		add(b);
		add(d);
		add(c);
		add(f);
		add(a);
				
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
	     Dd t  = new Dd();
	     t.display();
	}
}


	