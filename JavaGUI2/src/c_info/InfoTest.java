package c_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;//레이아웃때문에 사용
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoTest extends JFrame {

	// 1. 맴버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;

	public InfoTest() {
		// 2. 객체생성

		ta = new JTextArea(300, 200);

		bAdd = new JButton("Add", new ImageIcon("src/png/window.png")); // 버튼에 이미지넣기
		bAdd.setVerticalTextPosition(JButton.BOTTOM); // 수직정렬
		bAdd.setHorizontalTextPosition(JButton.CENTER); // 수평정렬
		bAdd.setPressedIcon(new ImageIcon("src/png/trash-2.png")); // 눌렸을 때 바뀌는 아이콘
		bAdd.setRolloverIcon(new ImageIcon("src/png/tablet-3.png")); // 갖다 됬을때 바뀌는 아이콘
		bAdd.setToolTipText("사용자 정보를 입력합니다");
		bAdd.setMnemonic('i'); // alt + i

		bShow = new JButton("Show", new ImageIcon("src/png/monitor.png"));
		bSearch = new JButton("Seach", new ImageIcon("src/png/tablet-3.png"));
		bDelete = new JButton("Delete", new ImageIcon("src/png/tablet-4.png"));
		bCancel = new JButton("Cancel", new ImageIcon("src/png/transform.png"));
		bExit = new JButton("Exit", new ImageIcon("src/c_info/trash-1.png"));

		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);

	}

	void display() {
		// 3. 화면 구성 및 출력
		JLabel l = new JLabel("Name", new ImageIcon("src/png/window.png"), 10);
		JLabel l2 = new JLabel("ID", 10);
		JLabel l3 = new JLabel("Tel", 10);
		JLabel l4 = new JLabel("Sex", 10);
		JLabel l5 = new JLabel("Age", 10);
		JLabel l6 = new JLabel("Home", 10);
		// border Jpane grid1,6 Jpane2 soth west c
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 6));
		p.add(bAdd);
		p.add(bShow);
		p.add(bSearch);
		p.add(bDelete);
		p.add(bCancel);
		p.add(bExit);
		add(p, BorderLayout.SOUTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(6, 2));
		p2.add(new JLabel("Name"));
		p2.add(tfName);
		p2.add(new JLabel("ID"));
		p2.add(tfId);
		p2.add(new JLabel("Tel"));
		p2.add(tfTel);
		p2.add(new JLabel("Sex"));
		p2.add(tfSex);
		p2.add(new JLabel("Age"));
		p2.add(tfAge);
		p2.add(new JLabel("Home"));
		p2.add(tfHome);
		add(p2, BorderLayout.WEST);
		add(ta, BorderLayout.CENTER);

		setLocation(200, 200);
		setSize(700, 560);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public void PerformProc() {
		MyEvent s = new MyEvent();

		bAdd.addActionListener(s);
		bShow.addActionListener(s);
		bSearch.addActionListener(s);
		bDelete.addActionListener(s);
		bCancel.addActionListener(s);
		bExit.addActionListener(s);

		// 아이디 텍스트필드에서 엔터쳤을 때 이벤트 처리
		tfName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = tfName.getText();
				JOptionPane.showMessageDialog(null, msg + "너의이름이야");
			}
		});
		tfId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String id = tfId.getText();
				//주민버호에서 성별을 구하는 코딩
				tfSex.setText(id);
				char sex = id.charAt(6);
				boolean reult = true;
				
				while (reult) {
					if (sex == '1' || sex == '3' || sex == '9') {
						tfSex.setText("남자");
						reult = false;
					} else if (sex == '2' || sex == '4' || sex == '0') {
						tfSex.setText("여자");
						reult = false;
					} else {
						tfSex.setText("다시 입력해주세요"); 
						reult = false;
					}
				}
				// (2)주민번호에서 출신지를 구해서 출신지 텍스트필드에 출력
				char hom = id.charAt(7);
				String home = "";
				switch(hom) {
				case '0' : home = "서울"; break;
				case '1' : home = "경기도"; break;
				case '2' : home = "강원도"; break;
				case '3' : home = "전라도"; break;
				case '4' : home = "경상도"; break;
				default : home = "제주도"; break;
				}
				tfHome.setText(home);
				
				//(3) 주민번호에서 나이를 구해서 나이 텍스트필드에 출력
				String nai = id.substring(0,2);
				int nai2 = Integer.parseInt(nai);
				Calendar c = Calendar.getInstance();
				int year = c.get(Calendar.YEAR);
				int age = 0;
				if (sex == '1' || sex == '2') {
					age = year - (1900 + nai2)+1;
				}
				else if(sex == '3' || sex == '4') {
					age = year - (2000 + nai2)+1;
				}
				else if(sex == '0' || sex == '9') {
					age = year - (1800 + nai2)+1;
				}
				tfAge.setText(String.valueOf(age));
			}
		});
		tfTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = tfTel.getText();
				JOptionPane.showMessageDialog(null, msg + "연락처");
			}
		});
		tfSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = tfSex.getText();
				JOptionPane.showMessageDialog(null, msg + "성별");
			}
		});
		tfAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = tfAge.getText();
				JOptionPane.showMessageDialog(null, msg + "나이");
			}
		});
		tfHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = tfHome.getText();
				JOptionPane.showMessageDialog(null, msg + "집");
			
				
			}
		});
		// 윈도우에 x 버튼 눌렷을 때의 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "너 나가냐?");
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}

		});

	}

	class MyEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton evt = (JButton) e.getSource();
			if (evt == bAdd) {
				String msg = bAdd.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bShow) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bSearch) {
				String msg = bSearch.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bDelete) {
				String msg = bDelete.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bCancel) {
				String msg = bCancel.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bExit) {
				String msg = bExit.getText();
				JOptionPane.showMessageDialog(null, msg + "합니다");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {

		InfoTest t = new InfoTest();
		t.display();
		t.PerformProc();
	}

}
