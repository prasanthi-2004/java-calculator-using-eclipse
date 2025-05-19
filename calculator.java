

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	
		       Scanner msc = new Scanner(System.in);
		       
		       System.out.println("Enter 1 for addition");
		       System.out.println("Enter 2 for subtraction");
		       System.out.println("Enter 3 for multiplication");
		       System.out.println("Enter 4 for division");
		       int op = msc.nextInt();
		       System.out.println("Enter two numbers");
		       int n = msc.nextInt();
		       int m = msc.nextInt();
		      if(op == 1) {
		       System.out.println(n+m);
		      }else if(op == 2) {
		       System.out.println(n-m);
		      }else if(op == 3) {
		       System.out.println(n*m);
		      }else  if(op == 4) {
		    	  if (m != 0) {
		       System.out.println(n/m);
		     } else {
		    	 System.out.println("Cannot divide by zero");
		     }
		        
	          } else {
		    	   System.out.println("invalid operation");
		                }
		       
                 }

		    	   
		      }
		

	

