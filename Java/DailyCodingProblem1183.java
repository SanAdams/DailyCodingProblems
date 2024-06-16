import java.util.Scanner;
import java.util.HashMap;
public class DailyCodingProblem1183 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Character> strobogrammaticMappings = new HashMap<Character, Character>();

        System.out.print("Enter a number to determine if it's strobogrammatic: ");
        String stringRep = String.valueOf(scan.nextInt());
        
        //Mapping strobogrammatic pairs
        strobogrammaticMappings.put('1', '1');
        strobogrammaticMappings.put('6', '9');
        strobogrammaticMappings.put('8', '8');
        strobogrammaticMappings.put('9', '6');
        strobogrammaticMappings.put('0', '0');

        System.out.print(isStrobogrammatic(stringRep, strobogrammaticMappings));
    }

    //Method that takes in string input and hashmap and returns t or f based on if the string and 
    //thus the integer is strobogrammatic or not
    public static boolean isStrobogrammatic(String input, HashMap<Character, Character> mappings){
        boolean res = false;
        int len = input.length(),isEven = len % 2; 
        
        switch (isEven){
            case 0:
                //In the case of even numbers it's impossible for a number to be strobogrammatic if it contains a number not in the mapping
                if(input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("7")){
                    res = false;
                    return res;
                }

                //Walk along the left side of the number checking for strobogrammatic pairs
                for(int i = len - 1; i > len/2; i--){
                    if(input.charAt(Math.abs(i - (len - 1))) != mappings.get(input.charAt(i))){
                        res = false;
                        return res;
                    }
                }
                res = true;
                break;

            case 1:
                
                //Walk along the right side of the number checking for valid strobogrammatic pairs
                for(int i = len - 1; i > len/2; i--){
                    if(input.charAt(Math.abs(i - (len - 1))) != mappings.get(input.charAt(i))){
                        res = false;
                        return res;  
                    }
                }
                res = true;
                break;
        }
        return res;
    }
}
