package ex3_work;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex2_lotto {
	public static void main(String[] args) {
		// 1~45사이의 중복되지 않는 난수 6개를 만들어 Lotto 배열에 담고
		// 최종적으로 Lotto 배열에 담긴 값들을 출력하시오.

		// ex) 15 2 41 17 6 9 => 2중 for문을 쓰자?!

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int num1, num2, num3, num4, num5, num6 = 0;
		int[] lotto = new int[6];//0으로 채워져있는 상태

		Out: for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1; // 겹치는지 확인하려면 난수 6으로 테스트 하면 편하다.

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					continue Out;}// 값이 같으면 다시 넣으라는 뜻.
				
			} // inner
			System.out.printf("%d ", lotto[i]);
			i++;// 값이 다르면 i를 증가시켜서 다음 방에 난수를 넣어라!
		} // out

	}// main
}
