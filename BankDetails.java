package package2;
import java.util.Date;

public class BankDetails {
	private Double rateOfinterest =3.0;
	private String C_name = "Shipra Raj";
	private long acc_no = 234123675;
	private int salary=50000;
	public BankDetails() {
	}
	public BankDetails(double rateOfinterest,String C_name,long acc_no,int salary) {
		this.rateOfinterest=rateOfinterest;
		this.C_name=C_name;
		this.acc_no = acc_no;
		this.salary=salary;
	}
	public double getRateOfInterest() {
		return rateOfinterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfinterest=rateOfinterest;
	}
	public String getName() {
		return C_name;
	}
	public void setName(String C_name) {
		this.C_name=C_name;
	}
	public long getAccNo() {
		return acc_no;
	}
	public void setAccNo(long acc_no) {
		this.acc_no=acc_no;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary=salary;
	}
}
