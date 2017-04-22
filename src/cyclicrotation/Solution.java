package cyclicrotation;

/**
 * Created by adam on 13.04.17.
 */
public class Solution {
    public int[] solution(int[] A,int K) {

        if(A.length==0 || A.length==1 ){ return A;}

        int resultTab[] = new int[A.length];

        for (int i=0; i < A.length;i++) {
            if (i + K < A.length) {
                resultTab[i + K] = A[i];
            } else {
                int multiplier=(i+K)/A.length;
                resultTab[Math.abs((i + K) - multiplier*A.length)] = A[i];
            }
        }
        return resultTab;
    }
}
