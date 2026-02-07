package src.Bronze;

import java.util.Scanner;

public class BOJ10156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = (k * n) - m;

        if (p > 0) {
            System.out.println(p);
        } else {
            p = 0;
            System.out.println(p);
        }
        
    }
}