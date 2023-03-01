package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc[] = new Account[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("================================");
			System.out.print("계좌번호 입력 : ");
			acc[i] = new Account(sc.next());
			acc[i].balancePrint();
			System.out.println();
			
			System.out.print("입금할 금액 : ");
			acc[i].deposi(sc.nextInt());
			acc[i].balancePrint();
			System.out.println();
			
			System.out.print("출금할 금액 : ");
			acc[i].withdraw(sc.nextInt());
			acc[i].balancePrint();
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("계좌번호            잔액");
		System.out.println("================================");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%-17s %-14d",acc[i].acc_num,acc[i].amo);
			System.out.println();
		}
		System.out.println("================================");
	}

}

class Account {
	String acc_num;
	int amo = 0;
	Account(String a){
		acc_num = a;
	}
	void deposi(int amo) {
		this.amo += amo;
	}
	void withdraw(int amo) {
		if(this.amo>amo) {
			this.amo -= amo;
		} else {
			System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다");
		}
	}
	void balancePrint() {
		System.out.println("계좌번호 "+acc_num+"의 현재 잔액 : "+amo);
	}
}