import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
     System.out.println(printmax(a,0));  
    }
    public static int  printmax(int[] a,int idx){
        if(idx==a.length-1){
            return a[idx];
        }
     int d =printmax(a,idx+1);
     int ans=Math.max(d,a[idx]);
     return ans;
     
    }
}
