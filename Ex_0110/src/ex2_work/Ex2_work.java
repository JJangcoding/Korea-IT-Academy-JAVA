package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ Ȧ�� ������ �����(���� ���� �밢���� ���� ��� ����!!!!) => 2���� �迭 ���,
		// 01,02 ���� ���ڸ��� ���ڰ� ������ ����!!!!!
		// 1�� ������ 1�� ��� ���� �־�� �Ѵ�.
		// �� ������ ĭ�� 2�� ��´�.
		// �� ������ ĭ�� 3�� ��´�.
		// �� �����ʿ� �������ڸ� ���~~~~
		// ���� ��ġ�� �������� �ٷ� ��ĭ �Ʒ��ʿ� ���ڸ� ����.
		// ���� ������ ���� ��, �������� ������ ���� ����

		Scanner sc = new Scanner(System.in);

		int[][] arr;

        int num = 1; //���ۼ�
        int y =0;//����(��:Y��)�� ������ ����
	    int x =0;//����(��:X��)�� ������ ����
	
	    System.out.print("������: ");
	    int size = sc.nextInt();
        x= size/2;	
        
        //�迭�� ũ��
        arr = new int[size][size];
	
	    //�������� �׸� while��
        while(num<= size*size) {
        	arr[y][x] = num;
        	
        	if(num%size==0) {y++;}// size ��� ������ ���� �� ������ �ٷιؿ� ���� �ȴ�.
        	else {
        		y--;
        		x++;       // ������ ���� ����.
        	}
        	
        	if(y<0) {
        		y = size-1;
        	}
        	
        	if(x>=size) {
        		x=0;
        	}
        	
        	num++;
        	
        }
	
	
	
	
	
	//arr�迭�� ��� ��� ���� ȭ�鿡 ���
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.printf("%02d ", arr[i][j]);
		}System.out.println();
	}	
	
	
	
	
	
	
	}// main

}
