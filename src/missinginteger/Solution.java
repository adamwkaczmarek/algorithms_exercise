package missinginteger;

import java.util.Arrays;

/**
 * Created by adam on 15.04.17.
 */
public class Solution {

    public int solution(int A[]) {

        Arrays.sort(A);
        int[] array = Arrays.stream(A).filter(i -> i > 0).distinct().toArray();
        int nextInt = 1;

        if(array.length==0|| array[0]>1 ){
            return 1;
        }else
        {

            for (int i = 0; i < array.length; i++) {

                        if (array[i] != nextInt) return nextInt;
                        nextInt++;

            }
        }


        return nextInt;
    }


}

