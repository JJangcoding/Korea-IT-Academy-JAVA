package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
	
		//String클래스의 메서드(기능)들
		//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합. 
		//반드시 소괄호를 가지고 있다.
		//반복적으로 사용되는 코드를 줄이기 위해 많이 사용.		
		// https://docs.oracle.com/javase/8/docs/api/overview-summary.html => 메서드 설명서
		
		
		String name= "Hong Gil Dong";
		int len = name.length(); // ()안에 커서를 옮긴뒤 컨트롤 스페이스바 하면 반환 값의 유형을 알려준다.!!!!
		System.out.println("문장의 길이 : " + len);// 띄어쓰기 포함 글자수 계산 => 유일하게 1부터 계산을 시작하는 메서드
		
		int index = name.indexOf('o');
		System.out.println("맨 첫번째 o의 위치: " +index);//0부터 계산 시작
		
		index = name.lastIndexOf('o');
		System.out.println("맨 뒤의 o의 위치 : " + index);
		
		char c = name.charAt(5);//() 안에 값을 넣어야 하면 괄호 안의 규칙을 지켜야 한다. vs 안넣어도 되는데 넣으면 오류가 발생한다.
		System.out.println("추출한 문자 : " + c);//인덱스에 해당하는 한글자를 꺼낸다.
		
		String s1 = name.substring(5);
		System.out.println(s1); //해당 인덱스값부터 추출 (끝값 지정가능)
		
		s1 = name.substring(5,10);
		System.out.println(s1);//끝값 -1 인덱스까지 추출!!!!!!!!!!
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.','/');// .을 /로 치환하는 메서드
		System.out.println(s1);
		s1 = name.replace("on", "ii");
		System.out.println(s1);// 문자열 교체 쌍따옴표 사용!!!! 
		                       // 일시적으로 바꿀뿐.. 영구적으로 바꾸려면 name변수로 받자!!!!!!!
		
		name = name.replaceAll("ii","on");
		System.out.println(name);
		
		name = "kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		name = name.replace('.','/');
		System.out.println(name);
		
		name2 = name2.replaceAll(".","/"); // .을 포함한 것을 한 덩어리로 여긴다 => replace가 더 낫다. 익숙해지기 전까지는
		System.out.println(name);
		
		String id = " hi hello ";// 중간 공백은 의미가 있지만 양끝 공백은 의미가 없다.
		id = id.trim();//문장 양끝의 의미없는 공백을 제거해준다.
		System.out.println(id.length());
		
		String[] id2 = id.split(" ");
		System.out.println(id2[0] + "/" + id2[1]);// 특정 문장을 기준으로 배열형태로 나눠서 저장해주는 메서드
		
		String answer = "Apple";
		
		if (answer.equals("apple")) {
			System.out.println("값이 같다");
		}    //=> 대소문자를 구분하기 때문에 다른 값으로 인식한다.  => equalsIgoreCase => 대소문자 구분을 무시하고 단어만 같다면 일치 
		
		
		//스트링 클래스의 메서드는 아니지만, 앞으로 많이 사용하게될 메서드
		//정수형태의 문자열을(String)을 연산이 가능한 실제 정수로 바꿔보자!! (기본 자료형을 포장하는 래퍼(부모)클래스가 있다.) => 클래스는 .메서드 활용이 가능하다.
		String num = "10"; 
		int a = Integer.parseInt(num); // 반드시 "정수"만 가능하다.
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
