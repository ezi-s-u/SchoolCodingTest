package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �Է� : ");
		int per = sc.nextInt();
		System.out.println("");
		
		int score[][] = new int[per][3];
		
		for(int i = 0; i < per; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print("���� "+(j+1)+" �Է� : ");
				score[i][j] = sc.nextInt();
				while(score[i][j]>100 || score[i][j]<0) {
					System.out.print("�ٽ� �Է��ϼ���==> ���� "+(j+1)+" �Է� : ");
					score[i][j] = sc.nextInt();
				}
			}
			System.out.println("");
		}
	}

}
