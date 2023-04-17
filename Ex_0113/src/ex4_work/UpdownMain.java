package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {

		// 1~50사이의 난수를 발생!
		// 메인클래스에서 정수값을 입력받는다
		// 입력받은 값이 up, down 정답인지를 판단!
		// 정답일 경우 main클래스의 while문을 빠져나가도록 처리

		// 숫자 : 30
		// Down
		// 숫자 : 15
		// up
		// 숫자 : 25
		// 3회만에 정답!!!!

		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		
		while (true) {
			
			System.out.print("숫자 : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);
			
			if(res) {//res == true} 
			
			 break;//정답을 맞힌 경우 while문을 빠져나간다.
			}
			
			
			
			
			
			
			
		}

	} // main
}
