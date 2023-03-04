package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sale[][] = new int[3][4];
		int year_sale[] = new int[3];
		int total = 0;
		
		for(int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"년도 : ");
			for(int j = 0; j < sale[i].length; j++) {
				sale[i][j] = sc.nextInt();
				year_sale[i] += sale[i][j];
			}
		}
		System.out.println("             1사분기   2사분기   3사분기   4사분기  연간판매량  누적판매량");
		for(int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"년도 : ");
			System.out.printf("%7d %8d %7d %7d %8d",sale[i][0],sale[i][1],sale[i][2],sale[i][3],year_sale[i]);
			for(int j = 0; j < sale[i].length; j++) {
				total += sale[i][j];
			}
			System.out.printf(" %8d\n",total);
		}
	}
}
