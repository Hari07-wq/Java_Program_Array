package array;

public class eg {
    public static void main(String[] args) {
        int arr[]={12 ,18, 98, 72, 42, 6, 3, 9, 10 ,11};
        int t = 72;
        int cg=0,cl=0,cd=0;
        for(int i=0;i<arr.length;i++){
            if(t%arr[i]==0&&arr[i]!=t){
                cd++;
            }
            if(t>arr[i]&&arr[i]!=t)
            cl++;
            else if(arr[i]!=t)
            cg++;
        }
        System.out.println(cl);
        System.out.println(cd);
        System.out.println(cg);
    }
   
}
