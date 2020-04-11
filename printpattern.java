import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       printit(n);
    }
  public static void printit(int n ){
      if(n==0){
          return ;
      }
     System.out.print(n+" ");
     printit(n-1);
     System.out.print(n+" ");
     printit(n-1);
     System.out.print(n+" ");
          }

      }
