package ex2_switch;

public class Ex5_work {
public static void main(String[] args) {
	
int su1= 3;
int su2= 2;
char op = '*'; // +, -, *, /, % ���ϴ� �����ڿ� �����־ ���� ����� (10+5=15)

switch (op) {
case '+':
	System.out.println(su1 +"+"+ su2 +"="+ (su1+su2));
	
	break;

case '-':
	System.out.println(su1 +"-"+ su2 +"="+ (su1-su2));
	
	break;

case '*':
	System.out.println(su1 +"*"+ su2 +"="+ (su1*su2));
	
	break;

case '/':
	System.out.println(su1 +"/"+ su2 +"="+ (su1/su2));
		
	break;

case '%':
	System.out.println(su1 +"%"+ su2 +"="+ (su1%su2));
	
	break;
	
default:
	System.out.println("��ȿ�������� �����Դϴ�.");
	break;
}













}//main
}
