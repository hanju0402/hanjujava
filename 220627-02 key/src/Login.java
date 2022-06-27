import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Login extends JFrame {
	public Login() {
		List<Member> member = new ArrayList<>(Arrays.asList());

		CardLayout cardLayout = new CardLayout();
		JPanel pnlAll = new JPanel(cardLayout);

		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(20);
		JPasswordField pf = new JPasswordField(20);
		JButton signInBtn = new JButton("로그인");
		JButton signUpBtn = new JButton("신규가입");

		JPanel pnl2 = new JPanel();
		JTextField tf2 = new JTextField(20);
		JPasswordField pf2 = new JPasswordField(20);
		JPasswordField pf3 = new JPasswordField(20);
		JButton logInScreen = new JButton("처음화면");
		JButton signUp = new JButton("가입하기");
		JButton doubleCheck = new JButton("ID중복확인");

		pnlAll.add(pnl, "A");
		pnlAll.add(pnl2, "B");

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("신규가입")) {
					cardLayout.show(pnlAll, "B");
				} else if (e.getActionCommand().equals("처음화면")) {
					cardLayout.show(pnlAll, "A");
					tf2.setText("");
					pf2.setText("");
					pf3.setText("");
				} else if (e.getActionCommand().equals("가입하기")) {
					member.add(new Member(tf2.getText(), pf2.getText()));
					JOptionPane.showMessageDialog(Login.this, "회원가입이 완료되었습니다");
					cardLayout.show(pnlAll, "A");
					tf2.setText("");
					pf2.setText("");
					pf3.setText("");

				} else if (e.getActionCommand().equals("로그인")) {
					if (member.isEmpty()) {
						JOptionPane.showMessageDialog(Login.this, "등록된 회원이 없습니다.");
					} else {
						for (int i = 0; i < member.size(); i++) {

							if (member.get(i).getID().equals(tf.getText())
									&& member.get(i).getPassWord().equals(pf.getText())) {
								JOptionPane.showMessageDialog(Login.this, "로그인 성공");
							} else {
								JOptionPane.showMessageDialog(Login.this, "회원정보가 다릅니다.");
							}
						}
					}
				} else if (e.getActionCommand().equals("ID중복확인")) {
					boolean sameId = false;
					for (int i = 0; i < member.size(); i++) {
						if (member.get(i).getID().contains(tf2.getText())) {
							sameId = true;
						}
					}
					if (sameId == true) {
						JOptionPane.showMessageDialog(Login.this, "이미 존재하는 ID 입니다.");
						
					} else {
						JOptionPane.showMessageDialog(Login.this, "사용가능한 ID 입니다.");
					}
				}
			}
		};

		signUpBtn.addActionListener(listener);
		logInScreen.addActionListener(listener);
		signUp.addActionListener(listener);
		signInBtn.addActionListener(listener);
		doubleCheck.addActionListener(listener);

		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, pf, 46, SpringLayout.SOUTH, tf);
		sl_pnl.putConstraint(SpringLayout.NORTH, signUpBtn, -1, SpringLayout.NORTH, pf);
		sl_pnl.putConstraint(SpringLayout.WEST, signUpBtn, 0, SpringLayout.WEST, signInBtn);
		sl_pnl.putConstraint(SpringLayout.NORTH, tf, 33, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, signInBtn, -1, SpringLayout.NORTH, tf);
		sl_pnl.putConstraint(SpringLayout.WEST, signInBtn, 29, SpringLayout.EAST, tf);
		sl_pnl.putConstraint(SpringLayout.WEST, tf, 0, SpringLayout.WEST, pf);
		sl_pnl.putConstraint(SpringLayout.WEST, pf, 24, SpringLayout.WEST, pnl);
		pnl.setLayout(sl_pnl);

		pnl.add(tf);
		pnl.add(pf);
		pnl.add(signInBtn);
		pnl.add(signUpBtn);
		SpringLayout sl_pnl2 = new SpringLayout();
		sl_pnl2.putConstraint(SpringLayout.NORTH, doubleCheck, -1, SpringLayout.NORTH, tf2);
		sl_pnl2.putConstraint(SpringLayout.WEST, doubleCheck, 6, SpringLayout.EAST, tf2);
		sl_pnl2.putConstraint(SpringLayout.WEST, signUp, 50, SpringLayout.EAST, logInScreen);
		sl_pnl2.putConstraint(SpringLayout.EAST, signUp, -99, SpringLayout.EAST, pnl2);
		sl_pnl2.putConstraint(SpringLayout.SOUTH, pf3, -6, SpringLayout.NORTH, logInScreen);
		sl_pnl2.putConstraint(SpringLayout.EAST, logInScreen, 88, SpringLayout.WEST, tf2);
		sl_pnl2.putConstraint(SpringLayout.WEST, pf2, 0, SpringLayout.WEST, tf2);
		sl_pnl2.putConstraint(SpringLayout.SOUTH, pf2, -16, SpringLayout.NORTH, pf3);
		sl_pnl2.putConstraint(SpringLayout.NORTH, logInScreen, 112, SpringLayout.NORTH, pnl2);
		sl_pnl2.putConstraint(SpringLayout.NORTH, signUp, 112, SpringLayout.NORTH, pnl2);
		sl_pnl2.putConstraint(SpringLayout.EAST, pf3, 0, SpringLayout.EAST, tf2);
		sl_pnl2.putConstraint(SpringLayout.WEST, logInScreen, 0, SpringLayout.WEST, tf2);
		sl_pnl2.putConstraint(SpringLayout.WEST, tf2, 59, SpringLayout.WEST, pnl2);
		sl_pnl2.putConstraint(SpringLayout.NORTH, tf2, 10, SpringLayout.NORTH, pnl2);
		pnl2.setLayout(sl_pnl2);

		pnl2.add(tf2);
		pnl2.add(pf2);
		pnl2.add(pf3);
		pnl2.add(logInScreen);
		pnl2.add(signUp);
		pnl2.add(doubleCheck);

		getContentPane().add(pnlAll);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 200);

	}

	public static void main(String[] args) {
		new Login().setVisible(true);

	}

}
