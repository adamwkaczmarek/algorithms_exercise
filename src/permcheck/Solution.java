package permcheck;

import java.util.Arrays;

/**
 * Created by adam on 17.04.17.
 */
public class Solution
{
    public int solution(int A[]){
        Arrays.sort(A);
        int i= 1;

        if(A.length<0) return 1;

        for (int j = 0; j < A.length ; j++) {
            if(A[j]!=i) return 0;
            i++;
        }

        return 1;
    };
}
