package chap01_Variable;

public class Variable {

	public static void main(String[] args) {
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
				int intNum = 100;
				System.out.println(intNum);//���� 100�� �ǹ�
				long longNum = intNum; //int�� long���� �ڵ� ����ȯ
				System.out.println(longNum);
				
				float floatNum = 3.14f;
				double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ
				
				// int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
				int intNum2 = 1000;
				System.out.print("intNum2 : ");
				System.out.println(intNum2);
				long longNum2 = intNum2;
				System.out.println(longNum2);
				
				int intNum3 = -100;
				System.out.print("intNum3 : ");
				System.out.println(intNum3);
				long longNum3 = intNum3;
				System.out.print("longNum3 : ");
				System.out.println(longNum3);
				//short-> int �����ϴ� ����ȯ 1���� ����� ����ϱ�
				short shortNum1 = 500;
				System.out.print("shortNum : ");
				System.out.println(shortNum1);
				int intNum5 = shortNum1;
				System.out.println(intNum5);
				//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
				float floatNum2 = 3.14f;
				System.out.println(floatNum2);
				double doubleNum2 = floatNum2;
				System.out.println(doubleNum2);
				
			//2. ����� ����ȯ(���� ����ȯ)
				
				//long -> int
				long largeLong = 123456789012345L;
				System.out.print("largeLong : ");
				System.out.println(largeLong);
				int largeInt = (int) largeLong;
				System.out.println(largeInt);// long�� int�� ���� ����ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻε����ʹ� �սǵȴ�.
				
				double largeDouble1 = 12345.6789;
				int intPart = (int) largeDouble1;
				System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� �� (���� �κи� �����ȴ�.)
				
				char charValue = 'A';
				int intValue = charValue;
				System.out.println(intValue);
				char charValue2 = 'B';
				int intValue2 = charValue2;
				System.out.println(intValue2);
				
				char charValue3 = 'C';
				int intValue3 = charValue3;
				System.out.println(intValue3);
				
				char charValue4 = 'D';
				int intValue4 = charValue4;
				System.out.println(intValue4);
				
				char charValue5 = 'E';
				int intValue5 = charValue5;
				System.out.println(intValue5);
				
				// double -> int�� ����ȯ  1�� ���
				
				//int�� short�� ����ȯ 1�� ���
				

	}

}
