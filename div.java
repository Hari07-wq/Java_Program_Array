package array;
import java.util.*;
public class div {
    public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();
    int count=0;
    boolean a = false;
    for(int i=0;i<n;i++){
         count=0;
        for(int j=0;j<n;j++){
            if(arr[j]%arr[i]==0){
                count++;
            } 
            if(count==arr.length){
            System.out.print(arr[i]);
            a=true;
            }
        }
    }
    if(!a)
    System.out.println("-1");
in.close();
 }
}
