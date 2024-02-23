import java.util.*;
public class Solution {
    public static boolean isGoodNumber(int n) {
        if(n==1) return true;
        
        Stack<Integer> s=new Stack<>();
        
        while(n!=1){
            if(!s.contains(n)){
                s.push(n);
            }else{
                return false;
            }
            n=func(n);
        }
        return true;
    }
    private static int func(int n){
        int num=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            num+=Math.pow(rem,2);
        }
        return num;
    }
}