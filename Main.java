
import java.util.Arrays;
public class Main {
	
		public static void countFreq(int list[], int n)
		{
			System.out.print("Dizi : ");
		    boolean repeated[] = new boolean[n];
		     
		    Arrays.fill(repeated, false);
		    for(int i=0; i<n; i++)  
	        {  
	        System.out.print( list[i] + " ");
	        
	        } 
		 System.out.println("\nTekrar sayıları : ");
		    // Traverse through array elements and
		    // count frequencies
		    for (int i = 0; i < n; i++) {
		 
		        // Skip this element if already processed
		        if (repeated[i] == true)
		            continue;
		 
		        // Count frequency
		        int count = 1;
		        for (int j = i + 1; j < n; j++) {
		            if (list[i] == list[j]) {
		            	repeated[j] = true;
		                count++;
		            }
		        }
		        System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
		    }
		}
		 
		// Driver code
		public static void main(String []args)
		{
			int[] list = { 10, 20, 20, 10, 10, 20, 5, 20};
			
			
		    int n = list.length;
		    countFreq(list, n);
		    
		}

}


