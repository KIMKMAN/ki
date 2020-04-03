package z_smple;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
/*
 * 
 * 
 */
public class Login extends JFrame {
	JTextField txt, tet; // 위에공간 작성?
	JButton b;
	
	public Login() {
	txt = new JTextField();
	tet = new JTextField();
	b = new JButton("로그인");
		
		
	}
	
	public void display() {
		setLayout(new BorderLayout());
		JLabel l = new JLabel("아이디");
		JLabel l2 = new JLabel("비밀번호");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2));
		p.add(l);
		p.add(txt);
		p.add(l2);
		p.add(tet);
		
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.EAST);
		
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	}

	public static void main(String[] args) {
		Login log = new Login();
		log.display();
	}

}
