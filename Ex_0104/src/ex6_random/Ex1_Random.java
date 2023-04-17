package ex6_random;

import java.util.Random;

public class Ex1_Random {
 public static void main(String[] args) {

	 //난수를 만들어주는 클래스 Random
	 Random rnd = new Random();                    //컨트롤 쉬프트 영문자O  => import 단축키 
	 
	 //1 ~ 3 사이의 난수
	 //rnd.nextInt(난수의 범위) + 시작수;  => 범위 = 갯수
	 //난수의 범위 계산 공식 : 끝수 - 시작수 + 1
	 int num = rnd.nextInt(3) + 1;
	 System.out.println(num);
	 
	 System.out.println("-------------------------------------------------------------");
	 
	 //문자 : 랜덤 추출
	 
	 int alphabet = rnd.nextInt('Z'-'A'+1) + 'A';
	 System.out.println((char)alphabet);
			 
	 
	 
	 
	 
	 
}//main
}
