package ex2_value_type;

public class Ex1_valueType {

 public static void main(String[] args) {
 
	 // 기본자료형(valueType)
	 /*
	   논리형: boolean - 1bit 
	   문자형: char - 2byte
	   정수형: byte - 1byte ...... -128 ~ 127 => 저장용은 아님.
	        short - 2byte..... -32768 ~ 32767 => 사이즈가 애매해서 공식적으로 사용 중지
	        int - 4byte....... -21억 ~ 21억 => 일반적인 개발에서 가장 많이 사용
	        long - 8byte...... -900경 ~ 900경 => 증권 분야에서는 숫자가 커져서 주로 사용
	   실수형: float - 4byte..... 4.XXX byte 저장
	        double - 8byte... 8.XXX byte 저장
	   */
	 //변수: 특정 값을 저장하기 위한 공간 (Like 이름표..)
	 //자료형을 구별하는 식별자
	 
	 //변수 선언 규칙!!
	 // 1)자료형 변수명; (선언)
	 // 2)변수명 = 값; (대입)
	 // 3)자료형 변수명 = 값; (초기화)
	 
	 // 변수 선언시 주의사항!
	 // 1) 변수이름 중복 XXXX
	 // 2) _를 제외하고는 특수문자를 포함하지 말것!
	 // 3) 변수명은 반드시 소문자로 시작한다!!! VS 클래스는 대문자로 시작
	 // 4) 변수명은 숫자로 시작할 수 없고 영문으로 작성할 것. (숫자 포함은 가능)
	 
	 //1) 논리형
	 //참과 거짓. 즉, true 와 false 값만을 저장하는 자료형 타입 (참,거짓)
	 boolean b;
	 b= true;
	 b= false;
	 
	 boolean b2;  // (중복되면 안된다 !!!)
	 //boolean b2 = 1 (불가능) => 자료형 타입에 맞는 값을 넣어줘야 한다.
	 System.out.println(b); // => false (위에서 아래 왼쪽에서 오른쪽으로 적용되므로..)
	 
	 //문자형
	 //홑따옴표 안에 딱 한글자만 저장 가능한 자료형
	 //위에 변수 b가 이미 있어서 사용 불가능
	 char c = 'A';
	 System.out.println("c : " + c);
	 
	 char c2 = 65 +1;
	 System.out.println("c2 : " + c2); // 아스키코드표에서 66은 B이다.
	 char c3 = 'B' +1;
	 System.out.println("c3 : " + c3);
	 
	 // 정수형
	 //byte by = 128; => 127까지 저장 가능하므로 불가능
	 int n1 = 2100000000;
	 long n2 = 2200000000L; //컴파일 하기전에 long이라고 언급 해줘야 한다!! (int범위를 벗어나는 값)
     System.out.println("long값 : " + n2);
     
     // 실수형 
     // 소수점을 가진 값들을 저장하기 위한 자료형
     float f1 = 3.14F; 
     double f2 = 3.14; //double 용량이 커서 용량낭비
     System.out.println(f1);
     System.out.println(f2);
	 
     f1 = 100;
     f2 = 100;
     System.out.println(f1); // 정수를 넣어도 .0을 넣어서 억지로 실수 타입으로 저장
     System.out.println(f2);
	 
     
     
} // main 입력후 컨트롤 스페이스바 => 메인 메서드 입력!! (메인 메서드 안에 입력해야 출력이 가능하다!!)
 
 
 	
	
}
