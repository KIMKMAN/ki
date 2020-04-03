package c_info;

import javax.swing.*;
import java.awt.*;//레이아웃때문에 사용

public class InfoTest3 extends JFrame {

	// 1. 맴버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bSeach, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	
		
	public InfoTest3() {
		// 2. 객체생성
		JLabel l  = new JLabel("Name"); // 라벨 같은경우 반드시 멤버변수 작성
		JLabel l2 = new JLabel("ID");
		JLabel l3 = new JLabel("Tel");
		JLabel l4 = new JLabel("Sex");
		JLabel l5 = new JLabel("Age");
		JLabel l6 = new JLabel("Home");
		
		ta = new JTextArea(300,200);

		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSeach = new JButton("Seach");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");

		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		
		
		
		
		
	}

	void display() {
		// 3. 화면 구성 및 출력
		// border Jpane grid1,6 Jpane2 soth west c
		ta.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 6));
		p.add(bAdd);
		p.add(bShow);
		p.add(bSeach);
		p.add(bDelete);
		p.add(bCancel);
		p.add(bExit);
		add(p, BorderLayout.SOUTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(6, 2));
		p2.add(new JLabel("Name", new ImageIcon("src/c_info/png/keyboard"), JLabel.CENTER));
		p2.add(tfName);
		p2.add(new JLabel("ID", new ImageIcon("src/c_info/png/monitor"),JLabel.CENTER));
		p2.add(tfId);
		p2.add(new JLabel("Tel", new ImageIcon("src/c_info/png/tablet-3"),JLabel.CENTER));
		p2.add(tfTel);
		p2.add(new JLabel("Sex", new ImageIcon("src/c_info/png/tablet-4"),JLabel.CENTER));
		p2.add(tfSex);
		p2.add(new JLabel("Age", new ImageIcon("src/c_info/png/transform"),JLabel.CENTER));
		p2.add(tfAge);
		p2.add(new JLabel("Home", new ImageIcon("src/c_info/png/trash-1"),JLabel.CENTER));
		p2.add(tfHome);
		add(p2, BorderLayout.WEST);
		add(ta, BorderLayout.CENTER);
		
		setLocation(200, 200);
		setSize(700, 560);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		InfoTest3 t = new InfoTest3();
		t.display();
	}

}
