package exams.leehom59.task1;

/**
 * Created by Adam on 2017-04-23.
 */
public class Solution {

    public int solution(int A,int B){

        int counter=0;
        if(A<0) A=0;

        for (int i = A; i <=B ; i++) {
            if(isPerfectSquare(i)){
                System.out.println(i);
                counter++;
            }
        }

        return counter;
    };

    boolean isPerfectSquare(long input)
    {
        long closestRoot = (long) Math.sqrt(input);
        return input == closestRoot * closestRoot;
    }
}
