package permmissingelem;


import java.util.Arrays;

/**
 * Created by adam on 14.04.17.
 */
public class Solution {

    public int solution(int[] A){

        if(A.length==0)return 1;
        if(A.length==1 && A[0]==1)return 2;

        Arrays.sort(A);

        if(A[0]!=1)
            return 1;


        for (int i =0;i<A.length;i++) {
            int nextIdx=i+1;

            if(nextIdx==A.length){
                return A[i]+1;
            }

            if(A[i+1]-A[i]>1){
                return A[i]+1;
            }
        }

        return 0;
    }

}

