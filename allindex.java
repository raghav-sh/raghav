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
        int[] ans=allindex(a,0,x,0);
        if(ans.length==0){
            return ;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
       
    }
    public static int[] allindex(int[] a,int idx,int x,int count){
        if(idx==a.length){
        int[] b=new int[count];
        return b;
        }
   if(a[idx]==x){
       count++;
   }
   int[] r=allindex(a,idx+1,x,count);
       if(a[idx]==x){
           r[count-1]=idx;
       }
       return r;

       }
   }
