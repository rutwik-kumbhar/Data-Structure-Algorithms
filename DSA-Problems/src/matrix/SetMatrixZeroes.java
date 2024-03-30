package matrix;

import java.util.Arrays;

// Problem Link : https://leetcode.com/problems/set-matrix-zeroes/description/?envType=study-plan-v2&envId=top-interview-150
public class SetMatrixZeroes {


    // helper function for brute force approach
    public  static  void setRowOrColumn(int[][] matrix ,  int row , int col){

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<m;i++){
            if(matrix[row][i] != 0){
                matrix[row][i] = -1;
             }
        }

        for (int i=0;i<n;i++){
            if (matrix[i][col] != 0){
                matrix[i][col] = -1;
            }
        }
    }

    // brute force approach
     public static  void bruteForceApproach(int[][] matrix ){

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j] == 0 ){
                    setRowOrColumn(matrix,i,j);
                }
            }
        }

         for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j] == -1 ){
                    matrix[i][j] = 0;
                }
            }
        }


         System.out.println("Output");
         for (int[] arr  : matrix){
             System.out.println(Arrays.toString(arr));
         }


    }

    public  static  void betterApproach(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Output ");
        for (int[] arr  : matrix){
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Input");
        for (int[] arr  : matrix){
            System.out.println(Arrays.toString(arr));
        }

       /*   brute force approach
            Time Complexity =  O(n)3
            Space complexity = O(1)
        */
//        bruteForceApproach(matrix);


        /*   brute force approach
            Time Complexity =  O(n)2
            Space complexity = O(n)
        */
        
        betterApproach(matrix);





    }
}
