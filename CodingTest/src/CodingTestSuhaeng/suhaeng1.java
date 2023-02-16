package CodingTestSuhaeng;

import java.util.Scanner;
import java.util.Arrays;

public class suhaeng1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[5];
		int B[] = new int[5];
		int res[] = new int[10];
		
		System.out.print("첫번째 배열의 데이타 : ");
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
			res[i] = A[i];
		}
		
		System.out.print("두번째 배열의 데이타 : ");
		for(int i = 0; i < 5; i++) {
			B[i] = sc.nextInt();
			res[i+5] = B[i];
		}
		
		Arrays.sort(res);
		
		System.out.print("병합된 배열의 데이타 : ");
		for(int i = 0; i < res.length; i++) {
			if(i > 0 && res[i-1]!=res[i]) {
				System.out.print(res[i]+" ");
			} else if(i == 0) {
				System.out.print(res[i]+" ");
			}
		}
	}

}
