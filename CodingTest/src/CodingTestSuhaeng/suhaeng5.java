package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[3][2];
		double total = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print((i+1)+"학년 "+(j+1)+"학기 점수 입력 : ");
				score[i][j] = sc.nextInt();
				total += score[i][j];
			}
		}
		System.out.printf("3년간 의 평균 : %.2f", total/6);
	}

}
