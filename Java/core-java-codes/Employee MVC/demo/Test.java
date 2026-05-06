package demo;

import controller.EmployeeController;
import view.EmployeeView;

public class Test {

	public static void main(String[] args) {
		EmployeeController e = new EmployeeController();
		EmployeeView view = new EmployeeView(e);
		
		view.showMenu();

	}

}
