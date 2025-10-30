public class transposematrix {
    public int[][] solution(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int transposematrix[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposematrix[j][i]=matrix[i][j];
            }
        }return transposematrix;


    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        transposematrix sol=new transposematrix();
        int result[][]=(sol.solution(matrix));
        for(int row=0;row<result.length;row++){
            for(int col=0;col<result[0].length;col++){
                System.out.print(result[row][col]+" ");
            }System.out.println();
        }
    }
}

    