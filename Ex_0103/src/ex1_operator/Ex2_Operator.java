package ex1_operator;

public class Ex2_Operator {
	
	public static void main(String[] args) {
		
		//비교 연산자
		//값을 비교해서 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2;
		System.out.println("n1 < n2 : " + res);
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res );
		
		res = n1 == n2; // 같다는 연산자 
		System.out.println("n1 == n2 : " + res);
        
		res = n1 != n2; // 같지 않다는 연산자
        System.out.println("n1 != n2 : " + res);	
        
        
        //논리 연산자
        //비교 연산자를 통한 연산이 두 개 이상 필요할 때 사용
        int age = 30; 
        int limit = 35;
		// t && t = t
        // t && f = f
        // f && t = f
        // f && f = f
        // && 연산자는 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
        
        res = (limit - age) >= 5   &&     age > 30;
        System.out.println("&& : " + res);
     
        int i1 = 10;
        int i2 = 20;
        // t || t = t
        // t || f = t
        // f || t = t
        // f || f = f
        // || 연산자는 앞의 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
        res = (i1 += 10) > 20 || i2 - 10 == 11;
        System.out.println("||연산: " + res); 
        
        //not 연산자: 참을 거짓으로 거짓을 참으로 바꿔주는 연산자 (영구적이지 않음. 사용된 시점에만 적용 된다.)
        System.out.println("!연산자 :" + !res );
        	
	}

}
