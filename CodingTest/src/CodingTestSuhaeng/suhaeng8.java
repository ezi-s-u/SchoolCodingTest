package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sale[][] = new int[3][4];
		int year_sale[] = new int[3];
		int total = 0;
		
		for(int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"³âµµ : ");
			for(int j = 0; j < sale[i].length; j++) {
				sale[i][j] = sc.nextInt();
				year_sale[i] += sale[i][j];
				total += sale[i][j];
			}
		}
	}
}
