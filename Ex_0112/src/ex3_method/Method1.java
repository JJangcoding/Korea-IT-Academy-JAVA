package ex3_method;

public class Method1 {
	
	//메서드의 구성 및 정의
	
	public void test1() {
		System.out.println("안녕하세요");
	}
	
	public void test2(int n) {
		//반환형이 void가 아닌 경우, 마지막에 반드시
		//return값이 포함되어 있어야한다.
		
		
		n++;
		System.out.println("n : "+ n);
	   
		
		//return값은 반드시 반환형 타입과 맞춰준다. (ex.int)
		//return 1;
	    //void와 달리 다른 반환형은 리턴값을 가지고 돌아간다.
	
	
	}
	
	public String test3(String s, int n ) {//반환형이 void가 아니므로 리턴 필수!!!!
		String str = "저는 "+ s + "이고 , " + n + "세 입니다";
	return str;
	}
	
	
	
	

}
