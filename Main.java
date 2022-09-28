package package2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		SBI s=new SBI();
		BOI b=new BOI();
		ICICI i=new ICICI();
		BankDetails bd=new BankDetails();
		Scanner sc=new Scanner(System.in);
		int option='\0';
		int option2='\0';
		int option3='\0';
		int salary;
		String name;
		long account;
		int money;
		char c;
		System.out.println(".........Bank........");
		System.out.println("Name:" +bd.getName());
		System.out.println("Account No:" +bd.getAccNo());
		System.out.println("Salary:" +bd.getSalary());

		System.out.println(".........Select your Bank........");
		System.out.println("1. SBI ");
		System.out.println("2. BOI");
		System.out.println("3. ICICI");
		do {
			option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Welcome to SBI Bank");
				System.out.println("You have came for?");
				System.out.println("D. Deposit");
				System.out.println("W. Withdrawal");
				System.out.println("S. Check status");
				System.out.println("Q. Exit");
				do {
					c=sc.next().charAt(0);
					switch(c) {
					case 'D':
						System.out.printf("Enter deposit amount");
						salary=sc.nextInt();
						s.deposit(salary);
						System.out.println("Your deposit amount:" +s.deposit(salary));
						break;
					case 'W':
						System.out.printf("Enter withdrawal amount");
						salary=sc.nextInt();
						s.withdrawl(salary);
						System.out.println("Your withdrawn amount:" +s.withdrawl(salary));
						break;
					case 'S':
						s.log();
					case 'Q':
						System.out.println("Exit");
						break;
						default:
							System.out.println("Wrong input");
							break;
					}
				}while(c!='Q');
				break;
				
			case 2:
				System.out.println("Welcome to Bank of India");
				System.out.println("You have came for?");
				System.out.println("D. Deposit");
				System.out.println("W. Withdrawal");
				System.out.println("S. Check status");
				System.out.println("Q. Exit");
				do {
					c=sc.next().charAt(0);
					switch(c) {
					case 'D':
						System.out.printf("Enter deposit amount");
						salary=sc.nextInt();
						s.deposit(salary);
						System.out.println("Your deposit amount:" +s.deposit(salary));
						break;
					case 'W':
						System.out.printf("Enter withdrawal amount");
						salary=sc.nextInt();
						s.withdrawl(salary);
						System.out.println("Your withdrawn amount:" +s.withdrawl(salary));
						break;
					case 'S':
						s.log();
					case 'Q':
						System.out.println("Exit");
						break;
						default:
							System.out.println("Wrong input");
							break;
					}
				}while(c!='Q');
				break;
			case 3:
				System.out.println("Welcome to ICICI Bank");
				System.out.println("You have came for?");
				System.out.println("D. Deposit");
				System.out.println("W. Withdrawal");
				System.out.println("S. Check status");
				System.out.println("Q. Exit");
				do {
					c=sc.next().charAt(0);
					switch(c) {
					case 'D':
						System.out.printf("Enter deposit amount");
						salary=sc.nextInt();
						s.deposit(salary);
						System.out.println("Your deposit amount:" +s.deposit(salary));
						break;
					case 'W':
						System.out.printf("Enter withdrawal amount");
						salary=sc.nextInt();
						s.withdrawl(salary);
						System.out.println("Your withdrawn amount:" +s.withdrawl(salary));
						break;
					case 'S':
						s.log();
					case 'Q':
						System.out.println("Exit");
						break;
						default:
							System.out.println("Wrong input");
							break;
					}
				}while(c!='Q');
				break;
				default:
					System.out.print("Oops! Something went wrong");
					break;
			}break;
		}while(option!=3);
	}

}
