
public class Eaxm_variable {
	public static void main(String[] args) {
		int val, val2;
		int num1 = 10;
		val = ++num1; 
		//num의 값이 1 증가한 후 val 변수에 대입을 하기 때문에 11이 대입됨
		System.out.println(val);
		
		val2 = --num1; 
		//num의 값이 1 감소한 후  val 변수에 대입
		System.out.println(val2);
		
		//1-2 후위 증감 연산자 : ++ 항의 값에 1을 더한다.
		int val3, val4;
		int num2 = 10;
		System.out.println("num2의 값 : " + num2);
		
		val3 = num2++;//val3 변수에 기존 num3 값을 대입한 후 num3 값 1 증가
		System.out.println("val3 : " + val3);
		System.out.println("num2의 값 : " + num2);
		
		val4 = num2--;
		System.out.println("val4 : " + val4);
		System.out.println("num2의 값 : " + num2);
	}

}
