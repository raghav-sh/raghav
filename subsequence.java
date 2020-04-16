import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(gss(str));
    }
    public static Arraylist<String> gss(String str){
        if(str.length==0){
            Arraylist<String> bans=new Arraylist<>();
            bans.add(" ");
            return bans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        Arraylist<String> rr=gss(ros);
        Arraylist<String> ans=new Arraylist<>();
        for(int i=0;i<rr.size();i++){
            String s=rr.get(i);
            ans.add(s)  ;
              }
              for(int i=0;i<rr.size();i++){
                  String s=rr.get(i);
                  ans.add(ch+s);
              }
              return ans;
}
}
