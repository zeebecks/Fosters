package any;
import java.util.Scanner;

public class HighwayLab {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in); 
	      int highwayNumber;
	      int primaryNumber;
	      int auxiliaryNumber;
	      int serviceNumber;
	      
	      System.out.println("Enter an Interstate Highway number:");
	      
	      highwayNumber = scnr.nextInt();
	      
	      if (highwayNumber == 0) {
	         System.out.println(highwayNumber + " is not a valid interstate highway number.");
	      }
	      else if (highwayNumber > 999) {
	         System.out.println(highwayNumber + " is not a valid interstate highway number.");
	      }
	      else if (highwayNumber > 0 && highwayNumber < 100) {
	         primaryNumber = highwayNumber;
	         if (primaryNumber % 2 == 0) {
	            System.out.println("The " + primaryNumber + " is primary, going east/west.");
	         }
	         else {
	            System.out.println("The " + primaryNumber + " is primary, going north/south.");
	         }
	      }
	      else if (highwayNumber > 99) {
	         auxiliaryNumber = highwayNumber;
	         serviceNumber = auxiliaryNumber % 100;
	         if (serviceNumber % 2 == 0) {
	            System.out.println("The " + auxiliaryNumber + " is auxiliary, serving the " + serviceNumber + ", going east/west.");
	         }
	         else {
	            System.out.println("The " + auxiliaryNumber + " is auxiliary, serving the " + serviceNumber + ", going north/south.");
	         }
	      }
	     
	         
	         
	   }
	}


