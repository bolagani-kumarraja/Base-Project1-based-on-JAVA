package atmpackages;
import java.util.*;

public interface ATMOperations {
	ATM_variables a = new ATM_variables();
	Map<Double,String> map = new HashMap<>();
	static void viewBalance(){
		System.out.println(a.getBalance());		
	}
	static void withdrawAmount(double amount) {
		if(amount%200==0 || amount%500==0 || amount%100==0) {
			if(amount<=a.getBalance()) {
				a.setBalance(a.getBalance()-amount);
				map.put(amount, "Withdrawal successfully");
				System.out.println("Sucessfully Withdrawal -->"+amount);
				System.out.println("**Take your cash**");
			}else {
				System.out.println("Insufficient Funds");
			}
		}else {
			System.out.println("Please enter the amount in domins of 100/200/500 only.");
		}
	}
	static void depositeAmount(double depositeAmount){
		System.out.println("Deposited successfully --> "+ depositeAmount);
		a.setBalance(a.getBalance()+depositeAmount);
		map.put(depositeAmount, "Deposited Sucessfully");
		
	}
	static void miniStatement() {
		Set<Double> s = map.keySet();
		for(double records:s) {
			System.out.println(records +" --> "+map.get(records));
		}
	}
}
