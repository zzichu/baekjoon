package src.Programmers;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
                continue;
            else
                list.add(arr[i-1]);
        }
        
        list.add(arr[arr.length-1]);
        
        answer = new int[list.size()];

        for(int i=0;i<answer.length; i++){
            answer[i] = list.get(i);
        }
       
        
        return answer;
    }
}