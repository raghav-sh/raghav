import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int x=scn.nextInt();
     int d=firstindex(a,0,x);
     System.out.println(d);  
    }
    public static int  firstindex(int[] a,int idx,int x){
        if(idx==a.length-1){
            return 0 ;
        }
   if(a[idx]==x){
       return idx;
   }else{
      int d = firstindex(a,idx+1,x);
   return d;
     
    }
}
}
