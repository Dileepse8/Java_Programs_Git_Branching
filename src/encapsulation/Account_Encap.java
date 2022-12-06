package encapsulation;

public class Account_Encap {

	private int Acctno;
	private String Name;
	private double Amount;
	
	public int getAcctno() {
		return Acctno;
	}
	public void setAcctno(int acctno) {
		Acctno = acctno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
}
