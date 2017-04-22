package oddOccurrencesInArray;

/**
 * Created by adam on 14.04.17.
 */
public class Solution {
    public int solution(int[]A){

        int res=A[0];
        for (int i=1; i<A.length;i++) {
            //int lastOne=res;
            res = res ^ A[i];
            //System.out.println(lastOne + " XOR " +A[i] +" = "+res);
        }
        return res;
    }
}
