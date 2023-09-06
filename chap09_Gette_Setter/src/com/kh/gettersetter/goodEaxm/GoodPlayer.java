package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {
	private String name;     //캐릭터이름
	
	public void setName(String name) {//이름이 변경되면 저장될 set
		this.name = name;
	}
	//검증하는 valid
	public void ValidName() {  //캐릭터이름에 공백이 없는지 검증!
		if(this.name == "") {
			System.out.println("이름을 넣지 않았습니다.");
		}
	}
	public String getName() { //캐릭터 이름을 반환
		return name;
	}
	
	
	private int health;		 //체력

	public void setHealth(int health) { //매개변수에 저장된 체력 저장
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
	
	
	private int attackPower; //공격파워
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void ValidAttackPower() { //무결성되게 검증
		//만약에 파워가 0 보다 작을 경우
		if(attackPower <= 0) {
			this.attackPower = 0;
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
}
	
	