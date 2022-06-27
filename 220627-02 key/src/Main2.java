import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10); // 패스워드 필드
		
		JTextArea ta = new JTextArea(20, 20);
		JScrollPane scrl = new JScrollPane(ta);//어디에 스크롤바를 설정할지()안에 적어줌
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					
					//ta.setText() 새로운 텍스트값으로 변경
					//ta.append()기존에있는 문자열에 덛붙여주는 
					ta.append(String.valueOf(ch) + "\n");
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
