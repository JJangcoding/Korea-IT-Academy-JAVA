package ex3_method;

public class MetMain {
public static void main(String[] args) {
	
        Method1 m1 = new Method1();
        m1.test1();
       
        int su = 100;
        m1.test2(su); //su:100을 test2 에 보냄 => 101이 출력 됨.
        
        System.out.println("su : " + su); //=> 얘는 100임.(원본에는 전혀 변화가 없음!!!!!)



//보낼 때는 parameter 가 있어야 하고 다시 받을때는 return이 있어야 된다.
//but void는 어떤 타입으로도 값을 받을 수 없다. 
//2개 넘기는것 불가능. 무조건 리턴 한개 + 하나의 숫자만 가능.
//리턴 밑의 줄은 코드 실행이 안됨. 리턴이 끝을 알리는 것임.




  String res = m1.test3("홍길동", 20); //값을 보냄.(1개 이상 가능하다.!!!!) // return str 이므로 String 변수여야함.
  System.out.println(res);

  res =m1.test3("kim",22);
  System.out.println(res);




























}//main
	
}
