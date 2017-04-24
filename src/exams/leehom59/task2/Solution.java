package exams.leehom59.task2;

import java.util.Arrays;

/**
 * Created by Adam on 2017-04-23.
 */
public class Solution {

    public int solution(int A[]){
       int [] nonSortedArray=A.clone();
        Arrays.sort(A);
        int diferencesCounter=0;

        for (int i = 0; i <A.length ; i++) {
            if(A[i]!=nonSortedArray[i]){
                if(diferencesCounter>=2) return -1;
                diferencesCounter++;
            }
        }

        return 1;
    }
}
