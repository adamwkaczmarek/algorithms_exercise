package passingcars;

/**
 * Created by adam on 20.04.17.
 */
public class Solution {
    public int solution(int []A){
        int count0=0;
        int result=0;

        for (int i = 0; i < A.length; i++) {


            if(A[i]==0)count0++;

            if(A[i]==1 && count0 > 0){
                result=result+count0;
            }

            if(result>1000000000) return -1;


        }

        return result;
    }
}
