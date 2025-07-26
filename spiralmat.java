package array;
import java.util.*;
public class spiralmat {
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
            System.out.println();
        }
    }
    static void spiral(int [][]a){
        int top=0;
        int bottom = a.length-1;
        int left=0;
        int right=a[0].length-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
                
            }top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
                
            }right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(a[bottom][i]+" ");
                    
                }bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(a[i][left]+" ");
                    
                }left++;
            }

        }
    }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int [][]a = new int[r][c];
        getdata(a,r,c,in);
        System.out.println("-------------------------------------");
        display(a);
        System.out.println("-------------------------------------");
        spiral(a);
  }  
}


