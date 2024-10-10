package oop.bankapplication;

import java.util.Scanner;

public class BankApplication {
	private Account[] account = new Account[100];
	static int actcount = 0;
	String[] menu = { "------------------------------------------", 
			"1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료",
			"------------------------------------------",
			"--------" };
	Scanner sc = new Scanner(System.in);
	Account acnt = new Account();
	
	public void Start() {
		int key = 0;
		while(key != 5) {
			Menu();
			ShowString("선택> ");
			key = numberkey();
			switch (key) {
				case 1 -> AccountCreation();
				case 2 -> AccountList();
				case 3 -> Deposits();
				case 4 -> Withdrawal();
				case 5 -> Termination();
				default -> ShowString(key + "번은 없는 메뉴번호 입니다.\n");
			}
		}
	}
	public void Menu() {
		for (int i = 0; i < menu.length - 1; i++) {
			System.out.println(menu[i]);
		}
	}
	public void AccountCreation() {
		ShowString(menu[3], "게좌생성", menu[3]);
		ShowString("계좌번호: ");
		String ban = sc.nextLine();
		ShowString("계좌주: ");
		String ah = sc.nextLine();
		int InitialDepoait = acnt.getInitialDepoait();
		Account nacnt = new Account(ban, ah, InitialDepoait);
		ShowString("초기입금액:" + acnt.getInitialDepoait() + "\n");
		account[actcount++] = nacnt;
		ShowString("결과: 계좌가 생성되었습니다.\n");
	}

	public void AccountList() {
		ShowString(menu[3], "계좌목록", menu[3]);
		for(int i = 0; i < actcount; i++) {
			ShowString(account[i].getBank_account_number() + "   " + account[i].getAccount_holder() + "   " + account[i].getInitial_deposit_amount() + "\n");
		}	
	}

	public void Deposits() {
		ShowString(menu[3], "예금", menu[3]);
		
	}

	public void Withdrawal() {
		ShowString(menu[3], "출금", menu[3]);
	}

	public void Termination() {
		ShowString("프로그램 종료");
	}
	
	private int numberkey() {
		int key = 0;
		try {
			key = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			ShowString("숫자를 입력 하세요.");
			
		}
		return key;
	}
	
	private void ShowString(String ss) {
		System.out.print(ss);
	}
	
	private void ShowString(String s1, String s2, String s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
