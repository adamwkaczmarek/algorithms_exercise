package binarygap;

import static java.lang.System.in;

/**
 * Created by adam on 13.04.17.
 */
public class Solution {
    public int solution(int n){

        String bin="";
        int result=0;

        while(n>=1){
            String value=String.valueOf(n%2);
            if(bin.isEmpty()){
                bin=String.valueOf(value);
            }else{
                bin=bin.concat(value);
            }

            n=n/2;
        }
        int indexStart=bin.indexOf("1");
        int indexStop=bin.lastIndexOf("1");

        bin= bin.substring(indexStart,indexStop+1);

        String gapTab[]=bin.split("1");

        for(String gap : gapTab){
            result= result<gap.length() ?gap.length():result;
        }
        return result;

    }
}
