package Joo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class infoChange extends JDialog {
	
	private JTextField nameText;
	private JTextField idText;
	private JPasswordField pwText1;
	private JPasswordField pwText2;
	private JTextField phoneNum1;
	private JTextField phoneNum2;
	private JTextField phoneNum3;
	private JButton	nameChange;
	private JButton idChange;
	private JButton pwChange;
	private JButton phoneNumChange;
	private JButton doubleCheck;
	private JButton changeCheck;
	private JButton reset;
	private JLabel pwValidation;
	private ArrayList<Member> memberList;
	private Member user;
	
	public infoChange() {
		memberList = DataCenter.getInstance().getMemberList();
		user = DataCenter.getInstance().getMyInfo();
		showView();
		addListener();
		setVisible(true);
		
	}
	
	private void showView() {
		
		
		
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(0, 0, 0));
		
		JPanel titleBar = new JPanel();
		
		
		
		JLabel title = new JLabel("개인정보 수정");
		title.setFont(new Font("휴먼모음T", Font.BOLD, 30));
		title.setBounds(100, 10, 191, 50);
		
		titleBar.setBackground(new Color(255, 255, 0));
		titleBar.setBounds(12, 10, 360, 50);
		titleBar.add(title);
		pnl.add(titleBar);
		
		
		setSize(400, 400);
		pnl.setLayout(null);
		
		
		getContentPane().add(pnl);
		
		JPanel nameBar = new JPanel();
		nameBar.setBackground(new Color(255, 255, 0));
		nameBar.setBounds(12, 80, 360, 30);
		pnl.add(nameBar);
		nameBar.setLayout(null);
		
		JLabel name = new JLabel("이름");
		name.setBounds(35, 8, 40, 15);
		nameBar.add(name);
		
		nameText = new JTextField(user.getName());
		nameText.setBounds(100, 5, 80, 20);
		nameText.setEnabled(false);
		nameBar.add(nameText);
		

		JPanel phoneNumBar = new JPanel();
		phoneNumBar.setBackground(new Color(255, 255, 0));
		phoneNumBar.setBounds(12, 240, 360, 30);
		pnl.add(phoneNumBar);
		phoneNumBar.setLayout(null);
		
		JLabel phoneNum = new JLabel("전화번호");
		phoneNum.setBounds(35, 8, 55, 15);
		phoneNumBar.add(phoneNum);

		JLabel hypen = new JLabel("-");
		hypen.setBounds(152, 5, 7, 15);
		phoneNumBar.add(hypen);
		
		JLabel hypen2 = new JLabel("-");
		hypen2.setBounds(215, 5, 7, 15);
		phoneNumBar.add(hypen2);
		
		
		phoneNum1 = new JTextField(user.getFPhone());
		phoneNum1.setBounds(100, 5, 45, 20);
		phoneNum1.setEnabled(false);
		phoneNumBar.add(phoneNum1);
		
		phoneNum2 = new JTextField(user.getMPhone());
		phoneNum2.setBounds(165, 5, 45, 20);
		phoneNum2.setEnabled(false);
		phoneNumBar.add(phoneNum2);
		
		phoneNum3 = new JTextField(user.getLPhone());
		phoneNum3.setBounds(227, 5, 45, 20);
		phoneNum3.setEnabled(false);
		phoneNumBar.add(phoneNum3);
		
		JPanel idBar = new JPanel();
		idBar.setBackground(new Color(255, 255, 0));
		idBar.setBounds(12, 120, 360, 30);
		pnl.add(idBar);
		idBar.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setBounds(35, 8, 40, 15);
		idBar.add(id);
		
		idText = new JTextField(user.getID());
		idText.setBounds(100, 5, 80, 20);
		idText.setEnabled(false);
		idBar.add(idText);
		
		doubleCheck = new JButton("중복확인");
		doubleCheck.setFont(new Font("굴림", Font.PLAIN, 11));
		doubleCheck.setBounds(258, 5, 80, 20);
		idBar.add(doubleCheck);
		
		
		JPanel pwBar1 = new JPanel();
		pwBar1.setBackground(new Color(255, 255, 0));
		pwBar1.setBounds(12, 160, 360, 30);
		pnl.add(pwBar1);
		pwBar1.setLayout(null);
		
		JLabel pw = new JLabel("PW");
		pw.setBounds(35, 8, 40, 15);
		pwBar1.add(pw);
		
		pwText1 = new JPasswordField(user.getPw());
		pwText1.setBounds(100, 5, 80, 20);
		pwText1.setEnabled(false);
		pwBar1.add(pwText1);
		
		JPanel changeCheckBar = new JPanel();
		changeCheckBar.setBackground(new Color(0, 0, 0));
		changeCheckBar.setBounds(12, 301, 360, 50);
		pnl.add(changeCheckBar);
		changeCheckBar.setLayout(null);
		
		changeCheck = new JButton("수정완료");
		changeCheck.setBounds(131, 10, 89, 23);
		changeCheck.setForeground(new Color(0, 0, 0));
		changeCheck.setToolTipText("");
		changeCheck.setBackground(new Color(255, 255, 0));
		changeCheckBar.add(changeCheck);
		
		reset = new JButton("reset");
		reset.setBackground(new Color(255, 215, 0));
		reset.setBounds(278, 10, 70, 23);
		changeCheckBar.add(reset);
		
		JPanel pwBar2 = new JPanel();
		pwBar2.setBounds(12, 200, 360, 30);
		pnl.add(pwBar2);
		pwBar2.setBackground(new Color(255, 255, 0));
		pwBar2.setLayout(null);
		
		JLabel pw2 = new JLabel("PW2");
		pw2.setBounds(35, 8, 40, 15);
		pwBar2.add(pw2);
		
		pwText2 = new JPasswordField(user.getPw());
		pwText2.setBounds(100, 5, 80, 20);
		pwText2.setEnabled(false);
		pwBar2.add(pwText2);
		
		nameChange = new JButton("수정");
		nameChange.setFont(new Font("굴림", Font.PLAIN, 11));
		nameChange.setBounds(190, 5, 56, 20);
		nameBar.add(nameChange);
		
		idChange = new JButton("수정");
		idChange.setFont(new Font("굴림", Font.PLAIN, 11));
		idChange.setBounds(190, 5, 56, 20);
		idBar.add(idChange);
		
		pwChange = new JButton("수정");
		pwChange.setFont(new Font("굴림", Font.PLAIN, 11));
		pwChange.setBounds(190, 5, 56, 20);
		pwBar1.add(pwChange);
		
		phoneNumChange = new JButton("수정");
		phoneNumChange.setFont(new Font("굴림", Font.PLAIN, 11));
		phoneNumChange.setBounds(281, 5, 56, 20);
		phoneNumBar.add(phoneNumChange);
		
		pwValidation = new JLabel("");
		pwValidation.setFont(new Font("굴림", Font.PLAIN, 11));
		pwValidation.setBounds(190, 5, 113, 20);
		pwBar2.add(pwValidation);
		
		
		
	}
	
	private void addListener() {
		
	      nameText.addKeyListener(new KeyAdapter() {

	          @Override //네임텍스트에 키를누르고 땟을때 이벤트 발생
	          public void keyReleased(KeyEvent e) {
	             for (int i = 0; i < nameText.getText().length(); i++) { 
	                if (!(Character.isAlphabetic(nameText.getText().charAt(i)))) { // 텍스트 하나하나를 분석해서 문자가아닐때 
	                   
	                      JOptionPane.showMessageDialog(infoChange.this, "문자만 입력 가능");
	                      
	                      String a;
	                      a = nameText.getText();
	                      nameText.setText(a.replaceAll("[^a-zA-Zㄱ-ㅎ가-힣]", "")); // 네임텍스트에 영어나 한글빼고는 전부 삭제

	                   }
	             }
	          }
	       });
	      
	       idText.addKeyListener(new KeyAdapter() {
	    	   
	           @Override
	           public void keyReleased(KeyEvent e) {

	              for (int i = 0; i < idText.getText().length(); i++) {
	                 String a;
	                 a = idText.getText();
	                 String b = String.valueOf(a.charAt(i)); // 아이디 텍스트를 한글자씩 쪼개서 비교

	                 if (b.matches("^[a-zA-Z0-9]")) { 

	                 } else {
	                    JOptionPane.showMessageDialog(infoChange.this, "영어, 숫자만 입력가능");
	                    idText.setText(a.replaceAll("[^a-zA-Z0-9]", ""));  // 비교해서 영어와 숫자뺴고는 다 지운다
	                 }
	              }

	           }
	        });
	       
	       phoneNum2.addKeyListener(new KeyAdapter() {

				@Override// 전화번호 앞번호 텍스트 주민번호랑 같은 원리
				public void keyReleased(KeyEvent e) {

					for (int i = 0; i < phoneNum2.getText().length(); i++) {
						
						if (!(Character.isDigit(phoneNum2.getText().charAt(i)))) {
							JOptionPane.showMessageDialog(infoChange.this, "숫자만 입력해주세요.");
							String a;
							a = phoneNum2.getText();
							phoneNum2.setText(a.replaceAll("[^0-9]", ""));
						}

						else if (phoneNum2.getText().length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
			                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
							phoneNum2.setText(phoneNum2.getText().substring(0, 4));
							phoneNum2.transferFocus();
						}
					}
				}

			});

			phoneNum3.addKeyListener(new KeyAdapter() {

				@Override // 전화번호 뒷번호 텍스트
				public void keyReleased(KeyEvent e) {

					for (int i = 0; i < phoneNum3.getText().length(); i++) {
						if (!(Character.isDigit(phoneNum3.getText().charAt(i)))) {
							JOptionPane.showMessageDialog(infoChange.this, "숫자만 입력해주세요.");
							String a;
							a = phoneNum3.getText();
							phoneNum3.setText(a.replaceAll("[^0-9]", ""));
						}

						else if (phoneNum3.getText().length() >= 4 ) {
							phoneNum3.setText(phoneNum3.getText().substring(0, 4));
						}
					}
				}
			});
	       
	       
		
			ActionListener listener = new ActionListener() {

				int userIndex = memberList.indexOf(user);
				boolean doubleCheckOk;
				String idCheck;
				

				@Override
				public void actionPerformed(ActionEvent e) {
					// nameChange 버튼을 눌렀을때 발생하게하는 메소드
						if (nameChange.equals(e.getSource())) {
							if (nameChange.getText().equals("수정")) {
								nameText.setEnabled(true);
								nameChange.setText("완료");
							} else if (nameChange.getText().equals("완료")) {
								nameText.setEnabled(false);
								nameChange.setText("수정");
							}
						}
						
						else if (doubleCheck.equals(e.getSource())) {
							
							
							if (idText.getText().length() >= 7) {
								
							
								boolean sameId = false;
								
								for(int i = 0; i < memberList.size(); i++) {
									
									if (memberList.get(i).getID().equals(idText.getText()) && !(user.getID().equals(idText.getText()))) {
										sameId = true;
										
									}
								}
								
								if (sameId == true) {
									JOptionPane.showMessageDialog(infoChange.this, "이미 존재하는 ID입니다.");
								}
								else {
									JOptionPane.showMessageDialog(infoChange.this, "사용가능한 ID입니다.");
									idCheck = idText.getText();
									doubleCheckOk = true;
								}
						}
						
						else {
							JOptionPane.showMessageDialog(infoChange.this, "ID를 7문자 이상 작성해 주세요.");
							}

					}
					
					else if(idChange.equals(e.getSource())) {
						
						if (idChange.getText().equals("수정")) {
							idText.setEnabled(true);
							idChange.setText("완료");
						} 
						
						else if (idChange.getText().equals("완료")) {
							
							if (doubleCheckOk == true && idCheck.equals(idText.getText())) {
								
								idText.setEnabled(false);
								idChange.setText("수정");
							}
							else {
								JOptionPane.showMessageDialog(infoChange.this, "중복확인을 해주세요.");
							}
						}
					} 
					
					else if (pwChange.equals(e.getSource())) {
						
						if (pwChange.getText().equals("수정")) {
							pwText1.setEnabled(true);
							pwText2.setEnabled(true);
							pwChange.setText("완료");
						} 
						
						else if (pwChange.getText().equals("완료")) {
							
							if (!(pwText1.getText().length() >= 8) || !(pwText1.getText().equals(pwText2.getText()))) {
								JOptionPane.showMessageDialog(infoChange.this, "PW를 확인해주세요.");
							}
							else {
								pwText1.setEnabled(false);
								pwText2.setEnabled(false);
								pwChange.setText("수정");
							}
						}
						
					}
					
					else if (phoneNumChange.equals(e.getSource())) {
						
						if (phoneNumChange.getText().equals("수정")) {
							
							phoneNum1.setEnabled(true);
							phoneNum2.setEnabled(true);
							phoneNum3.setEnabled(true);
							
							phoneNumChange.setText("완료");
						} else if (phoneNumChange.getText().equals("완료")) {
							
							phoneNum1.setEnabled(false);
							phoneNum2.setEnabled(false);
							phoneNum3.setEnabled(false);
							phoneNumChange.setText("수정");
						}
					}
					
					else if (reset.equals(e.getSource())) {
						
						nameText.setText(user.getName());
						phoneNum1.setText(user.getFPhone());
						phoneNum2.setText(user.getMPhone());
						phoneNum3.setText(user.getLPhone());
						idText.setText(user.getID());
						pwText1.setText(user.getPw());
						pwText2.setText(user.getPw());

						nameChange.setText("수정");
						idChange.setText("수정");
						pwChange.setText("수정");
						phoneNumChange.setText("수정");
						pwValidation.setText("");
						
						nameText.setEnabled(false);
						phoneNum1.setEnabled(false);
						phoneNum2.setEnabled(false);
						phoneNum3.setEnabled(false);
						idText.setEnabled(false);
						pwText1.setEnabled(false);
						pwText2.setEnabled(false);
						
						doubleCheckOk = false;

					}
						
					else if (changeCheck.equals(e.getSource())) {
						
						if (nameChange.getText().equals("수정") &&
								idChange.getText().equals("수정") &&
								pwChange.getText().equals("수정") &&
								phoneNumChange.getText().equals("수정")) {
							
							memberList.get(userIndex).setName(nameText.getText());
							memberList.get(userIndex).setID(idText.getText());
							memberList.get(userIndex).setPw(pwText1.getText());
							memberList.get(userIndex).setFPhone(phoneNum1.getText());
							memberList.get(userIndex).setMPhone(phoneNum2.getText());
							memberList.get(userIndex).setLPhone(phoneNum3.getText());
							
							JOptionPane.showMessageDialog(infoChange.this, "수정이 완료되었습니다.");
							
							System.out.println(memberList.get(5).getName());
							new MyPage().getFrame().setVisible(true);
							dispose();
							
						} 
						else {
							JOptionPane.showMessageDialog(infoChange.this, "수정 완료버튼을 눌러주세요.");
							System.out.println(memberList.get(5).getName());
						}
						
						
						
					}
				}
			};
			
			changeCheck.addActionListener(listener);
			reset.addActionListener(listener);
			phoneNumChange.addActionListener(listener);
			pwChange.addActionListener(listener);
			idChange.addActionListener(listener);
			doubleCheck.addActionListener(listener);
			nameChange.addActionListener(listener);
		
		
		
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pwValidation.show(false); // 키를입력할때마다 false 를 반환후 조건에 부합하면 true로 만들어준다
				String valiTxt = ""; // 일치 불일치 텍스트 초기값(공백) 초기화
				if (pwText1.getText().length() < 8 && pwText1.getText().length() > 0) {
					valiTxt = "PW는 8문자 이상"; // pwText1 8문자 미만일때
					pwValidation.setForeground(Color.RED);
				} else if (pwText1.getText().length() <= 0) {
					valiTxt = ""; // pwText 값 길이가 0일때 (칸이 비어있을때)
				} else if (!pwText1.getText().equals(pwText2.getText())) {
					valiTxt = "불일치"; // pwTex값이 8문자 이상이지만 pwText1, pwText2 값이 다를때
					pwValidation.setForeground(Color.RED);
				} else if (pwText1.getText().equals(pwText2.getText())) {
					valiTxt = "일치"; // pwText 값이 8문자 이상이고 pwText1, pwText2 값이 같을때 (일치할때)
					pwValidation.setForeground(Color.GREEN);
				}
				pwValidation.setText(valiTxt); // 앞의 조건을 설정하고 맞는조건의 valiTxt를 pwValidation 에 설정한후
				pwValidation.show(true); // 보이게한다. 
			}
		};

		pwText1.addKeyListener(adapter);
		pwText2.addKeyListener(adapter);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				new Main().setVisible(true);
			}
			
		});
		
	}
	
	

	public static void main(String[] args) {
		new infoChange().setVisible(true);
		
	}

}
