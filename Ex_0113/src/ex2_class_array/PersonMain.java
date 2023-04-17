package ex2_class_array;

public class PersonMain {
public static void main(String[] args) {
	

String[]sArr = new String[3];
sArr[0] = "aaa";
sArr[1] = "bbb";
sArr[2] = "ccc";
//String 클래스를 제외한 모든 클래스는 
//배열화 처리되었을 때 각 인덱스마다 메모리 할당을 해줘야 한다.

Person[] person = new Person[3];//공간만 할당된 상태(배열화) => type에 구애없이 다 저장 할 수 있다.!!!!!!! => 편리함.
//person[0]= new Person();  name 과 memory 변수 할당을 꼭해줘야 한다.(명시적 객체생성) =>for문으로 쓰자!!!!!!!!!
for (int i = 0; i < person.length; i++) {
	person[i] = new Person();// 객체화 시켜줘야한다!!!!!
}

person[0].setName("김말똥");
person[0].setAge(20);

person[1].setName("박소똥");
person[1].setAge(30);

person[2].setName("김쥐똥");
person[2].setAge(40);

for (int i = 0; i < person.length; i++) {
	System.out.print(person[i].getName() + "/" + person[i].getAge());}












































}//main
		
}
