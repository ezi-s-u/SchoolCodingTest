package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		double total = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"¹øÂ° ¼ö : ");
			num[i] = sc.nextInt();
			total += num[i];
		}
		System.out.printf("Æò±Õ : %.2f",total/5);
	}

}
