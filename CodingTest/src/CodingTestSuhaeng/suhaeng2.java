package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수 입력 : ");
		int per = sc.nextInt();
		System.out.println("");
		
		int score[][] = new int[per][4];
		int max_sco[] = new int[per];
		for(int i = 0; i < per; i++) {
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print("점수 "+(j+1)+" 입력 : ");
				score[i][j] = sc.nextInt();
				while(score[i][j]>100 || score[i][j]<0) {
					System.out.print("다시 입력하세요==> 점수 "+(j+1)+" 입력 : ");
					score[i][j] = sc.nextInt();
				}
				if(score[i][j] > max_sco[i]) {
					max_sco[i] = score[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("======================================");
		System.out.println("순번   점수1    점수2    점수3   최고점   평점");
		for(int i = 0; i < per; i++) {
			System.out.print((i+1)+"   ");
			System.out.printf("%5d    %4d    %4d    %3d",score[i][0],score[i][1],score[i][2],max_sco[i]);
			System.out.println("");
		}
		System.out.println("======================================");
	}

}
