package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int max = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1)+"번째 수 : ");
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 수 : "+max);

	}

}
