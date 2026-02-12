package src.Bronze;

import java.util.Scanner;

public class BOJ5554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
	
		int tot = a + b + c + d;
		int m = tot/60;
		int s = tot%60;
		
		System.out.println(m + "\n" + s);
	}
}