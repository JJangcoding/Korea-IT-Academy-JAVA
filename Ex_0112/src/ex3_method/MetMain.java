package ex3_method;

public class MetMain {
public static void main(String[] args) {
	
        Method1 m1 = new Method1();
        m1.test1();
       
        int su = 100;
        m1.test2(su); //su:100�� test2 �� ���� => 101�� ��� ��.
        
        System.out.println("su : " + su); //=> ��� 100��.(�������� ���� ��ȭ�� ����!!!!!)



//���� ���� parameter �� �־�� �ϰ� �ٽ� �������� return�� �־�� �ȴ�.
//but void�� � Ÿ�����ε� ���� ���� �� ����. 
//2�� �ѱ�°� �Ұ���. ������ ���� �Ѱ� + �ϳ��� ���ڸ� ����.
//���� ���� ���� �ڵ� ������ �ȵ�. ������ ���� �˸��� ����.




  String res = m1.test3("ȫ�浿", 20); //���� ����.(1�� �̻� �����ϴ�.!!!!) // return str �̹Ƿ� String ����������.
  System.out.println(res);

  res =m1.test3("kim",22);
  System.out.println(res);




























}//main
	
}
