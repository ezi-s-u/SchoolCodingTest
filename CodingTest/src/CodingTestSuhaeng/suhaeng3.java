package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		buchaeggol b = new buchaeggol();
		System.out.print("반지름 입력 : ");
		double rad = sc.nextDouble();
		
		System.out.println("반지름 "+rad+"인 부채꼴의 면적 : "+b.area(rad)+" , 둘레 : "+b.circum(rad));
	}

}

class buchaeggol {
	double area(double rad) {
		return (rad*rad*3.14)/4;
	}
	double circum(double rad) {
		return (rad*2*3.14)/4;
	}
}