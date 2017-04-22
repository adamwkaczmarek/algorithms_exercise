package distinct;

import java.util.Arrays;

/**
 * Created by adam on 21.04.17.
 */
public class Solution {

    public int solution(int A[]){


        if(A.length==0) return 0;
        Arrays.sort(A);


        int distinctCounter=1;
        int lastNonDupNumber=A[0];

        for (int i = 1; i < A.length ; i++) {

            if(A[i]!=lastNonDupNumber){
                distinctCounter++;
                lastNonDupNumber=A[i];
            }
        }

        return distinctCounter;

    }
}
