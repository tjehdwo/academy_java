
public class User {
	//������� ������ �޼��� ���� �޼��� ���θ޼��� �ȿ� �ν��Ͻ� ������ ���� �޼��� ���
	private String name;
	private int age;
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("������ �̸� : " + name);
		System.out.println("������ ���� : " + age);
	}
	
	public static void main(String[] args) {
		User u1 = new User("������",28);
		
		u1.displayInfo();
	}
}

