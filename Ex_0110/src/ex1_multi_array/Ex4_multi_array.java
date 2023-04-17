package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		// 2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력.

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
		System.out.println("총합 : " + sum);

		avg = (float) sum / k;

		System.out.printf("평균 : %.1f ", avg);

	}// main

}
