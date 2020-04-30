import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] maze=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j]=scn.nextInt();
            }
        } boolean[][] visited=new boolean[n][m];
        floodfill(maze,0,0,"",visited);
    }
   public static void floodfill(int[][] maze,int row ,int col,String asf, boolean[][] visited) {
       if(row == maze.length-1 && col == maze[0].length-1){
           System.out.println(asf);
           return;
       }
       if(row<0 || row>maze.length-1 || col<0 || col>maze[0].length-1 || visited[row][col] == true || maze[row][col] == 1 ){
           return;
       }
       visited[row][col]=true;
       floodfill(maze,row-1,col,asf+"t",visited);
       floodfill(maze,row,col-1,asf+"l",visited);
       floodfill(maze,row+1,col,asf+"d",visited);
       floodfill(maze,row,col+1,asf+"r",visited);
       visited[row][col] = false;
}
}
