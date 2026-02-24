package src.Bronze;

import java.util.Scanner;

public class BOJ2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == b & b == c & c == a) {
			System.out.println(10000 + a * 1000);
		} else if (a == b || b == c) {
			System.out.println(1000 + b * 100);
		} else if (c == a) {
			System.out.println(1000 + c * 100);
		} else {
			System.out.println(Math.max(Math.max(a, b), c) * 100);
		}
	}
}