package demo;

import java.util.Arrays;

/**
 * Created by adam on 20.04.17.
 */
public class Solution {

    public int solution(int[]A){

        long sum=0;
        long leftsum=0;

        for (int i = 0; i <A.length ; i++) {
            sum=sum+A[i];
        }

        for (int i = 0; i <A.length ; i++) {

            sum=sum-A[i];

            if(sum==leftsum)return i;

            leftsum=leftsum+A[i];

        }


       return -1;
    }
}
