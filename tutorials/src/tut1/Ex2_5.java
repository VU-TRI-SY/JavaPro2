package tut1;
import utils.TextIO;
public class Ex2_5 {
	public static void main(String[] args) {
	      int eggs;    
	      int dozens;  
	      int extras;  
	      
	      System.out.print("How many eggs do you have?  ");
	      eggs = TextIO.getlnInt();
	      
	      dozens = eggs / 12;
	      extras = eggs % 12;
	      
	      System.out.print("Your number of eggs is ");
	      System.out.print(dozens);
	      System.out.print(" dozen and ");
	      System.out.print(extras);
	      System.out.println();
	   
	   } 
}
