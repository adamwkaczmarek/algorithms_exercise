package maxproductoftree;

import java.util.Arrays;

/**
 * Created by adam on 21.04.17.
 */
public class Solution {

    public int solution(int[]A){
        Arrays.sort(A);
        int leftSide=A[0]*A[1]*A[A.length-1];
        int rightSide=A[A.length-1]*A[A.length-2]*A[A.length-3];
        return leftSide>rightSide ? leftSide : rightSide;
    }

}
