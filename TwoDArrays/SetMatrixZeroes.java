package JAVA_DSA.TwoDArrays;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){  
                    matrix[i][0] = 0;
                if(j != 0){
                    matrix[0][j] = 0;
                }else col0 = 0;
                }
            }
        }
		
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 ||matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
                } 
            }
        }
        for(int i = 0;i<n;i++){
            if(matrix[0][0]==0){
                matrix[0][i] = 0;
            }
        }
        for(int i = 0;i<m;i++){
            if(col0 == 0){
                matrix[i][0]=0;
            }
        }
    }
    public static void printArray(int[][] array) {
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        printArray(M);
        setZeroes(M);
        System.out.println("ANSWER-->");
        printArray(M);
    }
}
