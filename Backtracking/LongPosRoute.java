package Backtracking;

import java.util.*;
public class LongPosRoute {
    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void findLongestPath(int mat[][], int i, int j, int x, int y, int pathLength, int[] maxLength) {
    
        if(i==x && j==y){
            if(pathLength>maxLength[0]){
                maxLength[0]=pathLength;
            }
            return;
        }
        mat[i][j]=0;
        List<Pair> directions = new ArrayList<>();
        directions.add(new Pair(0, 1));     
        directions.add(new Pair(1, 0));
        directions.add(new Pair(0, -1));
        directions.add(new Pair(-1, 0));
        for(Pair dir:directions){
            int newi=i+dir.first;
            int newj=j+dir.second;
            if(newi>=0 && newi<mat.length && newj>=0 && newj<mat[0].length && mat[newi][newj]==1){
                findLongestPath(mat,newi,newj,x,y,pathLength+1,maxLength);
            }
            
        }
        mat[i][j]=1;
    }

    public static void main(String[] args) {

        // input matrix with hurdles shown with number 0
        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

        
        int[] maxLength = {-1};
        int i=0,j=0,x=1,y=7;
        if(mat[i][j]==0 || mat[x][y]==0){
            System.out.println("No Path Possible");
            return;
        }
        findLongestPath(mat,i,j,x,y,0,maxLength);
        System.out.println("Longest Possible Length is "+maxLength[0]);    //24

    }
}
