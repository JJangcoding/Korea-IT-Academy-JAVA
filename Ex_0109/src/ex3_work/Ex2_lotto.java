package ex3_work;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex2_lotto {
	public static void main(String[] args) {
		// 1~45������ �ߺ����� �ʴ� ���� 6���� ����� Lotto �迭�� ���
		// ���������� Lotto �迭�� ��� ������ ����Ͻÿ�.

		// ex) 15 2 41 17 6 9 => 2�� for���� ����?!

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int num1, num2, num3, num4, num5, num6 = 0;
		int[] lotto = new int[6];//0���� ä�����ִ� ����

		Out: for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1; // ��ġ���� Ȯ���Ϸ��� ���� 6���� �׽�Ʈ �ϸ� ���ϴ�.

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					continue Out;}// ���� ������ �ٽ� ������� ��.
				
			} // inner
			System.out.printf("%d ", lotto[i]);
			i++;// ���� �ٸ��� i�� �������Ѽ� ���� �濡 ������ �־��!
		} // out

	}// main
}
