package ex1_operator;

public class Ex1_Operator {
public static void main(String[] args) {
	/* 
	연산자(Operator)
	1.최고연산자 : . ()
	!2.증감연산자: ++ --
	3.산술연산자: + _ * ? %
	4.시프트연산자: >> <<
	5.비교연산자: > < >= <= == !=
	6.비트연산자: &  | (시프트 원표시) ^
	!7.논리연산자: && || !
	8.삼항(조건)연산자:? :
	!9.대입연산자:  = *= /= %= += -=
	*/
	
	
     // 산술연산자
	 // 사칙연산과 나머지 연산자를 가지고 있다.
	 int n1 = 20; // 정수변수를 만들때는 0으로 초기화 해놓자!
	 int n2 = 7;
	 int n3 = n1 + n2;
	 System.out.println("n3 : " + n3);
	 
	 n3 = n1/n2; // 몫
	 System.out.println(" / : " + n3);
	 
	 n3 = n1 % n2; // 나머지 연산자 
	 System.out.println(" % : " + n3);
	 
	 System.out.println("------------------------------");
	 
	 
	 //대입 연산자
	 //특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
     int i1 = 10;
     int i2 = 3;
     i1 += i2; // i1= i1 + i2
     System.out.println("+= : " + i1);
	 
     i1 -= 1 ; // i1 = i1 - 1;
     System.out.println("-= : " + i1);
     
     i1 %= 5; //i1 = i1 % 5;
     System.out.println("%= : " + i1);
     
     i1 *= 6; //i1 = i1 * 6;
     System.out.println("*= : " + i1);
     
     
	
}
	
	
	
}
