package Week1VariablesandOperations;

public class Week02 {

	public static void main(String[] args) {
		//create a variable named age, assign a value of 14
		int age = 16;
		boolean hasLicense = false;
		
		//print the boolean expression age >= 16 and note the results.
		System.out.println(age >= 16);
		
		//change the value of age to 18 and run again
		
		//using a conditional, print the "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise
		//Change the value of age and rerun to see the results
		//hasLicense doesn't need to have == true for it to run correctly
		if(age >= 16 && hasLicense == true) {
			System.out.println("You can drive");}
		else {
			System.out.println("You cannot drive");
	
		}
		
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need to hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		
		//create two new variables costOfMilk and thirstLevel
		//create a a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is greater than 6 and prints "No thanks" otherwise
		//change the values and note the different results
		
		double costOfMilk = 4.50;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please"); }
		else { System.out.println("No thanks");
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children as the adult
		//you get to keep all the remaining cookies yourself
		//use a conditional to print the following based on the following conditions:
		//If there are 0 cookies remaining, print "Sad face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohooo!"
		//If there are 5 or more cookies, print "Jackpot!"
		
		int numberOfCookies = 23;
		int numberOfChildren = 5;
		//System.out.println(numberOfCookies % numberOfChildren);
		
		if (numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad face");}
		else if (numberOfCookies % numberOfChildren < 2)
		{ System.out.println("Yes!"); }
		else if (numberOfCookies % numberOfChildren <5 )
		{ System.out.println("Whoohooo!"); }
		else
		{ System.out.println("Jackpot!");}
		
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount on the following loyaltyMemberStatus scale
		//"Silver" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			break;
			
		}
		System.out.println(loyaltyMemberDiscount);
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		
		double billTotal = 675.00;
		double adjustedBillTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedBillTotal);
		
		if (adjustedBillTotal > 500) {
			if (loyaltyMemberStatus == "SILVER"){
				loyaltyMemberStatus = "GOLD";
			}
		else if (loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";}
		}
		
		System.out.println(loyaltyMemberStatus);
	
		
		
		//create two variables, username and password
		//created a conditional that prints "login successful" if the username is "Tommy123" and the passowrd is "12345"
		//otherwise print "access denied"
		
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		// in comparing Strings, always use .equals INSTEAD OF ==
		
		
		// write a for loop that prints each number from 0 to 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		//write a for loop that prints each number from 10 to 0 backwards
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		//write a for loop that prints every other number from 0 to 100
		for (int i = 0; i <= 100; i= i + 2) {
			System.out.println(i);	
		}
		
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "OOO" if it's odd
		for (int i = 0; i <= 100; i++) {
		if (i % 2 == 1) {
			System.out.println("000");
		} else 
			System.out.println("EVEN");
		}
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		int x = 100;
		while (x >= 0) {
			System.out.println(x + " " + x % 3);
			x--;
		}
			
	}

	
}
