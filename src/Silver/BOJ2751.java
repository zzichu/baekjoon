package src.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for (int i = 0; i < n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}