package ex1_class;

import java.util.Scanner;

public class comMain {
public static void main(String[] args) {
	
	//Scanner sc = new Scanner (System.in);
	Computer c1 = new Computer();// 명시적으로 생성 => 주소가 다름. 새롭게 생성하는것임.
	                             //.내부접근
	
	c1.getInfo();//코드절약 가능.
//	System.out.println("ssd : "+ c1.ssd);
//	System.out.println("ram : "+ c1.ram);
//	System.out.println("cpu : "+ c1.cpu);
//	
//	System.out.println("----------------------------------------");
	
	Computer c2 = new Computer(); //시리얼 넘버를 다르게 설정하여 동일한 성능의 컴퓨터를 만듦.
	c2.getInfo();	
	
//	System.out.println("ssd : "+ c2.ssd);
//	System.out.println("ram : "+ c2.ram);
//	System.out.println("cpu : "+ c2.cpu);
//	
//	System.out.println("----------------------------------------");
	
	Computer c3 = new Computer ();
	c3.ssd = 512;//c3 안으로가서 ssd 용량을 변경가능. // 시리얼 넘버의 컴퓨터들은 변화 X
   // c3.brand = "samsung"; => 변경불가능. private 접근 제한자를 썼기 때문에.
	c3.getInfo();
		
//	System.out.println("ssd : "+ c3.ssd);
//	System.out.println("ram : "+ c3.ram);
//	System.out.println("cpu : "+ c3.cpu);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
	
	
	
}
