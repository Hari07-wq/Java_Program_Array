package array;
import java.util.*;
public class Identity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        getdata(a, n, in);
        display(a);
        if(isIdentity(a)){
        System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
    static void getdata(int [][]a,int n,Scanner in){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
    }
    static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
              System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
        static boolean isIdentity(int [][]a){
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                       if(i==j&&a[i][j]!=1)
                       return false;
                       else if(i!=j&&a[i][j]!=0)
                       return false;
                }
            }
            return true;
            /*for(int i=0;i<a) 
             for()
             if(i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0)
             return false;
             return true;
            */
        }
}
