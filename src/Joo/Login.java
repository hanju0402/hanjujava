package Joo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JTextField IDtext;
	private JPasswordField PWtext;
	private ArrayList<Member> memberList;
	
	/**
	 * Launch the application.
	 */

	public Login() {
		memberList= DataCenter.getInstance().getMemberList();
		
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println("Member List ======== >"+memberList.get(i).getID());
		}

		getContentPane().setBackground(Color.CYAN);
		setBounds(100, 100, 452, 531);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 436, 40);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Green Lotto");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 50, 414, 243);
		getContentPane().add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\uB85C\uB610\uC774\uBBF8\uC9C0.png"));
		panel_1.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(10, 325, 414, 63);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(58, 8, 28, 18);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		panel_2.add(lblNewLabel_2);

		IDtext = new JTextField();
		IDtext.setBounds(98, 5, 226, 21);
		panel_2.add(IDtext);
		IDtext.setColumns(20);

		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(12, 37, 76, 18);
		panel_2.add(lblNewLabel_2_1);

		PWtext = new JPasswordField();
		PWtext.setBounds(98, 36, 226, 21);
		panel_2.add(PWtext);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(10, 431, 414, 40);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JButton LoginBtn = new JButton("로그인");
		LoginBtn.setBackground(Color.WHITE);
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LoginBtn.setBounds(87, 5, 81, 23);
		panel_3.add(LoginBtn);

		JButton SUBtn = new JButton("회원가입");
		SUBtn.setBackground(Color.WHITE);
		SUBtn.setBounds(252, 5, 92, 23);
		panel_3.add(SUBtn);

		SUBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				new SignUp().setVisible(true);
			}
		});


		LoginBtn.addActionListener(new ActionListener() {
			boolean logCheck;

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < memberList.size(); i++) {
					if (memberList.get(i).getID().equals(IDtext.getText())
							&& memberList.get(i).getPw().equals(PWtext.getText())) {
						logCheck = true;
						
						// 아이디와 비밀번호가 동일하기 때문에, DataCenter에 본인 정보 등록
						DataCenter.getInstance().setMyInfo(memberList.get(i));
					}

				}

				if (logCheck == true) {
					System.out.println("로그인성공");
					//new Main();
					new Main().setVisible(true);
					
					dispose();

				} else {
					System.out.println("로그인실패");
				}

			}

		});

		System.out.println(IDtext.getText());
		dispose();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login().setVisible(true);
		
		
	}

}