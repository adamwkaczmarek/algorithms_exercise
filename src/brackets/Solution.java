package brackets;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by adam on 22.04.17.
 */
public class Solution {

    public int solution(String S){

        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0, n = S.length(); i < n; i++) {
            char c = S.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                list.add(String.valueOf(c));
            }else
            {
                String last="";
                try {
                    last = list.getLast();
                }catch(NoSuchElementException e){
                    return 0;
                }

                if (c =='}'){
                    if(last.equals("{")) {
                        list.removeLast();
                        continue;
                    }
                }

                if(c==']'){
                    if(last.equals("[")) {
                        list.removeLast();
                        continue;
                    }
                }
                if(c==')'){
                    if(last.equals("(")) {
                        list.removeLast();
                        continue;
                    }
                }
                return 0;
            }
        }

        return list.isEmpty()? 1:0;
    }
}
