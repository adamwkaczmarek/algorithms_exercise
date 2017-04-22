package frogriverone;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer> storeSet= new HashSet<>();

        if(X==0)return 0;

        for (int i = 0; i <A.length ; i++) {
            if(A[i]<=X && !storeSet.contains(A[i])){
                storeSet.add(A[i]);
            }

            if(storeSet.size()==X){
                return i;
            }

        }
        return -1;
    }
}