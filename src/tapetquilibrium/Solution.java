package tapetquilibrium;

import java.util.Arrays;

/**
 * Created by adam on 15.04.17.
 */
public class Solution {

    public int solution(int[]A){
        int sum=Arrays.stream(A).sum()-A[0];
        int result=Math.abs(A[0]-(sum));
        int sumTemp=A[0];

        //System.out.println("P["+0+"] ->|"+sumTemp+"-"+sum+"|="+result);

        for (int i=1;i<A.length-1;i++) {
            sum=sum-A[i];
            sumTemp=sumTemp+A[i];

            int difference=Math.abs(sumTemp-(sum));
            //System.out.println("P["+i+"] ->|"+sumTemp+"-"+sum+"|="+difference );

            if(result>difference){
                result=difference;
            }
        }
        return result;
    }
}
