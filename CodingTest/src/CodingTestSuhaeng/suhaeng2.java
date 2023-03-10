package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수 입력 : ");
		int per = sc.nextInt();
		System.out.println("");
		
		int score[][] = new int[per][3];
		int max_sco[] = new int[per];
		for(int i = 0; i < per; i++) {
			for(int j = 0; j < score[i].length; j++) {
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
		
		System.out.println("=======================================");
		System.out.println("순번   점수1    점수2    점수3   최고점   평점");
		for(int i = 0; i < per; i++) {
			System.out.print(" "+(i+1)+"   ");
			System.out.printf("%4d    %4d    %4d    %3d",score[i][0],score[i][1],score[i][2],max_sco[i]);
			switch(max_sco[i]/10) {
			case 9: case 10: System.out.println("     "+5); break;
			case 8: System.out.println("    "+4); break;
			case 7: System.out.println("    "+3); break;
			case 6: System.out.println("    "+2); break;
			default : System.out.println("    "+1);
			}
		}
		System.out.println("=======================================");
	}

}
