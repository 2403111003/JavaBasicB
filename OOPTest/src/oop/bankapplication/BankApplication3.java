package oop.bankapplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BankApplication3 {
	private static List<Account> actList = new LinkedList<>();
	private static Scanner sc = new Scanner(System.in);
	Account acnt = new Account();
	static int actcount = 0;
	static String[] menu = { "-----------------------------------------------------", 
							 "1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제 | 6.종료 ",
							 "-----------------------------------------------------",
							 "--------" };
	public void Start() {
		int key = 0;
		while(key != 6) {
			Menu();
			key = number();
			switch (key) {
				case 1 -> AccountCreation();
				case 2 -> AccountList();
				case 3 -> Deposits();
				case 4 -> Withdrawal();
				case 5 -> AccountList();
				case 6 -> Termination();
				default -> ShowString(key + "번은 없는 메뉴번호 입니다.\n");
			}
		}
	}
	public void Menu() {
		for (int i = 0; i < menu.length - 1; i++) {
			ShowString(menu[i]+"\n");
			ShowString("선택> ");
		}
	}
	public void AccountCreation() {
		ShowString(menu[3], "게좌생성", menu[3]);
		ShowString("계좌번호: ");
		String ban = sc.nextLine();
		ShowString("계좌주: ");
		String ah = sc.nextLine();
		int InitialDepoait = acnt.getInitialDepoait();
		actList.add(new Account(ban, ah, InitialDepoait));
		ShowString("초기입금액:" + acnt.getInitialDepoait() + "\n");
		ShowString("결과: 계좌가 생성되었습니다.\n");
	}

	public void AccountList() {
		ShowString(menu[3], "계좌목록", menu[3]);
		for(Account ac : actList) {
			ac.getBank_account_number();
			ac.getAccount_holder();
			ac.getInitial_deposit_amount();
		}	
	}

	public static void Deposits() {
		ShowString(menu[3], "예금", menu[3]);
		ShowString("계좌번호: ");
		String ban = sc.nextLine();
		Account ac = findAccount(ban);
		
	}

	private static Account findAccount(String ban) {
		for(int i = 0; i < actList.size() ; i++) {
			if(ban.equals(actList)) {
				
			}
		}
		return null;
	}
	public void Withdrawal() {
		ShowString(menu[3], "출금", menu[3]);
	}

	public void Termination() {
		ShowString("프로그램 종료");
	}
	
	private int number() {
		int key = 0;
		try {
			key = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			ShowString("숫자를 입력 하세요.\n");
			
		}
		return key;
	}
	
	private static void ShowString(String ss) {
		System.out.print(ss);
	}
	
	private static void ShowString(String s1, String s2, String s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
