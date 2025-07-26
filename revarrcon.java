package array;
import java.util.*;
public class revarrcon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();

        int k=in.nextInt();
         ArrayList<Integer> list =new ArrayList<>();
         for(int i=0;i<n;i+=k){
            ArrayList<Integer> rev =new ArrayList<>();
            for(int j=i;j<i+k&&j<arr.length;j++){
                rev.add(arr[j]);
               // System.out.println(rev);
            }
            Collections.reverse(rev);
            list.addAll(rev);
         }
        
    System.out.println(list);   
    }
}
