import java.util.Scanner;
import java.util.List;
class ATM{
	public static void Process(){
		int Balance = 2000;
		System.out.println("Press 1 Make Deposit");
		System.out.println("Press 2 To Withdraw ");
		System.out.println("Press 3 to check Balance");
		
		Scanner scanner = new Scanner (System.in);
		float input = scanner.nextFloat();
		
		if(input == 1){
			System.out.println("Your Balnace is" + Balance);
		}
		else if (input == 2){
			System.out.println("Enter Deposit");
			float Deposit = scanner.nextFloat();
			
			if (Deposit > 0){
				System.out.println("Deposit Successful");
				Balance+=Deposit;
				System.out.println("Current Balance " + Balance);
			}
			else {
				System.out.println("Try Another Transaction");
			}
		}
		else if (input == 3){
			System.out.println("Withdraw Money");
			float Amount = scanner.nextFloat();
			if (Amount <= Balance){
				Balance-=Amount; 
				System.out.println("Your new Balance" + Balance);
			}
			else {
				System.out.println("Not Enough Money");
			}
		}
	}
		public static boolean Account() {
		boolean Bank =false;
		System.out.println("Please enter your pin");
		
		Scanner scanner = new Scanner(System.in);
		int passcode = scanner.nextInt();
		int password= 1234;
		if (passcode == password) {
			Bank = true;
			System.out.println("continue");
		}
		return Bank;
	}
	
	public static void main(String[] args) {
		//Account();
		//Transaction();
		boolean bankAct = Account();
		if(bankAct == true){
			Process();
		}
		else
			System.out.println("WRONG PASSWORD!!!!!");
	
	}
}