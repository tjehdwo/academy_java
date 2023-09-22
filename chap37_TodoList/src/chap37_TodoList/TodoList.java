package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
		
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i+1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList td = new TodoList();
		//td.practiceTodoList();
		td.practiceSet();
	}
	public void practiceTodoList() {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰� :add, ����:remove, ���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
					//equalsIgnoreCase
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) - 1;
					todoList.removetask(index);
				}catch(Exception e){
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if (choice.equals("list")|choice.equals("LIST")|choice.equals("LisT")) {
				todoList.displayTasks();
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	

	}

	public void practiceMap() {
		Map<String,Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		m.put("add",1);
		m.put("remove",2);
		m.put("list",3);
		m.put("exit",4);
		System.out.println(m);
		
		
		
			
		}
	public void practiceSet() {
		Set<String> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("���� �߰� :add, ����:remove, ���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
		
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				set.add(task);
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) - 1;
					set.remove(index);
				}catch(Exception e){
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if (choice.equals("list")|choice.equals("LIST")|choice.equals("LisT")) {
				for(String list : set) {
					System.out.println(list);
				}
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
		}else {
			System.out.println("�߸��� ����Դϴ�.");
			}
		}System.out.println("����");
		sc.close();
	}	
}

