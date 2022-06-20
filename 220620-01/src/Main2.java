import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// 어레이리스트에 담길 형을 지정할수있음 <>
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.get(0));
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);

	}

}
