package Core;

public class lcm_array {
    
    public static long lcm(int[] nbr_array)
    {
        long lcm_elements = 1;
        int div = 2;
         
        while (true) {
            int counter = 0;
            boolean is_divisible = false;
             
            for (int i = 0; i < nbr_array.length; i++) {
 
                
                if (nbr_array[i] == 0) {
                    return 0;
                }
                else if (nbr_array[i] < 0) {
                    nbr_array[i] = nbr_array[i] * (-1);
                }
                if (nbr_array[i] == 1) {
                    counter++;
                }
 
               
                if (nbr_array[i] % div == 0) {
                    is_divisible = true;
                    nbr_array[i] = nbr_array[i] / div;
                }
            }
 
            
            if (is_divisible) {
                lcm_elements = lcm_elements * div;
            }
            else {
                div++;
            }
 
          
            if (counter == nbr_array.length) {
                return lcm_elements;
            }
        }
    }
     

}
 
