
public class Eaxm_variable {
	public static void main(String[] args) {
		int val, val2;
		int num1 = 10;
		val = ++num1; 
		//num�� ���� 1 ������ �� val ������ ������ �ϱ� ������ 11�� ���Ե�
		System.out.println(val);
		
		val2 = --num1; 
		//num�� ���� 1 ������ ��  val ������ ����
		System.out.println(val2);
		
		//1-2 ���� ���� ������ : ++ ���� ���� 1�� ���Ѵ�.
		int val3, val4;
		int num2 = 10;
		System.out.println("num2�� �� : " + num2);
		
		val3 = num2++;//val3 ������ ���� num3 ���� ������ �� num3 �� 1 ����
		System.out.println("val3 : " + val3);
		System.out.println("num2�� �� : " + num2);
		
		val4 = num2--;
		System.out.println("val4 : " + val4);
		System.out.println("num2�� �� : " + num2);
	}

}
