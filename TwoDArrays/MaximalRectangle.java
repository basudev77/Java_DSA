package TwoDArrays;

import java.util.Stack;

public class MaximalRectangle {
    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            if(stk.isEmpty()){
                left[i]=0;
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
                }
                left[i]=stk.isEmpty()?0:stk.peek()+1;
                      stk.push(i);
            }
                      
        }
        while(!stk.isEmpty()){
            stk.pop();
        }
        for(int j=n-1;j>=0;j--){
            if(stk.isEmpty()){
                right[j]=n-1;
                stk.push(j);
            }
            else{
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[j]){
                stk.pop();
                }
                right[j]=stk.isEmpty()?n-1:stk.peek()-1;
                      stk.push(j);
            }
                      
        }
        int max=0;
        for(int k=0;k<n;k++){
            max=Math.max(max,(right[k]-left[k]+1)*heights[k]);
        }
        return max;
    }
    public static int maximalRectangle(char[][] matrix) {
         if(matrix.length==0){
            return 0;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int[]height=new int[col];
        for(int i=0;i<col;i++){
            height[i]=(matrix[0][i]=='1')?1:0;
        }
        int maxV=largestRectangleArea(height);
        for(int j=1;j<row;j++){
            for(int k=0;k<col;k++){
                if(matrix[j][k]=='0'){
                    height[k]=0;
                }
                else{
                    height[k]+=1;
                }
            }
            maxV=Math.max(maxV,largestRectangleArea(height));
        }
        return maxV;
    }
    public static void main(String[] args) {
        char[][]matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
}
