package ex1_operator;

public class Ex5_work {
public static void main(String[] args) {
	
	/*
	 결과)
	 하루생산량 : 17개
	 시간당 평균: 한시간의 몇개가 만들어져야 하루 17개를 채울 수 있는가? ex) 0.7XXXXXXXXX개
	 과수원이 있다.
	 배, 사과, 오렌지를 키우고 있는데, 하루생산량은 각각
	 5,7,5개다.
	 
	 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
	 2) 한시간에 몇개의 과일이 생산되는지 출력
	 
	 ##단, 과일의 갯수와 하루 생산량을 저장할 변수는 int타입으로,
	 시간당 생산수를 출력할 변수는 float타입으로 만들 것.
	 
	 ##같은 결과가 나오는 코드지만, 최소 두 가지 이상의 방법을 사용해 볼 것.
	 */
     int p = 5;
     int a = 7;
     int o = 5;
	
     int total = p + a + o;
     float avg = total/24f;
  
     System.out.println("하루에 생산되는 과일의 양 : " + total );
     System.out.println("시간당 생산되는 과일의 양 : " + avg);
     System.out.println("시간당 생산되는 과일의 양 : " + (float) total/24f);
     
     
     


}//main
}
