package ex1_operator;

public class Ex3_Operator {
public static void main(String[] args) {
	
	//증감연산자
	//1씩 증가시키거나 1씩 감소시키는 연산자
	//선행증감과 후행증감의 차이점만 확실히 구별하자!
	int a = 10;
	System.out.println("a : " + ++a);  // 선행 증감 (우선순위가 매우 빠름. 출력되기전에 더함)
	
	int b = 10;
	System.out.println("b : " + b++);  // 후행 증감 (우선순위가 가장 느림. 출력되고 나서 더함)
	System.out.println(b);
	
	b++ ;
	--b ;
	--b ;
	++b ;
	b-- ;
	b-- ;
	b++ ;
	++b ; 
	System.out.println(b--);
	
    //증감 연산자는 1씩 밖에 증감 못한다. 2이상의 증감을 하려면 대입 연산자를 사용하는 것이 좋다.
	b += 2; 

	//삼항(조건) 연산자
	//조건을 두고, 그 조건에 대한 결과가 참일 때와 거짓일때에 따라 
	//다른 대답을 돌려주는 연산자
	int aa = 10;
	int bb = 15;
	boolean res= ++aa >= b ? true: false; // 물음표(?)와 세미콜론(;)이 하나의 셋트. 참이면 앞의 것. 거짓이면 뒤의 것
	System.out.println(res);
	
	char res2 = ++aa < bb ? 'y' : 'n';
    System.out.println(res2);
	
	
	
	
} //main
}//class end
