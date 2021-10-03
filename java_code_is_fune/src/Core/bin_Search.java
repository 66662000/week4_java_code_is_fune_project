package Core;

class bin_Search{  
	
	
	public static boolean dichresearch(int[]tableau, int b)
	{
		for(int i=0; i<tableau.length; i++)
		{
			if(tableau[i]==b)
			{
				return true;
			}
			
		}
		return false;
	}
// public static void binarySearch(int array[], int f, int l, int key){  
//   int half = (f + l)/2;  
//   while( f <= l){  
//      if ( array[half] < key ){  
//        f = half + 1;     
//      }else if ( array[half] == key ){  
//    	  System.out.println(true);  
//        System.out.println("This number exists at index: " + half);  
//        break;  
//      }else{  
//         l = half - 1;  
//      }  
//      half = (f + l)/2;  
//   }  
//   if ( f > l ){  
//	   System.out.println(false);  
//      System.out.println("This number does not exist");  
//   }  
// }  
 
}  