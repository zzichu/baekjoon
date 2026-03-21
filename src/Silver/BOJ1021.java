package src.Silver;

import java.io.*;
import java.util.*;

public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int M = Integer.parseInt(first[1]);

        Deque<Integer> deque = new LinkedList<>();
        
        for(int i=1; i <= N; i++) deque.add(i);
        int count = 0;
        String[] targets = br.readLine().split(" ");
        
        for(int i=0; i < M; i++) {
            int target = Integer.parseInt(targets[i]);
            int size = deque.size();
            int idx = -1;
            
            ArrayList<Integer> temp = new ArrayList<>(deque);
            for(int j=0; j < size; j++) {
                if(temp.get(j) == target) {
                    idx = j;
                    break;
                }
            }
            
            int left = idx;
            int right = size - idx;
            if(left <= right) {
                for(int j=0; j < left; j++) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                for(int j=0; j < right; j++) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
