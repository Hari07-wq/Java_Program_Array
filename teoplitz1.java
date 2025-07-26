package array;
import java.util.*;
public class teoplitz1 {
    static void getdata(int [][]a,int r, int c ,Scanner in){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
    }
    static void display(int [][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
       static  boolean isToeplitz(int a[][]){
            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a[0].length-1;j++){
                    if(a[i][j]!=a[i+1][j+1])
                    return false;
                }
            }
            return true;
        }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int [][]a = new int[r][c];
        getdata(a,r,c,in);
        System.out.println("The matrix is");
        display(a);
        if(isToeplitz(a))
        System.out.println("Toeplitz\n");
        else
        System.out.println("Non Toeplitz\n");
    }
   

}
