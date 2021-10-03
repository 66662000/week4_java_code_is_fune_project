package Core;

public class GCD { 
 
    static int gcd(int r, int t) 
    { 
        if (r == 0) 
            return t; 
        return gcd(t % r, r); 
    } 
  
    
    static int findGCD(int array[], int n) 
    { 
        int result_is = array[0]; 
        for (int i = 1; i < n; i++) 
            result_is = gcd(array[i], result_is); 
  
        return result_is; 
    } 
  

} 
