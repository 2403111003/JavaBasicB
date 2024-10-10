package oop.bankapplication;

public class Account {
	private String bank_account_number;
	private String account_holder;
	private int deposit_amount;

	private final int INITIAL_DEPOAIT = 10000;

	public Account(String ban, String ah, int ida) {
		this.bank_account_number = ban;
		this.account_holder = ah;
		this.deposit_amount = ida;
	}

	public Account() {
		
	}

	public String getBank_account_number() {
		return bank_account_number;
	}

	public int getInitialDepoait() {
		return INITIAL_DEPOAIT;
	}

	public void setBank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
	}

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getInitial_deposit_amount() {
		return deposit_amount;
	}

	public void setInitial_deposit_amount(int initial_deposit_amount) {
		this.deposit_amount = initial_deposit_amount;
	}
}
