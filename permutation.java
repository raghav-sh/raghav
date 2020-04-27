import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        permutation(s,"");
    }
public static void permutation(String ques, String asf){
   if(ques.length()==0){
       System.out.println(asf);
       return;
   }
    for(int i=0;i<ques.length();i++){
    char    ch=ques.charAt(i);
    String ros=ques.substring(0,i)+ ques.substring(i+1);
    permutation(ros,asf+ch);
    }
}
}
