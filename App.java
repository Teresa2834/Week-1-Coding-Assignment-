
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double priceOfItem = 4.99;
		double moneyInWallet = 46.50;
		int numberOfFriends = 84;
		int age = 28; 
		char middleInitial = 'V';
		String firstName = "Anne";
		String lastName = "Lee";
	
		System.out.println("The price of the item is: " + '$' + priceOfItem);
		System.out.println("Anne has " + '$' + moneyInWallet + " in her wallet");
		moneyInWallet = moneyInWallet - priceOfItem;
		System.out.println("Total amount of money left after buying the item: " + '$' + moneyInWallet);
		System.out.println("");
		System.out.println("Anne is: " + age);
		System.out.println("Anne has " + numberOfFriends + " friends");

		System.out.println("On average, Anne made " + numberOfFriends / 28 + " friends per year");
		
		System.out.println("");
		
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("Full Name: " + fullName);
		
		
		
				
		
		
	}

}
