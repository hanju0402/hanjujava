import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SellerSignUp extends JDialog{
	private JTextField textField;
	private JTextField SignUpNameTxt;
	private JTextField SignUpTelTxt;
	private JTextField SignUpIDTxt;
	private JTextField SignUpPWTxt;
	private JTextField SignUpPW2Txt;
	private JTextField SignUpTelTxt2;
	private JTextField SignUpTelTxt3;
	private JLabel PwCheck;
	private JButton SignUpComplete;
	private JButton SignUpBackWard;
	private JPasswordField passwordField;
	private JPanel pnl;

	
	public SellerSignUp() {
		ShowView();
		Listener();
	}
	
	private void ShowView() {
		pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		JLabel SellerSignUp = new JLabel("SellerSignUp");
		SellerSignUp.setFont(new Font("휴먼모음T", Font.BOLD, 45));
		SellerSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		SellerSignUp.setBounds(12, 10, 320, 65);
		pnl.add(SellerSignUp);
		
		JLabel SignUpName = new JLabel("SignUpName");
		SignUpName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpName.setBounds(12, 110, 97, 40);
		pnl.add(SignUpName);
		
		JLabel SignUpTel = new JLabel("SignUpTel");
		SignUpTel.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpTel.setBounds(12, 160, 97, 40);
		pnl.add(SignUpTel);
		
		JLabel SignUpID = new JLabel("SignUpID");
		SignUpID.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpID.setBounds(12, 210, 97, 40);
		pnl.add(SignUpID);
		
		JLabel SignUpPW = new JLabel("SignUpPW");
		SignUpPW.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpPW.setBounds(12, 260, 97, 40);
		pnl.add(SignUpPW);
		
		JLabel SignUpPW2 = new JLabel("SignUpPW2");
		SignUpPW2.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpPW2.setBounds(12, 310, 97, 40);
		pnl.add(SignUpPW2);
		
		SignUpNameTxt = new JTextField();
		SignUpNameTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpNameTxt.setBounds(110, 110, 180, 40);
		pnl.add(SignUpNameTxt);
		SignUpNameTxt.setColumns(10);
		
		SignUpTelTxt = new JTextField();
		SignUpTelTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt.setColumns(10);
		SignUpTelTxt.setBounds(110, 160, 50, 40);
		pnl.add(SignUpTelTxt);
		
		SignUpIDTxt = new JTextField();
		SignUpIDTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpIDTxt.setColumns(10);
		SignUpIDTxt.setBounds(110, 210, 180, 40);
		pnl.add(SignUpIDTxt);
		
		SignUpTelTxt2 = new JTextField();
		SignUpTelTxt2.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt2.setColumns(10);
		SignUpTelTxt2.setBounds(178, 160, 50, 40);
		pnl.add(SignUpTelTxt2);
		
		SignUpTelTxt3 = new JTextField();
		SignUpTelTxt3.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpTelTxt3.setColumns(10);
		SignUpTelTxt3.setBounds(240, 160, 50, 40);
		pnl.add(SignUpTelTxt3);
		
		SignUpPWTxt = new JPasswordField();
		SignUpPWTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpPWTxt.setColumns(10);
		SignUpPWTxt.setBounds(110, 260, 180, 40);
		pnl.add(SignUpPWTxt);
		
		SignUpPW2Txt = new JPasswordField();
		SignUpPW2Txt.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		SignUpPW2Txt.setColumns(10);
		SignUpPW2Txt.setBounds(110, 310, 180, 40);
		pnl.add(SignUpPW2Txt);
		
		PwCheck = new JLabel("");
		PwCheck.setBounds(294, 320, 50, 30);
		pnl.add(PwCheck);
		
		SignUpComplete = new JButton("가입완료");
		SignUpComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpComplete.setBounds(40, 520, 97, 40);
		pnl.add(SignUpComplete);
		
		SignUpBackWard = new JButton("뒤로가기");
		SignUpBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		SignUpBackWard.setBounds(205, 520, 97, 40);
		pnl.add(SignUpBackWard);
		
		
		JLabel hyphen = new JLabel("-");
		hyphen.setBounds(163, 160, 19, 40);
		pnl.add(hyphen);
		
		JLabel hyphen_1 = new JLabel("-");
		hyphen_1.setBounds(231, 160, 19, 40);
		pnl.add(hyphen_1);
		
		setSize(360, 640);
		
	}
	
	private void Listener() {
		
		SignUpNameTxt.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				SignUpNameTxt.setText(CheckMethod.nameCheck(SignUpNameTxt.getText(), pnl));
			}
		});
		
		// 아이디 체크
		SignUpIDTxt.addKeyListener(new KeyAdapter() {
			@Override // 
			public void keyReleased(KeyEvent e) {
				SignUpIDTxt.setText(CheckMethod.IdCheck(SignUpIDTxt.getText(), pnl));

			}
		});

		// 비밀번호 체크
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				CheckMethod.PwCheck(SignUpPWTxt.getText(), SignUpPW2Txt.getText(), PwCheck);

			}
		};
		SignUpPWTxt.addKeyListener(adapter);
		SignUpPW2Txt.addKeyListener(adapter);

		// 전화번호1 체크
		SignUpTelTxt.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck1(SignUpTelTxt.getText(), SignUpTelTxt, e, pnl);
			}
		});

		// 전화번호2 체크
		SignUpTelTxt2.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck2(SignUpTelTxt2.getText(), SignUpTelTxt2, e, pnl);
			}
		});

		// 전화번호3 체크
		SignUpTelTxt3.addKeyListener(new KeyAdapter() {

			@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
			public void keyReleased(KeyEvent e) {
				CheckMethod.PhoneCheck3(SignUpTelTxt3.getText(), SignUpTelTxt3, e, pnl);
			}
		});
		
	}

	public static void main(String[] args) {
		new SellerSignUp().setVisible(true);
	}
}