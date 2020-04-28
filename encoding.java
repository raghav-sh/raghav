import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        encoding(str,"");
    }
  public static void encoding(String str, String asf){
  if(str.length()==0){
      System.out.println(asf);
      return;
  } 
  if(str.charAt(0)=='0'){
      return;
  }
  String ch=str.charAt(0)+"";
  String ros=str.substring(1);
  encoding(ros,asf+ (char)(Integer.parseInt(ch)-1+'a'));  
  if(str.length()>1){
  String ch1=str.substring(0,2);
  String ros1=str.substring(2);
  if(Integer.parseInt(ch1)<=26){
      encoding(ros1,asf+(char)(Integer.parseInt(ch1)-1+'a'));
  }
  }  
}
}
