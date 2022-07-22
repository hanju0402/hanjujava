import java.awt.Color; 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




// 검사 메소드
public class CheckMethod extends JDialog {
	// 이름 검사
	public static String nameCheck(String nameText) {
		for (int i = 0; i < nameText.length(); i++) { 
            if (!(Character.isAlphabetic(nameText.charAt(i)))) { // 텍스트 하나하나를 분석해서 문자가아닐때 
               
            	 JOptionPane.showMessageDialog(null, "문자만 입력 가능");
                  
                 
                  return nameText.replaceAll("[^a-zA-Zㄱ-ㅎ가-힣]", ""); // 네임텍스트에 영어나 한글빼고는 전부 삭제

               } 
         }
		
		return nameText;
		}
	
	// ID 검사
	public static String IdCheck(String IdText) {
		
		 for (int i = 0; i < IdText.length(); i++) {
             String a;
             a = IdText;
             String b = String.valueOf(a.charAt(i)); // 아이디 텍스트를 한글자씩 쪼개서 비교

             if (b.matches("^[a-zA-Z0-9]")) { 

             } else {
                JOptionPane.showMessageDialog(null, "영어, 숫자만 입력가능");
                return IdText.replaceAll("[^a-zA-Z0-9]", "");  // 비교해서 영어와 숫자뺴고는 다 지운다
             }
          }
		 
		 return IdText;
	}
	
	// PW 검사
	public static void PwCheck(String PwText, String PwText2, JLabel PwCheck) {
		
		PwCheck.show(false);
		String valiTxt = "";
		
		if (PwText.length() < 8 && PwText.length() > 0) {
			valiTxt = "PW는 8문자 이상"; // pwText 8문자 미만일때
			PwCheck.setForeground(Color.RED);
		} else if (PwText.length() <= 0) {
			valiTxt = ""; // pwText 값 길이가 0일때 (칸이 비어있을때)
		} else if (!(PwText).equals(PwText2)) {
			valiTxt = "불일치"; // pwTex값이 8문자 이상이지만 pwText, pwText2 값이 다를때
			PwCheck.setForeground(Color.RED);
		} else if (PwText.equals(PwText2)) {
			valiTxt = "일치"; // pwText 값이 8문자 이상이고 pwText, pwText2 값이 같을때 (일치할때)
			PwCheck.setForeground(Color.GREEN);
		}
		PwCheck.setText(valiTxt); // 앞의 조건을 설정하고 맞는조건의 valiTxt를 pwValidation 에 설정한후
		PwCheck.show(true); // 보이게한다. 
	}
	
	// 문자열이 숫자인지 boolean 메소드
	public static boolean PhoneDigitCheck(String PhoneNum) {
		
		boolean DigitCheck = true;
	
		for (int i = 0; i < PhoneNum.length(); i++) {
			
			if (!(Character.isDigit(PhoneNum.charAt(i)))) {
				DigitCheck = false;
			} 
		}	
		
		return DigitCheck;
	}
	
	
	// PhoneNum1 검사
	public static void PhoneCheck1 (String PhoneNum, JTextField PhoneText, KeyEvent e) {
		
		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
			
		} 
		else if (PhoneNum.length() >= 3 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 3));
				PhoneText.transferFocus();
		}
	}	
	
	
	
	// phoneNum2 검사
	public static void PhoneCheck2 (String PhoneNum, JTextField PhoneText, KeyEvent e) {
		
		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
			
		} 
		else if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
				PhoneText.transferFocus();
		}
	}	
	
	// phoneNum3 검사
	public static void PhoneCheck3 (String PhoneNum, JTextField PhoneText, KeyEvent e) {
		
		if (PhoneDigitCheck(PhoneNum) == false) {
			String a;
			a = PhoneNum;
			PhoneText.setText(a.replaceAll("[^0-9]", ""));
			JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
			
		} 
		else if (PhoneNum.length() >= 4 && !(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) && !(e.getKeyCode() == KeyEvent.VK_LEFT)
                      && !(e.getKeyCode() == KeyEvent.VK_RIGHT)) {
				PhoneText.setText(PhoneNum.substring(0, 4));
		}
	}	

	

	

}
