package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrays {

    public Integer [] reverseOrder(int [] array){
        List<Integer> reverse = new ArrayList<Integer>(array.length);
        for(int i = array.length-1; i>= 0; i--){
            Integer num = array[i];
            reverse.add(i);
        }
        return reverse.toArray(new Integer[0]);
    }

    public int[] reversedOrder(int [] array){
        int [] result = new int[array.length];
        for(int i = array.length-1; i>=0;i--){
            int num = array[i];
            int newIndex = (array.length-i)-1;
            result[newIndex]= num;
        }
        return result;
    }
}
