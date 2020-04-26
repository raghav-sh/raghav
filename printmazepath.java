import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int m=scn.nextInt();
   String s=new String();
   printmazepath(n,m,s);
    }  
   public static void printmazepath(int n,int m,String s){
    if(n==0&&m==0){
    System.out.println(s);
        return ;
  }
  if(n-1>=0){
      printmazepath(n-1,m,s+"V");
   }
  
  if(m-1>=0){    
    printmazepath(n,m-1,s+"H");
 }
   }
}
