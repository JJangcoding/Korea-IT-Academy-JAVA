package ex1_setter_getter;

public class Person {
	//setter & getter : private으로 만들어진 속성들에 접근할 수 있도록 하기 위한 개념
	//값을 넣는용// 값을 받기용
	
	private String name;
	private String phone;
	private int age;
	//접근 제한자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} // 우클릭 + 소스 + generate getters setters => 클릭!!!!!!!!!!!!!!! 자동완성
	  // getters 만 만들면 값을 바꾸지 못하고 받기만 한다. => 보안성 up!!
	
	
	
	
	
	
	
	
	
	
	
	
//	public int getAge() {
//		return age;
//	}
//	
//	
//	public void setAge(int age) {
//		this.age =age; //this : 현재클래스 자신 (person)
//	}
//	
//	
//	
//	
//	public String getPhone() {
//		return phone;
//	}
//	
//	public void setPhone(String p) {
//		phone = p;
//	}
//	
//	
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {//set바꾸고싶은것.
//		name = name;
//		
//	}
	
//	public int getAge() { 컨트롤 + 스페이스바!!!!!
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
