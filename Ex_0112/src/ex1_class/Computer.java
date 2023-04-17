package ex1_class;

public class Computer {
 
	
	//클래스의 구성요소
	//1) 변수, 속성, 멤버....
	//2) 메서드, 함수, 기능
	
	//컴퓨터를 만들기 위한 설계작업,,  =>메인메서드 X
	private String brand= "apple";// 컴퓨터 메인 클래스에서 수정이 불가능해진다!!!!!!! (바뀌면 안되는 값에 대한 보안성을 높이기 위한 접근 제한자임.)
	int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	//컴퓨터의 성능을 확인하기 위한 메서드(기능)
	//메서드: 반복적으로 사용되는 코드를 줄이기 위해서 만드는 영역, 소문자로 시작.
	public void getInfo() {
		System.out.println("제조사 : " + brand);
		System.out.println("용량 : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("색상 : " + color);
		System.out.println("--------------------------------------------------");
	}
	//메서드의 구성
	//접근제한자   반환형     메서드명(내마음 대로 지정가능)  괄호: 파라미터, 인자, 매개변수.....   중괄호: 메서드 호출시 실행영역.
    //public void getInfo() {}
	
	//접근제한자: 
	//1)public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	//2)private : 현재 클래스에서만 사용을 허가
	//3)protected : 상속관계의 객체들에게만 사용을 허가
	//4)default : 현재 패키지 내의 객체들에게 사용을 허가 (아무것도 안넣었을 때 디폴트값임.)
	
	
}
