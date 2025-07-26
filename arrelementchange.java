package Problems;
import java.util.*;
public class arrelementchange {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n= arr.length;
        int k=6;
        k=k%n;
        int og[]=new int[n];
        int ind=0;
        for(int i=k;i<n;i++){
            og[ind++]=arr[i];
        }
        for(int i=0;i<k;i++){
            og[ind++]=arr[i];
        }
        System.out.println(Arrays.toString(og));
    }
}
