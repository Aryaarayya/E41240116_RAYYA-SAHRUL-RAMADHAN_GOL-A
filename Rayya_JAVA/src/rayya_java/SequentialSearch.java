package rayya_java;
public class SequentialSearch {
    public static void main(String[] args) {
        int [] exampleVariableOne = {2,9,6,7,4,5,3,0,1};
            int target = 4;
           sequentialSearch(exampleVariableOne, target);
    }
    public static void sequentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        for (int i = 0; i<parameterOne.length; i++){
            if (parameterOne[i] == parameterTwo){
                index =i;
                break;  
            }
        }
        if (index == -1){
            System.out.println("Your Target Integer does not exist in the Array");
        } else {
            System.out.println("Your Target Integer is in index " + index + " of the Array");
        }
    }
}
