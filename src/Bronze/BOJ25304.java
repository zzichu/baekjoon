package src.Bronze;

import java.util.Scanner;

public class BOJ25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();		
			tot = tot - (price * num);
		}
		if (tot == 0) { 
            System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}