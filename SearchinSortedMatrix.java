class SearchinSortedMatrix {
    public boolean solution(int[][] matrix, int target) {
        //starting from rightmost element i.e 7
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>0){
            if(target==matrix[row][col]){
                System.out.print("Found at index "+"("+row+","+col+")");
                return true;
            }
            else if(target<matrix[row][col]){     //if key is smaller go left

                col--;

            }else if(target>matrix[row][col]){  //if key is smaller go down
                row++;

            }
        }System.out.print("Not found");
        return false;
        
    }
    public static void main(String args[]){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SearchinSortedMatrix sol=new SearchinSortedMatrix();
        System.out.print(sol.solution(matrix,11));
    }
}
