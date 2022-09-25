package com.test.ch06;

public class Carexample {

	public static void main(String[] args) {
		int price;
		String company = "";
		String model = "";
		
		Car car = new Car();
		car.setCompany("현대");
		car.setModel("쏘나타");
		
		Car car2 = new Car("기아");
		Car car3 = new Car("테슬라", "모델s", "블랙");
		car3.setColor("레드");
		car3.setMaxSpeed(120);
		car3.setDueDate(args);
		
		/*String[] dueDateArr = new String[7]; dueDateArr[0]="06-01;
		 */
		
		
		String[] dueDateArr = {"06-01", "07-01", "08-01", "09-01", "10-01", "11-01", "12-01"};
		
		System.out.println(car.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
		car3.setMaxSpeed(200);
		System.out.println(car3.toString());
		
		car3.setMaxSpeed(300);
		System.out.println(car3.toString());
		
	}

}
