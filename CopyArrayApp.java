import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{ //class defined
  public static void main(String[] args) { //printing line - input like a list
    int nVals = args.length; //input numbers (needs multiple)
    int[] myVals = new int[nVals]; //actual list of numbers
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]); //printing all numbers before input (counting)
      //System.out.println(item); //Print
      myVals[i] = item; //task 1.1
    }
    //filter values - task 1.2:
    ArrayList<Integer> x = new ArrayList<>(); //empty list
    for (int i = 0; i < myVals.length; i++){
        int num = myVals[i];
        int val = i;
        x.add(num); //dynamic >:3
    }
    System.out.println(x);
    
    
   for (int i = 0; i < x.size; i++){
        //int currentVal = myVals[i];
        for (int j = 0; j < x.size; j++){ //to compare all values to check for dupes
            if (j != i){ //if equal it will remove the wrong item :c
            int a = x[i];
            int b = x[j];
                if (a == b){//if the items are the same 
                    x = ArrayUtils.removeElement(myVals, j); //function I found hehe
                }
                else{
                    continue;
                }
            }
            else{
                continue;
            }
        }
    }
    System.out.println("original values: " + Arrays.toString(myVals)); 
  }
}