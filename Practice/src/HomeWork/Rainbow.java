package HomeWork;

import java.util.ArrayList;

public class Rainbow {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList();
		
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남색");
		rainbow.add("보라");
		System.out.println("무지개의 색 : " + rainbow);
		
		rainbow.set(0, "블랙");
		rainbow.set(2, "브라운");
		rainbow.set(4, "그린");
		System.out.println("수정된 무지개의 색 : " + rainbow);
		
		rainbow.add(2,"옐로우");
		rainbow.add(6,"연한파랑");
		System.out.println("추가된 무지개의 색 : " + rainbow);
		
		for (String rainbows : rainbow) {
			System.out.println(rainbows);
		}
		/*rainbow.add("빨강");
		rainbow.add("파랑");
		System.out.println("빨강 파랑 다시 추가 : " + rainbow);
		*/
		
		rainbow.clear();
		rainbow.add("빨강");
		rainbow.add("파랑");
		rainbow.add("보라");
		
		System.out.println("최종 출력 후 : " + rainbow);
		
	
	}

}
