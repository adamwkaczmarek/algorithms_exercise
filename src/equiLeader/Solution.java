package equiLeader;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Adam on 2017-04-24.
 */
public class Solution {
    public int solution(int[] A) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            try {
                if (list.getLast() != A[i]) {
                    list.removeLast();
                } else
                    list.add(A[i]);
            } catch (NoSuchElementException e) {
                list.add(A[i]);
            }
        }

        if(list.size()==0) return 0;

        int leader = list.getLast();
        int totalLeaderCount=0;
        System.out.println("Leader is : " + leader);

        //count occurent of leader

        for (Integer integer : A) {
            if(integer==leader)totalLeaderCount++;
        }
        if(totalLeaderCount<=A.length/2) return 0;

        int leftLeaderCount=0;
       // int leftLenght=0;
        int rightLeaderCount=0;
        int rightLenght=0;
        int result=0;

        for (int i = 0; i < A.length; i++) {
              if(A[i]==leader)leftLeaderCount++;
              rightLeaderCount=totalLeaderCount-leftLeaderCount;
              rightLenght=A.length-i-1;

            if(leftLeaderCount>(i+1)/2 && rightLeaderCount>(rightLenght/2)){
                System.out.println(i);
                result++;
            }

        }

        return result;
    }
}
