
public class User {
	//멤버변수 생성자 메서드 메인 메서드 메인메서드 안에 인스턴스 생성후 메인 메서드 출력
	private String name;
	private int age;
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("유저의 이름 : " + name);
		System.out.println("유저의 나이 : " + age);
	}
	
	public static void main(String[] args) {
		User u1 = new User("서동재",28);
		
		u1.displayInfo();
	}
}

