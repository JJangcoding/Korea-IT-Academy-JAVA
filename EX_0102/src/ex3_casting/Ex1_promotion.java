package ex3_casting;

public class Ex1_promotion {

	
	public static void main(String[] args) {
	//ĳ����(����ȯ)
    //���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� ����(����)
    
    //1.���θ��
    // - ū �ڷ����� ���� �ڷ����� �����ϴ� ��
		double d =100.5; //8byte
		int n = 200; // 4byte
		d = n; // ������ ���� ���ʿ� �ִ´�. (����)  = > 200.0�� ���´�. (�ڵ���ȯ)
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n1 = 100; //4byte
		n1 = c; // ū �׸��� ���� �׸��� ������?? OK but ���� �׸��� ū �׸��� �� �ִ´�.  = > A�� �ƽ�Ű �ڵ忡 ���缭 ���ڷ� �־���
        System.out.println(n1);
	
        
    
	}
}
 