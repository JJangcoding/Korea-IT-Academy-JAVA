package ex1_string;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {

		// String은 두가지 특징을 가지고 있다.
		// 1) 객체생성 방법이 두가지다.(암시적, 명시적)
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		
		// 1) 특징에 대하여....
		//         stack <= s1 vs heap <= abc
	    //         <= s2  => 똑같은abc로 향한다.
	    // 
		String s1 = "abc"; //=> 암시적 객체생성(데이터가 겹침(new 사용 X)) 
        String s2 = "abc";
		String s3 = new String("abc"); // new를 사용하면 명시적 객체생성
		String s4 = new String("abc"); // 데이터가 겹쳐도 무조건 새집을 지음!!!!!!!!!!!!!!! (다른 (새로운) abc로 향함)
		
		
		//==은 기본 자료형끼리 비교하는 경우 값을 비교
		//하지만 객체간의 ==는 주소값을 비교
		if (s1 == s3) {
			System.out.println("주소가 같다.");
		}else {
			System.out.println("주소가 다릅니다.");			
			
		}
		//String 클래스는 객체간 주소비교보다, 값을 비교하는 경우가 훨씬 많다.
		if(s1.equals(s3)) {
						System.out.println("값이 같습니다.");
		}
		//String 비교는 .equals()를 쓰자
		
		System.out.println("------------------------------------------------------------------------------------");
//		Scanner sc = new Scanner(System.in); // 스캐너는 암시적 객체 생성만 가능 (무조건 집을 새로지음)
//	    s3= sc.next();
//	
//	    if(s1 == s3) {System.out.println("같습니다.");}// 다르다.!!! (집주소가 다르므로..)   
	                                                //=> .equals()를 써야하는 이유. 
	                                                //=> 값을 비교하는 경우가 훨씬 많으니까 앞으로 String간의 비교는 .equals()를 써라
        // 2) 특징에 대하여........	
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
		
		// greet => stack vs 안녕 => heap
	    //            =>  vs 안녕하세요 (새로운 집을 지음.) => heap  
	    // garbage collector 는 자동으로 메모리 관리를 해준다!!!!
	
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc"; // 기존 bbb의 집은 유지한채 ccc라는 새로운 집을 짓는다. => 불변성 => 한번 메모리에 생성된 값은 변하지 않는다.!!!!!!!!!!!!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
