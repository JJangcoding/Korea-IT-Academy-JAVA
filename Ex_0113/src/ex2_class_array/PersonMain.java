package ex2_class_array;

public class PersonMain {
public static void main(String[] args) {
	

String[]sArr = new String[3];
sArr[0] = "aaa";
sArr[1] = "bbb";
sArr[2] = "ccc";
//String Ŭ������ ������ ��� Ŭ������ 
//�迭ȭ ó���Ǿ��� �� �� �ε������� �޸� �Ҵ��� ����� �Ѵ�.

Person[] person = new Person[3];//������ �Ҵ�� ����(�迭ȭ) => type�� ���־��� �� ���� �� �� �ִ�.!!!!!!! => ����.
//person[0]= new Person();  name �� memory ���� �Ҵ��� ������� �Ѵ�.(����� ��ü����) =>for������ ����!!!!!!!!!
for (int i = 0; i < person.length; i++) {
	person[i] = new Person();// ��üȭ ��������Ѵ�!!!!!
}

person[0].setName("�踻��");
person[0].setAge(20);

person[1].setName("�ڼҶ�");
person[1].setAge(30);

person[2].setName("�����");
person[2].setAge(40);

for (int i = 0; i < person.length; i++) {
	System.out.print(person[i].getName() + "/" + person[i].getAge());}












































}//main
		
}
