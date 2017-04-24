package dominator;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by adam on 24.04.17.
 */
public class Solution {
    public int solution(int[] A){

        if(A.length==0)return -1;

        LinkedList<Integer> list = new LinkedList<>();
        int result=-1;
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

        if(list.size()==0) return -1;

        int leader = list.getLast();
        int leaderTotalCount=0;


        for (int i = 0; i <A.length ; i++) {
            if(A[i]==leader){
                leaderTotalCount++;
                result=i;
            }
        }

        return A.length/2<leaderTotalCount?result:-1;
    }
}
