package ex3_casting;

public class Ex2_demotion {
public static void main(String[] args) {
	
	//2.����
	// -���� �ڷ����� ū �ڷ����� ���ԵǴ� �� (�ڵ�X)
	char c = 'c'; //2byte
	int n = c+1 ; //4byte �ƽ�Ű �ڵ�ǥ�� c�� 67. ���� 68�� �ִ� ��.
	// c=n �� �Ұ���
    c = (char)n; //���� �ڷ����� ū �ڷ����� ������ ����ȯ�� �����ֱ�. => c = 68�� �ش��ϴ� �ƽ�Ű�ڵ� ��� (D)
    System.out.println(c);
    
    float ff = 5.5f; // 4.XX byte
    n = 0; //4byte
    n= (int)ff; // �Ҽ����� ������ ��ƾ� �Ѵ�.(���������� ��ȯ) => �����Ͱ� ��ǵ�.
    System.out.println(n);
    
    
	
	
	
	
}
}
