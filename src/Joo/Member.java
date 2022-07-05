package Joo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Member {
   private static Member member;
   private String Name;
   private String ID;
   private String Pw;
   private String Fnum; // 주민 앞자리
   private String Bnum; // 주민 뒷자리
   private String FPhone;
   private String MPhone; // 중간 전화번호
   private String LPhone; // 뒷 전화번호

   private ArrayList<Integer> MyNumlist = new ArrayList<>();    //나의 로또 번호 (총5개)


   public Member() {
      
   }
   public Member(String name, String iD, String pw, String fnum, String bnum, String fPhone, String mPhone, String lPhone) {
   super();
   Name = name;
   ID = iD;
   Pw = pw;
   Fnum = fnum;
   Bnum = bnum;
   FPhone = fPhone;
   MPhone = mPhone;
   LPhone = lPhone;
}

   public static Member getInstance() {
      if(member ==null) {
         member = new Member();
      }
      return member;
   }

   /**S
    * @return the myNumlist
    */
   public ArrayList<Integer> getMyNumlist() {
      return MyNumlist;
   }

   /**
    * @param myNumlist the myNumlist to set
    */
   public void setMyNumlist(ArrayList<Integer> myNumlist) {
      MyNumlist = myNumlist;
   }

   public void setMyNumlist1(ArrayList<Integer> myNumlist) {
      MyNumlist = myNumlist;
   }


   public void addMyLottoNum(Integer a) {
      this.MyNumlist.add(a);
   }
   
   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public String getID() {
      return ID;
   }

   public void setID(String iD) {
      ID = iD;
   }

   public String getPw() {
      return Pw;
   }

   public void setPw(String pw) {
      Pw = pw;
   }

   public String getFnum() {
      return Fnum;
   }

   public void setFnum(String fnum) {
      Fnum = fnum;
   }

   public String getBnum() {
      return Bnum;
   }

   public void setBnum(String bnum) {
      Bnum = bnum;
   }

   public String getFPhone() {
      return FPhone;
   }

   public void setFPhone(String fPhone) {
      FPhone = fPhone;
   }

   public String getMPhone() {
      return MPhone;
   }

   public void setMPhone(String mPhone) {
      MPhone = mPhone;
   }

   public String getLPhone() {
      return LPhone;
   }

   public void setLPhone(String lPhone) {
      LPhone = lPhone;
   }
}