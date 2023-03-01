package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc[] = new Account[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("================================");
			System.out.print("���¹�ȣ �Է� : ");
			acc[i] = new Account(sc.next());
			acc[i].balancePrint();
			System.out.println();
			
			System.out.print("�Ա��� �ݾ� : ");
			acc[i].deposi(sc.nextInt());
			acc[i].balancePrint();
			System.out.println();
			
			System.out.print("����� �ݾ� : ");
			acc[i].withdraw(sc.nextInt());
			acc[i].balancePrint();
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("���¹�ȣ            �ܾ�");
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
			System.out.println("����Ϸ��� ������ �ܾ��� �����Ͽ� ����� �Ұ����մϴ�");
		}
	}
	void balancePrint() {
		System.out.println("���¹�ȣ "+acc_num+"�� ���� �ܾ� : "+amo);
	}
}