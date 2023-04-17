package ex1_first;

public class Ex1_print {

	public static void main( String[] args) {
		//주석: 컴파일시 JVM이 인지하지 못하는 메모 용도의 텍스트 영역
		//main메서드: 컴파일시 가장 먼저 호출되는 영역
		System.out.println(100); // <-- 한줄이 끝나면 반드시 ;(세미콜론)으로 마무리하자!!
		System.out.println(200);
		
		System.out.println("안녕하세요"); // 문장을 입력하고자 할때는 쌍따옴표를 사용해야 한다.
		
		System.out.println(10+10); // 연산자 해결까지 해줌
		System.out.println(10*10);
		
		System.out.println("10*10"); // 글자로 인식됨
		System.out.println("10*10 = " + 10*10); // 더하기 기호는 문장 뒤(""쌍따옴표)에 들어갔을 때 이어 붙여준다.
		System.out.println("5 + 1 = " + 5 + 1 ); // 5+1 = 51 (문장뒤 더하기는 뒤를 전부 이어 붙이기로 처리한다.
	    System.out.println("5-1 = " + (5-1)); // 괄호 먼저 처리!!
	    System.out.println(1+1+ "1+1 = " +1 +1); //*,-는 문장과 함께 처리 XXX
		
		
	}
	
}
