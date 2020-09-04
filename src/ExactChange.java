import java.util.Scanner;
public class ExactChange {

	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
		  
		  int userInput = scnr.nextInt();
		  if( userInput <= 0 ){
		    System.out.println("No change");  
		   }
		   
		  
		  int dollars = userInput/100;
		  userInput = userInput - dollars * 100;
		  
		  int quarters = userInput/25;
		  userInput = userInput- quarters * 25;
		 
		  int dimes = userInput/10;
		  userInput = userInput- dimes * 10;
		 
		 
		  int nickels = userInput/5;
		  userInput = userInput- nickels * 5;

		  int pennies = userInput/1;
		  userInput = userInput- pennies * 1;
		  
		 
		    if(dollars > 1){
		     
		     System.out.println(dollars +" " +"Dollars");  
		      
		    }
		   
		    else if(dollars == 1) {
		     System.out.println(dollars +" " +"Dollar") ; 
		    
		    }
		    
		    if(quarters > 1){
		       System.out.println(quarters +" " +"Quarters");
		    }
		   
		    else if(quarters == 1){
		       System.out.println(quarters + " " + "Quarter");
		    
		    }
		    if(dimes > 1){
		       System.out.println(dimes + " " + "Dimes");
		    }
		    else if(dimes == 1){
		       
		       System.out.println(dimes + " " + "Dime");
		   
		    }
		    if(nickels > 1){
		       System.out.println(nickels + " " + "Nickels");
		    }
		   else  if(nickels == 1){
		      System.out.println(nickels + " " + "Nickel"); 
		  
		    }
		    if(pennies > 1){
		     System.out.println(pennies + " " + "Pennies");  
		    }
		    else if (pennies ==1){
		     System.out.println(pennies + " " + "Penny");  
		   
		    }
		   
		   	
	}

}
