package Joo;

import java.awt.EventQueue; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class Main extends JFrame {
   
   public Main() {
	   setVisible(true);
          ArrayList<Member> memberList = DataCenter.getInstance().getMemberList();
       
         getContentPane().setBackground(Color.WHITE);
         setBounds(100, 100, 451, 610);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         getContentPane().setLayout(null);
         
         JPanel panel = new JPanel();
         panel.setBackground(Color.WHITE);
         panel.setBounds(12, 10, 411, 133);
         getContentPane().add(panel);
         panel.setLayout(null);
         
         JLabel lblNewLabel = new JLabel("New label");
         lblNewLabel.setBounds(34, 0, 349, 132);
         lblNewLabel.setIcon(new ImageIcon("D:\\GLotto\\GLotto\\Image\\초기화면 이미지.jpg"));
         panel.add(lblNewLabel);
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(Color.WHITE);
         panel_1.setBounds(44, 153, 351, 418);
         getContentPane().add(panel_1);
         panel_1.setLayout(null);
         
         JButton btnNewButton = new JButton("구매");
         btnNewButton.setBackground(Color.WHITE);
         btnNewButton.setBounds(94, 10, 168, 57);
         panel_1.add(btnNewButton);
         
         JButton btnMypage = new JButton("MyPage");
         btnMypage.setBackground(Color.WHITE);
         btnMypage.setBounds(94, 109, 168, 57);
         panel_1.add(btnMypage);
         

         //Mypage 버튼 이벤트(Mypage 창이동)
         ActionListener mypageEvent = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new MyPage().getFrame().setVisible(true);
              dispose();
            }
         };
         
         //Logout 버튼 이벤트(Login 창이동)
         JButton btnLogout = new JButton("Logout");
         btnLogout.setBackground(Color.WHITE);
         btnLogout.setBounds(94, 211, 168, 57);
         panel_1.add(btnLogout);
         
         ActionListener logoutEvent = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 
                DataCenter.getInstance().setMyInfo(null);
                new Login().setVisible(true);
                dispose();
             }
         };
         
         JButton Exitbtn = new JButton("종료");
         Exitbtn.setBackground(Color.WHITE);
         Exitbtn.setBounds(94, 315, 168, 57);
         panel_1.add(Exitbtn);
         
         JLabel qqq = new JLabel("로그인한 회원 이름");
         qqq.setBounds(12, 49, 57, 15);   
         qqq.setText(DataCenter.getInstance().getMyInfo().getName());
         panel_1.add(qqq);
         
         btnMypage.addActionListener(mypageEvent);
         btnLogout.addActionListener(logoutEvent);
         Exitbtn.addActionListener(logoutEvent);
         
         
         
         dispose();
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main window = new Main();
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */

}