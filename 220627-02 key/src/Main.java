import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;
	
	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		
		lbl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if (code == KeyEvent)
			}
		});
		pnl.add(lbl);
		
		add(pnl);
		
		pnl.setFocusable(true); // 키입력도 상호소통할수있게
		// 어댑터: 리스너하면 모든 오버라이드를 설정해야하지만 
		// 어댑터를 활용하면 원하는 오버라이드만 선택적 설정 가능
		pnl.addKeyListener(new KeyAdapter() {
//			@Override// 하나의 클릭처럼 키가 온전하게 입력이되면 발생
//			public void keyTyped(KeyEvent e) {	
//			}
//			
//			@Override// 버튼떗을떄
//			public void keyReleased(KeyEvent e) {
//			}
			
			@Override// 버튼 눌렀을때
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if (code == KeyEvent.VK_LEFT) {
					System.out.println("왼쪽 화살표 누름");
					lbl.setLocation(lbl.getX()-1, lbl.getY());
				}
				else if (code == KeyEvent.VK_UP) {
					System.out.println("위쪽 화살표 누름");
					lbl.setLocation(lbl.getX(), lbl.getY()-1);
				}
				else if (code == KeyEvent.VK_RIGHT) {
					System.out.println("오른쪽 화살표 누름");
					lbl.setLocation(lbl.getX()+1, lbl.getY());
				}
				else if (code == KeyEvent.VK_DOWN) {
					System.out.println("아래쪽 화살표 누름");
					lbl.setLocation(lbl.getX(), lbl.getY()+1);
				}
//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
