package CodingTestSuhaeng;

import java.util.Scanner;
import java.util.Arrays;

public class suhaeng1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[5];
		int B[] = new int[5];
		int res[] = new int[10];
		
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
			res[i] = A[i];
		}
		for(int i = 0; i < 5; i++) {
			B[i] = sc.nextInt();
			res[i+5] = B[i];
		}
		
		Arrays.sort(res);
	}

}
