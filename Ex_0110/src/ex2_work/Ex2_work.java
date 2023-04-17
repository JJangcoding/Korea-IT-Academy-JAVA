package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 홀수 마방진 만들기(가로 세로 대각선의 합이 모두 같음!!!!) => 2차원 배열 사용,
		// 01,02 같이 두자리로 예쁘게 나오게 하자!!!!!
		// 1은 언제나 1행 가운데 열에 있어야 한다.
		// 위 오른쪽 칸에 2를 찍는다.
		// 위 오른쪽 칸에 3을 찍는다.
		// 위 오른쪽에 다음숫자를 계속~~~~
		// 값이 겹치면 직전숫자 바로 한칸 아래쪽에 숫자를 쓴다.
		// 위가 없으면 제일 밑, 오른쪽이 없으면 제일 왼쪽

		Scanner sc = new Scanner(System.in);

		int[][] arr;

        int num = 1; //시작수
        int y =0;//세로(행:Y축)을 결정할 변수
	    int x =0;//가로(열:X축)을 결정할 변수
	
	    System.out.print("사이즈: ");
	    int size = sc.nextInt();
        x= size/2;	
        
        //배열의 크기
        arr = new int[size][size];
	
	    //마방진을 그릴 while문
        while(num<= size*size) {
        	arr[y][x] = num;
        	
        	if(num%size==0) {y++;}// size 배수 다음의 수는 그 이전수 바로밑에 쓰면 된다.
        	else {
        		y--;
        		x++;       // 오른쪽 위에 찍어라.
        	}
        	
        	if(y<0) {
        		y = size-1;
        	}
        	
        	if(x>=size) {
        		x=0;
        	}
        	
        	num++;
        	
        }
	
	
	
	
	
	//arr배열에 담긴 모든 값을 화면에 출력
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.printf("%02d ", arr[i][j]);
		}System.out.println();
	}	
	
	
	
	
	
	
	}// main

}
