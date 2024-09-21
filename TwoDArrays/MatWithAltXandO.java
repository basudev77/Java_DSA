package TwoDArrays;

import java.util.Scanner;

public class MatWithAltXandO {
    public static void createMatrix(int r,int c){
        char[][]mat=new char[r][c];
        int row=r,col=c;
        int lt=0,rt=0;
        char isX='X';
        while(lt<r && rt<c){
            for(int i=lt;i<c;i++){
                mat[lt][i]=isX;
            }
            lt++;
            for(int j=lt;j<r;j++){
                mat[j][c-1]=isX;
            }
            c--;
            if (lt < r){
                for(int k=c-1;k>=rt;k--){
                    mat[r-1][k]=isX;
                }
                r--;
            }
            if(rt<c){
                for(int l=r-1;l>=lt;l--){
                    mat[l][rt]=isX;
                }
                rt++;
            }
            isX=(isX=='X')?'O':'X';

        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        createMatrix(r,c);
        sc.close();
    }
}
