package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		String str = sc.next();
		char ch[] = new char[str.length()];
				
		for(int i = ch.length-1, j = 0; i >= 0; i--, j++) {
			ch[j]= str.charAt(i);
		}
		
		System.out.print("��ȯ�� ���� : "+ch.toString());
	}

}
