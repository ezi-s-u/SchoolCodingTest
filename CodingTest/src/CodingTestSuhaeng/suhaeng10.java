package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		String str = sc.nextLine();
		char ch[] = new char[str.length()];
				
		for(int i = ch.length-1, j = 0; i >= 0; i--, j++) {
			ch[j]= str.charAt(i);
		}
		
		System.out.print("변환된 문자 : ");
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
