package ex2_switch;

public class Ex1_switch {
public static void main(String[] args) {
	
	
	//switch-case�� : �񱳰��� ���ǰ��� ���� ����� ó���ϴ� ���
	//switch(�񱳰�){
    // case ���ǰ�: 
	// �񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
	//break;
	//}
	
    int n = 2;
    switch( n ) {//�񱳰�(���� ���� �� �ִ�)
    case 1: //���ǰ��� Ÿ���� �񱳰��� �ݵ�� ��ġ�ؾ� �Ѵ�!!!!
       System.out.println("1.���ӽ���");
       break;
       
    case 2:
       System.out.println("2.���ӼҰ�");
       break;
    
    case 3:
       System.out.println("3.�ɼ�");
       break;
    	
    default:
    	//�񱳰��� ���ǰ��� ��� ��ġ���� �������
    	//�ݵ�� ����Ǵ� ����
    	System.out.println("1,2,3�߿����� �Է��ϼ���");
    	break;
    
    }//switch => ������ ���̽��� ã�Ƽ� �극��ũ�� �Ǵ�. (switch�� ��������) vs else if���� ���������� �Ʒ��� ����.
    // => ����ӵ��� switch�� ������ ������.
    //���ǿ� ��� �ش���������� �ƹ��͵� ������ �ʴ´�. => default�� ���(�⺻��)
	
	
	
}//main
}
