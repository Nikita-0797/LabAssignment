import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercise30 {
      
       public int getSecondSmallest(int[] arr){
              List<Integer> intList = new ArrayList<Integer>();
              for(int i: arr){
                     intList.add(i);
              }
              Collections.sort(intList);
              return intList.get(1);
       }
       public static void main(String[] args) {
              Exercise30 p = new Exercise30();
              int arr[] = {43,54,65,76,32,76,87,43};
              int i = p.getSecondSmallest(arr);
              System.out.println(i);
       }

}