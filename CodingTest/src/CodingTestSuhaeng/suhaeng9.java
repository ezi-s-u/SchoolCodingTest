package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����ϰ��� �ϴ� ù��° �� �Է� : ");
		int n1 = scan.nextInt();
		System.out.print("����ϰ��� �ϴ� �ι�° �� �Է� : ");
		int n2 = scan.nextInt();
		
		Calculate c1 = new Calculate(n1,n2);
		c1.printResult();
	}

}
