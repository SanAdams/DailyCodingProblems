/* Solution to Daily Coding Problem 845 */
import java.util.*;
import java.lang.*;

public class DailyCodingProblem845{
    public static void main(String[] args){

        /* Ask for user input */
        Scanner myscan = new Scanner(System.in);
        System.out.print("Length: ");
        int n = myscan.nextInt();
        int list[] = new int[n]; 
        System.out.print("Pivot by: ");
        int k = myscan.nextInt(); 
        
        myscan.close();

        /* Randomly fill array */
        Random rand = new Random();
        int len = list.length;
        for (int i = 0; i < len; i++)
            list[i] = rand.nextInt(100); 
        
        System.out.print("Before pivot: ");
        System.out.println(Arrays.toString(list));
        
        /* If the number of pivot elements is more than/equal to the length of array
           pivoting does not happen, same if it is 0
         */
        if(k >= n || k == 0){
            System.out.println(Arrays.toString(list));
            System.exit(0);
        }
        
        /* Iterate for every element in the pivot section */
        for(int i = 0; i < k; i++){

            /* Iterate from the pivot element's current position to its correct position after pivot */
            for(int j = k - i - 1; j < n - (i + 1); j++){

                /* Swap */
                int tmp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = tmp;   
            }
        }    
        
        System.out.print("After pivot: ");
        System.out.println(Arrays.toString(list));
    }
}
