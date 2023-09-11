package com.kh.mvc.person.cl;

import com.kh.mvc.person.co.PersonController;
import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		PersonModel model = new PersonModel("�̾ƹ���",25,'��');
		
		PersonView view = new PersonView();
		
		PersonController controller = new PersonController(model,view);
		

		
		controller.setPersonName("�谳��");
		controller.setPersonAge(27);
		controller.setPersonGender('��');
		
		controller.updateView();
	}

}
