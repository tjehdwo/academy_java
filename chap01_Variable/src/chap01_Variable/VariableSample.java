package chap01_Variable;

public class VariableSample {

	public static void main(String[] args) {
		String name;
		name = "����";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		
		System.out.println("�ȳ��ϼ���." + name + "�Դϴ�. ���� "+ hour +"�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + " �Դϴ�.");
		System.out.println(score + " �� ���� " + grade + " �Դϴ�.");
		
		//������ �̸��� ���̿� �ڽ��� ���� (double)�� �ֱ�.
		/*
		 -�̸� String
		 ���� int
		 ���� double
		 char�� �̿��� ��� �����ϰ� ����ϱ� ~ 25�б���
		 * */
		String myName = "��泭";
		int myAge =90;
		double myScore = 90.5;
		char myGrade = 'A';
		
		System.out.println("���� �̸��� " + myName + "�Դϴ�. ���� ���̴�" + myAge + "�̱���, ���� ������" + myScore + "�Դϴ�. ���� ����� " + myGrade + " �Դϴ�.");
	}

}
