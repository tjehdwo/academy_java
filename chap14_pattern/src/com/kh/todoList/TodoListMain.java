package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
		TodoListModel tdmodel = new TodoListModel("��ħ�Ա�");
		TodoListView tdview = new TodoListView();
		
		/*System.out.println(tdmodel);
		String item = tdmodel.getItem();*/
		System.out.println(tdmodel.getItem());
		tdview.displayTodoList();
	
	}

}
