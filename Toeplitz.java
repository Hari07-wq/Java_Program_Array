package array;
import java.util.*;
public class Toeplitz {
    static boolean isteoplitz(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]!=a[i+1][j+1])
                {
                return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        if(isteoplitz(a)){
            System.out.println("yes");
        }
        else
        System.out.println("No");
        in.close();
    }
}
