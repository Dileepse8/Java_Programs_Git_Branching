package encapsulation;

public class Account_Encap_main {

	public static void main(String[] args) {
		
		Account_Encap ae=new Account_Encap();
		ae.setAcctno(11223344);
		ae.setName("DILEIP");
		ae.setAmount(51020.21);
		
		System.out.println(ae.getAcctno());
		System.out.println(ae.getName());
		System.out.println(ae.getAmount());
		

	}

}
