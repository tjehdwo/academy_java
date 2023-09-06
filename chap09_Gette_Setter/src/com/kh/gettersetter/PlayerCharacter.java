package com.kh.gettersetter;

public class PlayerCharacter {
	private String name;     //ĳ�����̸�
	private int health;		 //ü��
	private int attackPower; //�����Ŀ�
	
	/* 
	  Getter
	  	������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	  	���������ʹ� ������
	  
     */	                         
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	/*//valid -> �����Ҷ� ���� �̸�
	public void isValidHealth() {
		if(���࿡ ü���� 0 ���϶��) {
			ü���� 0 ���� �� �� =0;
		}
	}
	/*
	 Setter
	 �ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
	 �޼ҵ�� �Ű���(�Ű�����)�� �����ؼ� ��ȿ�� ���� �����ͷ� ����� �� ����
	  
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		//���࿡ ü���� 0�̶�� ���̰� ü���� 1�̻��̸� �츮��
		this.health = health;
		}
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� Ŭ ���
		this.attackPower = attackPower;		
	}

	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + name);
		System.out.println("ü�� ���� : " + health);
		System.out.println("���� �Ŀ� : " + attackPower);
	}
	//ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("["+name+"]"+ "(��)�� �����߽��ϴ�. "+"["+ target.getName()+"]"+"����"+attackPower+ "�������� ����ϴ�.");
		
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
}
