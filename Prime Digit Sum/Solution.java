import java.util.* ;
import java.io.*; 

public class Solution {

    static int primeDigitSum(int l, int r){
         // Store prime upto 200.
        int prime[] = new int[200];
        for(int i=0;i<200;i++){
            prime[i]=1;
        }

        // 0 and 1 are coprime numbers.
        prime[0] = prime[1] = 0;

        // Sieve of Eratosthenes to calculate prime numbers.
        for(int i = 2; i < 200; i++){
            for(int j = i*i; j < 200; j += i){
                if(prime[j]!=0){
                    prime[j] = 0;
                }
            }
        }

        // Variable to store the result.
        int res = 0;
        for(int i = l; i <= r; i++){
            String s = Integer.toString(i);
            // Storing the sum of digits of 'i'.
            int sum = 0;
            for(int j = 0; j < s.length(); j++)
                sum += (s.charAt(j)-'0');
            if(prime[sum]!=0){
                res++;
            }
        }
        return res;
        
    }

}
