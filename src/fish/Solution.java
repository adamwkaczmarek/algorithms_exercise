package fish;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Adam on 2017-04-22.
 */
public class Solution {

    public int solution(int A[],int B[]){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);

        for (int i = 1; i <B.length ; i++) {
            try{

                Integer last = list.getLast();
                if(B[i]==0 && B[last]==1){

                    if(A[i]>A[last]){

                        list.removeLast();
                        i=i-1;
                    }
                continue;
            }
            }catch (NoSuchElementException e){

            }
            list.add(i);
        }

        return list.size();

    }
}
