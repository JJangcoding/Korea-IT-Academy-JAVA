package ex1_operator;

public class Ex3_Operator {
public static void main(String[] args) {
	
	//����������
	//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
	//���������� ���������� �������� Ȯ���� ��������!
	int a = 10;
	System.out.println("a : " + ++a);  // ���� ���� (�켱������ �ſ� ����. ��µǱ����� ����)
	
	int b = 10;
	System.out.println("b : " + b++);  // ���� ���� (�켱������ ���� ����. ��µǰ� ���� ����)
	System.out.println(b);
	
	b++ ;
	--b ;
	--b ;
	++b ;
	b-- ;
	b-- ;
	b++ ;
	++b ; 
	System.out.println(b--);
	
    //���� �����ڴ� 1�� �ۿ� ���� ���Ѵ�. 2�̻��� ������ �Ϸ��� ���� �����ڸ� ����ϴ� ���� ����.
	b += 2; 

	//����(����) ������
	//������ �ΰ�, �� ���ǿ� ���� ����� ���� ���� �����϶��� ���� 
	//�ٸ� ����� �����ִ� ������
	int aa = 10;
	int bb = 15;
	boolean res= ++aa >= b ? true: false; // ����ǥ(?)�� �����ݷ�(;)�� �ϳ��� ��Ʈ. ���̸� ���� ��. �����̸� ���� ��
	System.out.println(res);
	
	char res2 = ++aa < bb ? 'y' : 'n';
    System.out.println(res2);
	
	
	
	
} //main
}//class end
