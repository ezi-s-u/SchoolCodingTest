package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[3][2];
		double total = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print((i+1)+"�г� "+(j+1)+"�б� ���� �Է� : ");
				score[i][j] = sc.nextInt();
				total += score[i][j];
			}
		}
		System.out.printf("3�Ⱓ �� ��� : %.2f",total/3);
	}

}
