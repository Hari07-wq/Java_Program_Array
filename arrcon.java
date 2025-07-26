package Problems;
import java.util.*;
public class arrcon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            if(arr[i]==-1)
            break;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0&&arr[i]!=-1)
        System.out.print(arr[i]+" ");
        }
    }
}
