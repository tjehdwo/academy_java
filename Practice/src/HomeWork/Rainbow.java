package HomeWork;

import java.util.ArrayList;

public class Rainbow {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList();
		
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");
		rainbow.add("����");
		rainbow.add("����");
		System.out.println("�������� �� : " + rainbow);
		
		rainbow.set(0, "��");
		rainbow.set(2, "����");
		rainbow.set(4, "�׸�");
		System.out.println("������ �������� �� : " + rainbow);
		
		rainbow.add(2,"���ο�");
		rainbow.add(6,"�����Ķ�");
		System.out.println("�߰��� �������� �� : " + rainbow);
		
		for (String rainbows : rainbow) {
			System.out.println(rainbows);
		}
		/*rainbow.add("����");
		rainbow.add("�Ķ�");
		System.out.println("���� �Ķ� �ٽ� �߰� : " + rainbow);
		*/
		
		rainbow.clear();
		rainbow.add("����");
		rainbow.add("�Ķ�");
		rainbow.add("����");
		
		System.out.println("���� ��� �� : " + rainbow);
		
	
	}

}
