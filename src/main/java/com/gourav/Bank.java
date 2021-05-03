package com.gourav;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		accounts=new LinkedHashMap<>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		long accountNumber = accounts.size()+1;
		accounts.put(accountNumber, new CommercialAccount(company,accountNumber ,pin,startingDeposit));
        return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		long accountNumber =  accounts.size()+1;
		accounts.put(accountNumber,new ConsumerAccount(person,accountNumber ,pin,startingDeposit));
        return accountNumber ;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function

		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return accounts.get(accountNumber).debitAccount(amount);
	}
}
