package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {
	private String name;     //ĳ�����̸�
	
	public void setName(String name) {//�̸��� ����Ǹ� ����� set
		this.name = name;
	}
	//�����ϴ� valid
	public void ValidName() {  //ĳ�����̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No name";
			//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	public String getName() { //ĳ���� �̸��� ��ȯ
		return name;
	}
	
	
	private int health;		 //ü��

	public void setHealth(int health) { //�Ű������� ����� ü�� ����
		this.health = health;
	}
	public void ValidHealth() {
		if(health <= 0) {
			this.health = 0;
		}
	}
	public int getHealth() {
		return health;
	}
	
	
	private int attackPower; //�����Ŀ�
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void ValidAttackPower() { //���Ἲ�ǰ� ����
		//���࿡ �Ŀ��� 0 ���� ���� ���
		if(attackPower <= 0) {
			this.attackPower = 0;
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	//��¸޼ҵ� �ۼ�
	public void displayInfo() {
		System.out.println("ĳ���� ���� : "+ this.name);
		System.out.println("ü�� ���� : "+this.health);
		System.out.println("���� �Ŀ� : "+this.attackPower);
	}
	//ĳ���� �����ϴ� ��� �޼���
		public void attack(GoodPlayer target) {
			System.out.println("["+name+"]"+ "(��)�� �����߽��ϴ�. "+"["+ target.getName()+"]"+"���� "+attackPower+ " �������� ����ϴ�.");
			
		}
		
		//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
		public void takeDamage(int damage) {
			System.out.println("���� �޾ҽ��ϴ�.");
		}
}
	
	