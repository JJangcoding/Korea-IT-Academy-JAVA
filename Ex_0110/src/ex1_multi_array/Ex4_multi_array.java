package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		// 2���� �迭 arr�� ��� ��� ���� �հ� ����� ���.

		int[][] arr = { { 2, 4, 11, 28 }, { 5, 7, 10 }, { 12, 17, 3, 6 }, { 3, 2 } };

		int sum = 0;
		float avg = 0;
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				k++;
				sum += arr[i][j];
			}//inner
		}//outer
		System.out.println("���� : " + sum);

		avg = (float) sum / k;

		System.out.printf("��� : %.1f ", avg);

	}// main

}
