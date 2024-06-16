import java.util.*;

public class DailyCodingProblem858{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers (enter non-number to stop): ");    
        
        double median = 0, num = 0;
        ArrayList<Double> res = new ArrayList<Double>();

        while(scan.hasNextInt()){
            num = scan.nextInt();
            res.add(num);
            
            if(res.size() == 1){
                median = res.get(0);
                System.out.println("Median: " + median);
                continue;
            }
            
            Collections.sort(res);
            
            if(res.size() % 2 != 0){
                median = res.get((res.size() / 2));
                System.out.println("Median: " + median);
            }
            else if(res.size() % 2 == 0){
                median = (res.get(res.size() / 2) + res.get((res.size() / 2) - 1)) / 2;
                System.out.println("Median: " + median);
            }
        }
        
        scan.close();

    }
}