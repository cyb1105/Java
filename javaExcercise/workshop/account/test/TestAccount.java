package workshop.account.test;

import workshop.account.entity.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		//ctrl + f11
		Account account = new Account("A1100", "221-22-347", 10000);
		System.out.println(account);
		
		System.out.println(account.getBalance());
		account.deposit(1000);
		account.withdraw(2000);
		System.out.println("ภÜพื:" + account.getBalance());
		
	}

}
