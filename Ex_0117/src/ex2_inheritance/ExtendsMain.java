package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		//��Ӱ��迡���� �ڽ�Ŭ������ �θ� ���� �ڿ�(�Ӽ�, �޼���)��
		//������� �����ٰ� ����� �� �ִ�.
		Child c1 = new Child();
		System.out.println( c1.money );
		
		//�θ��ڽ� ������ Ŭ������� �ص� private���� ������ ������
		//�ڽ��� ������ ���� ���Ѵ�.
		//System.out.println( c1.str );
		System.out.println( c1.car );
		
		Parent p1 = new Parent();
		//��� ������ ������ �θ�Ŭ������ �ڽ��� ������ �ִ� �Ӽ��� ������� ���Ѵ�
		//p1.car
		
		if( c1 instanceof Parent ) {
			System.out.println("c1�� Parent�� �ν��Ͻ��� �����ϴ�");
		}

	}//main
}
















