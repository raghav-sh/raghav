import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int m=scn.nextInt();
   System.out.println(getmazepath(n,m));
    }  
   public static ArrayList<String> getmazepath(int n,int m){
    if(n==0&&m==0){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
  }
  ArrayList<String> myans=new ArrayList<>();
  if(n-1>=0){
      ArrayList<String> ros= getmazepath(n-1,m);
      for(String s : ros){
          myans.add(s+"V");
      }
  }
  if(m-1>=0){    
        ArrayList<String> ros= getmazepath(n,m-1);
      for(String s : ros){
          myans.add(s+"H");
  }
  }return myans;
   }
}
