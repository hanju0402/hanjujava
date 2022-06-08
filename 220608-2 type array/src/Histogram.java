import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		String a = "1 - 10: ";
		String b = "11 - 20: ";
		String c = "21 - 30: ";
		String d = "31 - 40: ";
		String e = "41 - 50: ";
		String f = "51 - 60: ";
		String g = "61 - 70: ";
		String h = "71 - 80: ";
		String j = "81 - 90: ";
		String k = "91 - 100: ";
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("정수를 입력하세요: ");
			int input = scan.nextInt();
			num[i] = input;
			if (num[i] >= 1 && num[i] <= 10) {
				a += "*";
			} else if (num[i] >= 11 && num[i] <= 20) {
				b += "*";
			} else if (num[i] >= 21 && num[i] <= 30) {
				c += "*";
			} else if (num[i] >= 31 && num[i] <= 40) {
				d += "*";
			} else if (num[i] >= 41 && num[i] <= 50) {
				e += "*";
			} else if (num[i] >= 51 && num[i] <= 60) {
				f += "*";
			} else if (num[i] >= 61 && num[i] <= 70) {
				g += "*";
			} else if (num[i] >= 71 && num[i] <= 80) {
				h += "*";
			} else if (num[i] >= 81 && num[i] <= 90) {
				j += "*";
			} else if (num[i] >= 91 && num[i] <= 100) {
				k += "*";
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
	}

}
