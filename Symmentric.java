package array;
import java.util.*;
public class Symmentric {
    static boolean issymmentric(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
                if(a[i][j]!=a[j][i])
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 a[i][j]=in.nextInt();
            }
        }
        if(issymmentric(a)){
        System.out.println("No");
        }
        else
        System.out.println("Yes");
        in.close();

    }
}
