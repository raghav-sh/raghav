import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int t1=scn.nextInt();
       int t2=scn.nextInt();
       int t3=scn.nextInt();
       printit(n,t1,t2,t3);
    }
  public static void printit(int n,int t1,int t2,int t3 ){
      if(n==0){
          return ;
      }
     printit(n-1,t1,t3,t2);
     System.out.println(n+"[" + t1 +"-"+ t2 +"]");
     
     printit(n-1,t3,t2,t1);
   
          }

      }
