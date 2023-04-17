package ex4_method;

public class Ex1_paramMain {
public static void main(String[] args) {
	
	Ex1_param e1 = new Ex1_param();
	
	String str = "안녕";
	
	e1.test1(str);
	
	System.out.println("main : "+str);//String의 불변의 특징임.
	
	System.out.println("------------------------------");


    int[] arr = {1,2,3};
    e1.test2(arr);//배열을 test2로 보냄. 값이 아닌 주소로 보내는것!!! (String[불변의 특징]이 아닌 경우) => 원본 데이터도 값이 바뀌어 버린다!!!!!!!
    for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}




































}//main
}
