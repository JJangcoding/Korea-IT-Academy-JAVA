package ex7_work;

public class Calculator {

	public void	getResult(int num1,int num2, String cal){ //int...n 뒤에 String cal이 오면 오류가 뜸. =>String cal, int...n => 가능
	
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
			System.out.println("유효하지않은 연산입니다.");
			break;
		}                                                           // system.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
