package tut1;

public class Ex2_2 {
	 public static void main(String[] args) {
		    
	        int die1;   // The number on the first die.
	        int die2;   // The number on the second die.
	        int roll;   // The total roll (sum of the two dice).
	        
	        die1 = (int)(Math.random()*6) + 1;
	        die2 = (int)(Math.random()*6) + 1;
	        roll = die1 + die2;
	        
	        System.out.println("The first die comes up " + die1);
	        System.out.println("The second die comes up " + die2);
	        System.out.println("Your total roll is " + roll);

	    }  
}
