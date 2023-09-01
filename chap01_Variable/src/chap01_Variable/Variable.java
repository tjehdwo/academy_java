package chap01_Variable;

public class Variable {

	public static void main(String[] args) {
		//1. 자동형변환(암시적형변환, 묵시적형변환)
				int intNum = 100;
				System.out.println(intNum);//숫자 100을 의미
				long longNum = intNum; //int를 long으로 자동 형변환
				System.out.println(longNum);
				
				float floatNum = 3.14f;
				double doubleNum = floatNum; //float를 double로 자동 형변환
				
				// int -> long 변경하는 형변환 2가지 만들고 출력하기
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
				//short-> int 변경하는 형변환 1가지 만들고 출력하기
				short shortNum1 = 500;
				System.out.print("shortNum : ");
				System.out.println(shortNum1);
				int intNum5 = shortNum1;
				System.out.println(intNum5);
				//float -> double 변경하는 형변환 1가지 만들고 출력하기
				float floatNum2 = 3.14f;
				System.out.println(floatNum2);
				double doubleNum2 = floatNum2;
				System.out.println(doubleNum2);
				
			//2. 명시적 형변환(강제 형변환)
				
				//long -> int
				long largeLong = 123456789012345L;
				System.out.print("largeLong : ");
				System.out.println(largeLong);
				int largeInt = (int) largeLong;
				System.out.println(largeInt);// long을 int로 강제 형변환 할 경우 값이 범위안에 있지 않으면 일부데이터는 손실된다.
				
				double largeDouble1 = 12345.6789;
				int intPart = (int) largeDouble1;
				System.out.println(intPart); //실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
				
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
				
				// double -> int로 형변환  1개 출력
				
				//int를 short로 형변환 1개 출력
				

	}

}
