package src.Bronze;

import java.util.Scanner;

public class BOJ2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int a = sc.nextInt();
		
		int cal = p * a;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			System.out.print(n - cal + " ");
		}
	}
}