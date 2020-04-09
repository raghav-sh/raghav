import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
     printIncDecreasing(n);    }
   public static void printIncDecreasing(int n){
       if(n==0){
           return;
       }
       System.out.println(n);
       printIncDecreasing(n-1);
       System.out.println(n);
   }

   }  
