package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sale[][] = new int[3][4];
		int year_sale[] = new int[3];
		int total = 0;
		
		for(int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"�⵵ : ");
			for(int j = 0; j < sale[i].length; j++) {
				sale[i][j] = sc.nextInt();
				year_sale[i] += sale[i][j];
			}
		}
		System.out.println("             1��б�   2��б�   3��б�   4��б�  �����Ǹŷ�  �����Ǹŷ�");
		for(int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"�⵵ : ");
			System.out.printf("%7d %8d %7d %7d %8d",sale[i][0],sale[i][1],sale[i][2],sale[i][3],year_sale[i]);
			for(int j = 0; j < sale[i].length; j++) {
				total += sale[i][j];
			}
			System.out.printf(" %8d\n",total);
		}
	}
}
