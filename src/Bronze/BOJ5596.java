package src.Bronze;

import java.util.Scanner;

public class BOJ5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, txt = 0;
		for (int i = 0; i < 4; i++) {
			txt = sc.nextInt();
			a += txt;
		}
		for (int i = 0; i < 4; i++) {
			txt = sc.nextInt();
			b += txt;
		}
		System.out.println(Math.max(a, b));
	}
}