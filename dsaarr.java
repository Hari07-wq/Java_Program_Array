package array;
import java.util.*;
public class dsaarr {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};

    int res[]=Arrays.stream(arr).distinct().toArray();
    int fil[]=Arrays.stream(arr).filter(x -> x%2==0).toArray();
    //System.out.println(Arrays.toString(res));
    System.out.println(Arrays.toString(fil));
   } 
}
