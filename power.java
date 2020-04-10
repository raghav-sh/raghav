import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int x=scn.nextInt();
   int y=power(n,x);
  System.out.println(y);
     }
  public static int power(int n,int x){
      if(x==0){
          return 1;
      } 
      int d=power(n,x-1);
      int ans=n*d;
      return ans;
  }   
}
