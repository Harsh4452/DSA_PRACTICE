public class maxArraySum{
    
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){          //Marks the starting index of a subarray.
            for(int j=0;j<nums.length;j++){     //Marks the ending index of the subarray.
                currSum=0;
                for(int k=i;k<=j;k++){         //Goes from i to j and adds each element to currSum, i.e., calculates the sum of subarray nums[i..j]
                    currSum=currSum+nums[k];
                    System.out.print("("+nums[k]+")");

                }System.out.println();
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }return maxSum;

        
    }
    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        maxArraySum sol=new maxArraySum();
        int ret=sol.maxSubArray(nums);

        System.out.println("MAX SYBARRAY IS "+ret);

    }

}