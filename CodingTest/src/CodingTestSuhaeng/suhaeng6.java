package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println("================================");
			System.out.print("���¹�ȣ �Է� : ");
			Account acc = new Account(sc.next());
			acc.balancePrint();
			System.out.println();
			
			System.out.print("�Ա��� �ݾ� : ");
			acc.deposi(sc.nextInt());
			acc.balancePrint();
			System.out.println();
			
			System.out.print("����� �ݾ� : ");
			acc.withdraw(sc.nextInt());
			acc.balancePrint();
			System.out.println();
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
		this.amo += amo;
	}
	void withdraw(int amo) {
		if(this.amo>amo) {
			this.amo -= amo;
		} else {
			System.out.println("����Ϸ��� ������ �ܾ��� �����Ͽ� ����� �Ұ����մϴ�");
		}
	}
	void balancePrint() {
		System.out.println("���¹�ȣ "+acc_num+"�� ���� �ܾ� : "+amo);
	}
}