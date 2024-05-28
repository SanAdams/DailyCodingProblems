public class DailyCodingProblem849{
    public static void main(String[] args){
        int i = 0, j = 0;
        int answer = 0;
        int TESTS = 10000;
        
        for(i = 0; i < TESTS; i++){
            answer = i;
            for(j = 0; j < TESTS; j++){
                if(answer % 2 == 0){
                    answer = answer/2;  
                }
                else{
                    answer = (answer * 3) + 1;
                }
                if(answer == 1){
                    System.out.println(i + " Passes (within 10000 calculations)"); 
                    break; 
                }
            }       
        }
    }
}
