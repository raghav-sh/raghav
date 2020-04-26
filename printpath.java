import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   System.out.println(getpath(n));
    }  
   public static ArrayList<String> getpath(int n){
       if(n==0){
           ArrayList<String> baseans=new ArrayList<>();
           baseans.add("");
           return baseans;
       }
        ArrayList<String> myans=new ArrayList<>();
       if(n-1>=0){
           ArrayList<String> rest= getpath(n-1);
           for(String s: rest){
           myans.add("1"+s);
       }
       }
       if(n-2>=0){
           ArrayList<String> rest= getpath(n-2);
           for(String s: rest){
           myans.add("2"+s);
       }
       }
       if(n-3>=0){
           ArrayList<String> rest= getpath(n-3);
           for(String s: rest){
           myans.add("3"+s);
       }
       }
    return myans;

       
   } 
}
