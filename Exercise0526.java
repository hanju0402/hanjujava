import java.util.*;

public class Exercise0526 {

   public static double circleArea(double r) {
      double a = r * r * 3.14;

      return a;

   }

   public static void hi(int c) {
      for (int i = 1; i <= c; i++) {
         System.out.println("안녕");
      }
   }

   public static int text(String first, String second) {
      int a = first.length();

      int b = second.length();

      int c = a + b;

      return c;
   }
   
   public static double bmi(double h, double w) {
      double a = w / (h * h);
            
      double c = Math.floor(a*100) / 100.0;
      
      if (c >= 25.0) {
         System.out.println("비만 입니다.");
      } else if (c >= 23.0) {
         System.out.println("과체중 입니다.");
      } else if (c >= 18.5) {
         System.out.println("정상 입니다.");
      } else {
         System.out.println("저체중 입니다.");
      }
      
      return c;
               
   }
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean o = true;

      while (o) {
         System.out.print("1. 원의 넓이구하기  2. 안녕 적기  3. 문자열 길이  4. BMI계산  5. 종료 \n 번호를 입력하세요: ");
         String input = scan.next();

         if (input.equals("1")) {
            System.out.print("반지름을 입력하세요: ");
            double r = scan.nextDouble();
            System.out.println("원의 넓이: " + circleArea(r));
         } else if (input.equals("2")) {
            System.out.print("안녕 개수를 입력하세요: ");
            int c = scan.nextInt();
            hi(c);
         } else if (input.equals("3")) {
            System.out.print("첫번째 문자를 입력하세요: ");
            String first = scan.next();
            System.out.print("두번째 문자를 입력하세요: ");
            String second = scan.next();

            System.out.println(text(first, second));
         } else if (input.equals("4")) {
            System.out.print("키를 입력하세요(m단위): ");
            double height = scan.nextDouble();
            System.out.print("몸무게를 입력하세요(kg단위): ");
            double weight = scan.nextDouble();
            
            System.out.println("BMI는: " + bmi(height, weight));
            
         } else if (input.equals("5")) {
            System.out.println("프로그램을 종료합니다.");
            o = false;
         } else {
            System.out.println("잘못된 선택입니다.");
         }

      }

   }

}