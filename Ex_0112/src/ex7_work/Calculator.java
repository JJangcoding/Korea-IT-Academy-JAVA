package ex7_work;

public class Calculator {

	public void	getResult(int num1,int num2, String cal){ //int...n �ڿ� String cal�� ���� ������ ��. =>String cal, int...n => ����
	
		switch (cal) {
		case "+":                                                   // String result = "";
			System.out.println(num1 +"+"+ num2 +"="+ (num1+num2));  // result = n[0] + "+" + n[1] + "=" + (n[0] + n[1]);
			                                                        // result = String.format("%d + %d = %d, n[0], n[1], n[0] + n[1]);
			break;

		case "-":
			System.out.println(num1 +"-"+ num2 +"="+ (num1-num2));
			
			break;

		case "*":
			System.out.println(num1 +"*"+ num2 +"="+ (num1*num2));
			
			break;

		case "/":
			System.out.println(num1 +"/"+ num2 +"="+ (num1/num2));
				
			break;

		case "%":
			System.out.println(num1 +"%"+ num2 +"="+ (num1%num2));
			
			break;
			
		default:
			System.out.println("��ȿ�������� �����Դϴ�.");
			break;
		}                                                           // system.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
