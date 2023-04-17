package ex3_casting;

public class Ex1_promotion {

	
	public static void main(String[] args) {
	//캐스팅(형변환)
    //서로 다른 자료형 간에 값을 주고받기 위한 문법(개념)
    
    //1.프로모션
    // - 큰 자료형에 작은 자료형을 대입하는 것
		double d =100.5; //8byte
		int n = 200; // 4byte
		d = n; // 오른쪽 값을 왼쪽에 넣는다. (대입)  = > 200.0이 나온다. (자동변환)
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n1 = 100; //4byte
		n1 = c; // 큰 그릇에 작은 그릇을 넣으면?? OK but 작은 그릇에 큰 그릇은 못 넣는다.  = > A를 아스키 코드에 맞춰서 숫자로 넣어줌
        System.out.println(n1);
	
        
    
	}
}
 