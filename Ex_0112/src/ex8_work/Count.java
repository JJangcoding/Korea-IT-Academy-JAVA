package ex8_work;

public class Count {

	public void getCount(int... n) {             // int[] arr
		for (int i = 0; i < 10; i++) {
			int count = 0;
			System.out.print(i + "�� ����: ");
			
			for (int j = 0; j < n.length; j++) {//j < arr[i] => 0������ ������ŭ. 1������ ������ŭ.... ������
				if (n[j] == i) {                //arr[j]
					System.out.print("#");
					count++;
				}//if
			}//inner
			System.out.println(" " + count);

		}//out

	}

}
