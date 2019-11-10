package any;
import java.util.Scanner;

public class HalfArrow {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 0; //loop variable
		int j = 0; // loop variable
		int arrowBaseHeight = 0;
		int arrowBaseWidth = 0;
		int arrowHeadWidth = 0;
		
		
		//Get user inputs and print them
		System.out.println("Enter arrow base height:");
		arrowBaseHeight = scnr.nextInt();
		System.out.println(arrowBaseHeight);
		System.out.println("Enter arrow base width:");
		arrowBaseWidth = scnr.nextInt();
		System.out.println(arrowBaseWidth);
		System.out.println("Enter arrow head width:");
		arrowHeadWidth = scnr.nextInt();
		System.out.println(arrowHeadWidth);
		System.out.println();
		
		while (arrowHeadWidth <= arrowBaseWidth) {
			System.out.print("Please input an arrow head width greater than the base");
			arrowHeadWidth = scnr.nextInt();
		}
		
		
		//Create arrow base
		for (i = 0; i < arrowBaseHeight; i++) {
			for (j = 0; j < arrowBaseWidth; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		//create arrow head
		for (i = arrowHeadWidth; i > 0; i--) {
			for (j = 1; j <= i; j++	) {
				System.out.print("*");
			}
			System.out.println();
		}
					
	}

}
