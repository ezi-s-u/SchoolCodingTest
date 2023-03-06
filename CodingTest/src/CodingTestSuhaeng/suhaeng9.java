package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산하고자 하는 첫번째 수 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("계산하고자 하는 두번째 수 입력 : ");
		int n2 = scan.nextInt();
		
		Calculate c1 = new Calculate(n1,n2);
		c1.printResult();
	}

}

class Calculate {
	int a, b;
	Calculate(int a1, int a2) {
		a = a1;
		b = a2;
	}
	void Plus() {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	void Minus() {
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	void Mult() {
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	void Divide() {
		System.out.printf("a / b = %.1f",(double)(a/b));
	}
	void printResult() {
		System.out.println("===두수의 사칙연산 결과===");
		Plus();
		Minus();
		Mult();
		Divide();
	}
}
