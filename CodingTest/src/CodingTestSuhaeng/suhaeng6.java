package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println("================================");
			System.out.print("계좌번호 입력 : ");
			Account acc = new Account(sc.next());
		}
	}

}

class Account {
	String acc_num;
	int amo = 0;
	Account(String a){
		acc_num = a;
	}
	void deposi(int amo) {
		System.out.print("입금할 금액 : ");
		this.amo += amo;
	}
}