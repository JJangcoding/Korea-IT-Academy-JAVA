package ex3_casting;

public class Ex2_demotion {
public static void main(String[] args) {
	
	//2.디모션
	// -작은 자료형에 큰 자료형이 대입되는 것 (자동X)
	char c = 'c'; //2byte
	int n = c+1 ; //4byte 아스키 코드표상 c는 67. 따라서 68을 넣는 것.
	// c=n 은 불가능
    c = (char)n; //작은 자료형에 큰 자료형을 넣을때 형변환을 시켜주기. => c = 68에 해당하는 아스키코드 출력 (D)
    System.out.println(c);
    
    float ff = 5.5f; // 4.XX byte
    n = 0; //4byte
    n= (int)ff; // 소수점을 버리고 담아야 한다.(정수형으로 변환) => 데이터가 상실됨.
    System.out.println(n);
    
    
	
	
	
	
}
}
