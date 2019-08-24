/*
* @author ystuti
* @version 1.0
* */
package main;


import java.util.Scanner;


public class Gravity {

	public static void main(String[] args) {
		double g = 9.8;
		Scanner gar = new Scanner(System.in);
		double t = gar.nextDouble();
		double speed = g * t;
		double distance =(1f/2f) *(g * t * t);
		System.out.println("the speed of the object at"+ t + " seconds after its release is" + speed +" and the distance the object travelled in the "+ t +" seconds after the release is "+ distance );



	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
