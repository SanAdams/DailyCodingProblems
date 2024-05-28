import java.util.*;

/* Solution to Daily Coding Problem 843 */
public class DailyCodingProblem843{
    public static void main(String[] args){
        ArrayList<Integer> res = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");
        String input = scan.nextLine();
        
        System.out.print("Desired Substring: ");
        String substring = scan.nextLine();
        System.out.println();

        scan.close();

        int subLen = substring.length(), strLen = input.length();
        for(int i = 0; i < strLen - subLen; i++){
            if(input.charAt(i) == substring.charAt(i)){
                if(input.substring(i, i + subLen).equals(substring))
                    res.add(i);
            }
        }
        
        for(int el : res)
            System.out.print(el);
    }
}