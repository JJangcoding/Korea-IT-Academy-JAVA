package ex1_class;

import java.util.Scanner;

public class comMain {
public static void main(String[] args) {
	
	//Scanner sc = new Scanner (System.in);
	Computer c1 = new Computer();// ��������� ���� => �ּҰ� �ٸ�. ���Ӱ� �����ϴ°���.
	                             //.��������
	
	c1.getInfo();//�ڵ����� ����.
//	System.out.println("ssd : "+ c1.ssd);
//	System.out.println("ram : "+ c1.ram);
//	System.out.println("cpu : "+ c1.cpu);
//	
//	System.out.println("----------------------------------------");
	
	Computer c2 = new Computer(); //�ø��� �ѹ��� �ٸ��� �����Ͽ� ������ ������ ��ǻ�͸� ����.
	c2.getInfo();	
	
//	System.out.println("ssd : "+ c2.ssd);
//	System.out.println("ram : "+ c2.ram);
//	System.out.println("cpu : "+ c2.cpu);
//	
//	System.out.println("----------------------------------------");
	
	Computer c3 = new Computer ();
	c3.ssd = 512;//c3 �����ΰ��� ssd �뷮�� ���氡��. // �ø��� �ѹ��� ��ǻ�͵��� ��ȭ X
   // c3.brand = "samsung"; => ����Ұ���. private ���� �����ڸ� ��� ������.
	c3.getInfo();
		
//	System.out.println("ssd : "+ c3.ssd);
//	System.out.println("ram : "+ c3.ram);
//	System.out.println("cpu : "+ c3.cpu);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
	
	
	
}
