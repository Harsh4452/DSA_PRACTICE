public class FindFirstAndLastIndex {
    public int[] searchRange(int[] nums, int target) {
        int start_idx = -1;
        int last_idx = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start_idx == -1) {
                    start_idx = i; 
                }
                last_idx = i; 
            }
        }
        
        // Store indices in result_arr
        int[] result_arr = new int[]{start_idx, last_idx};
        
        return result_arr; // Return the result
    }
    public static void main(String[] args) {
        int[] nums={5,1,4,6,6,7};
        int target=6;
        FindFirstAndLastIndex sol=new FindFirstAndLastIndex();
        int result[]=sol.searchRange(nums, target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

}
