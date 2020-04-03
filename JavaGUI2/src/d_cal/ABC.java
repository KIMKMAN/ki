package d_cal;

import java.awt.*;
import javax.swing.*;

public class ABC extends JFrame {
	// 멤버변수선언

	JButton[] b = new JButton[26];
	
	public ABC() {
		// 객체생성
		int j = 0;
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			b[j] = new JButton(String.valueOf(ch));
			j++;
		}

	}

	public void display() {
		// 출력
		setLayout(new GridLayout(2, 13));
		for (int i = 0; i < b.length; i++) {
			add(b[i]);
				
		}
		
		setSize(700, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ABC apl = new ABC();

		apl.display();
	}

}
