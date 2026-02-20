package src.Bronze;

import java.util.Scanner;

public class BOJ3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int r2 = 0;
		int s = sc.nextInt();
		if (r1 >= s) {
			r2 = s - (r1 - s);
			System.out.println(r2);
		} else if (r1 < s) {
			r2 = s + (s - r1);
			System.out.println(r2);
		}
	}
}