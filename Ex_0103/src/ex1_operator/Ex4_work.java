package ex1_operator;

public class Ex4_work {
public static void main(String[] args) {
	
	int a = 10;
	int b = 12;
	
	int res = ++a >= b || 2+7 <= b && 13-b >=0 && (a+=b)- (a % b) > 10 ? 1:0;
	//11     12    9     12     1          11+12   23/12
	//=> 1
	
	
	
}//main
}
