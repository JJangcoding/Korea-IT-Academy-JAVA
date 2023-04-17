package ex8_work;

public class Count {

	public void getCount(int... n) {             // int[] arr
		for (int i = 0; i < 10; i++) {
			int count = 0;
			System.out.print(i + "의 갯수: ");
			
			for (int j = 0; j < n.length; j++) {//j < arr[i] => 0번방의 갯수만큼. 1번방의 갯수만큼.... 돌려라
				if (n[j] == i) {                //arr[j]
					System.out.print("#");
					count++;
				}//if
			}//inner
			System.out.println(" " + count);

		}//out

	}

}
