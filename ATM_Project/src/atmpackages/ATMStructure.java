package atmpackages;
import java.util.*;
public class ATMStructure implements ATMOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your ATM no:- ");
		int Atm_no = sc.nextInt();
		System.out.print("Enter you ATM pin:- ");
		int Atm_pin = sc.nextInt();
		if(Atm_no == 1234 && Atm_pin == 1030) {
			while(true) {
				System.out.println("1.Check Balance\n2.Deposit Amount\n3.Withdarw Amount\n4.MiniStatement\n5.Exit");
				System.out.print("Choose any one option:-");
				int option = sc.nextInt();
				switch(option) {
				case 1:
					ATMOperations.viewBalance();
					break;
				case 2:
					System.out.print("Enter amount that you need to deposite:- ");
					double dp = sc.nextDouble();
					ATMOperations.depositeAmount(dp);
					break;
				case 3:
					System.out.print("Enter amount that you need to withdraw:- ");
					double wa = sc.nextDouble();
					ATMOperations.withdrawAmount(wa);
					break;
				case 4:
					ATMOperations.miniStatement();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Please enter valid options.");
					break;	
				}
			}
		}else {
			System.out.println("Incorrect details.");
		}
	}

}
