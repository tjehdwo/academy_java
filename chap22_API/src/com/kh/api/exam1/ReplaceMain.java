package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain rm = new ReplaceMain();
		rm.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, World!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println(input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World�� Java�� ��ü
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}

	public void replace3() {
		String originName = "Hello, world";
		//o�� �����ִ� ���ڿ��� x�� �����ϱ�
		String reOriginName = originName.replace("o", "x");
		System.out.println(reOriginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// fox - >cat
		String reOriginString = originString.replace("fox","cat");
		System.out.println(reOriginString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// ��� ���� �����ϱ�
		String reOriginString = originString.replace(" ", "");
		System.out.println(reOriginString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace ��� replaceAll �� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)World","java" );
		System.out.println(reAllstr);
	}
}
