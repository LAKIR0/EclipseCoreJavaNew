//declaring package
package com.demo1;

//declaring class
public class DemoPolymorphism {

	//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoShape square = new DemoShape();
		square.calculateArea(89.7f);

		DemoShape rectangle = new DemoShape();
		rectangle.calculateArea(54.3f, 67.5f);

		DemoShape circle = new DemoShape();
		circle.calculateArea(5.4);

	}//end of main

}//end of class
