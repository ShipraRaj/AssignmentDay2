package package2;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class SBI extends BankDetails {
	BankDetails b = new BankDetails();
	int withdrawn=0;
	int depst=0;
	int prev_trans;
	String tran_Status;
	int deposit(int money) {
		depst = b.getSalary()+money;
		return depst;
		}
	int withdrawl(int money) {
		withdrawn=depst-money;
		try{
			if(withdrawn>money) {
				System.out.print("Insufficient balance");
				tran_Status="Transaction failed!";
				return withdrawn;
			}
			else{
				tran_Status="Transaction passed";
				return withdrawn;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Transaction failure!");
		}
		return 0;
	}
	void log() {
		System.out.print("Time of transaction");
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/mm/dd  HH:MM:SS");
		LocalDateTime now= LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println("User account no: "+b.getAccNo());
		System.out.println("Amount Withdrawn:" +withdrawn);
		System.out.println("Amount  before Withdrawl:" +depst);
		System.out.println("Amount after Withdrawl:" +withdrawn);
		System.out.println("Amount status after Withdrawl:" +tran_Status);
	}
	void exit() {
		System.exit(0);
	}
	
}

