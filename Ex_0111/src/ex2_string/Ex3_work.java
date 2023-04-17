package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 회문수 판단하기
		// 회문수란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자
		// 값: a1221a
		// a1221a (은)는 회문수입니다.
		// 값: abc
		// abc (은)는 회문수가 아닙니다. 111

		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		String input = sc.next();// 원본값
		String input2 = "";// 뒤집은 값. 빈 쌍따옴표로 초기화 해주는게 좋음.

//	int j =0;
//	
//	for (int i = 0; i < input.length()/2; i++) {
//		
//	if (input.charAt(i)!=input.charAt(input.length()-1-i)) {
//	j++;	
//	}}
//	
//	if (j>0){
//		System.out.print(input + " (은)는 회문수가 아닙니다.");
//	}
//	else System.out.print(input + " (은)는 회문수입니다.");

		for (int i = input.length()-1; i >= 0; i--) {

			input2 += input.charAt(i);
			
		} // for

		if (!input.equals(input2)) {
System.out.println("회문수가  아닙니다.");			
		}else {System.out.println("회문수 입니다.");
			
		}
		
	}// main
}
