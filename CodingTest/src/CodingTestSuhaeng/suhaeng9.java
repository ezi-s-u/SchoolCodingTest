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
		System.out.println("===�μ��� ��Ģ���� ���===");
		Plus();
		Minus();
		Mult();
		Divide();
	}
}
