import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
      int y = Fact(n);
      System.out.print(y);    }
   public static int Fact(int n){
       if(n==0){
           return 1;
       }
  int sum=0;
  sum=sum+n*Fact(n-1);
  return sum;
   }
