/*
 ������ ������ �� �������� �ϳ��� �ڷ����� �����ϴ�.
 �������� ���� �����ϴ�.
 int = ������ ��Ÿ��;
 String = ���ڸ� ��Ÿ��;
 ������ �޸�(RAM)�� ���� ����ϱ� ���� ����
 ������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��
 ���������� : 
            1) �ڷ��� ������;
            2) �ڷ��� ������ = ��;
              
 */
public class Variable {
	public static void main(String[] args) {
		int age = 28;
		System.out.println("���� : " + age);
		int month = 8;
		int day = 28;
		System.out.println(month +"��"+day+"��");
		
		String date = "��";
		System.out.println(month+date+day+"��");
		// �ڽ��� �̸��� �� ���� ���� ������ ����� ���ô�.
		String name = "������";
		int mth = 5;
	    int dy = 11;
		System.out.println(name+mth+"��"+dy+"��");
		
		
		
		//1.�ڷ��� ������;
		int number1;
		number1 = 100;
		System.out.println("number1 :"+ number1);
        number1 = 200; //�������� ���� �����ϴ�.
		System.out.println("number1(����) :"+ number1);
		//�ڷ��� ������ = ������;
		int number2 = 300;
		System.out.println("number2 :" + number2);
		
		String name1 = "JAVA";
		System.out.println("name1 :"+name1);
		name1 = "Hi Java";
		System.out.println("name1(����) :"+name1);
		
		int a = 10;
		int b = 20;
		System.out.println("+ :"+ (a + b));
		System.out.println("* :"+ a * b);
		//������ �ȿ� ���ڸ� �ְ� ���ϱ� ���� ���ϱ� ������ �ֱ�
		int number5 = 2;
		int number6 = 4;
	
		//1. ���ϱ�
		System.out.println("���ϱ�");
		System.out.println(number5 +number6);
		//2. ����
		System.out.println("����");
		System.out.println(number6 - number5);
		//3. ���ϱ�
		System.out.println("���ϱ�");
		System.out.println(number5 * number6);
		//4. ������
		System.out.println("������(/) :");
		System.out.println(number6 / number5);
		
		//5. ������ ���ϱ� (%)
		System.out.println("������(%) :");
		System.out.println(number6 % number5);
		
		
		
		
        
	}

}
