
public class twoSum{
    public static int[] solution(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};   //return array
                }
            }
        }return new int[]{-1, -1};

    }
    public static void main(String[] args) {
        int nums[]={2,7,9,11,15};
        int target=9;
        int ret[]=solution(nums, target);
        System.out.println("Indices are: " + ret[0] + " and " + ret[1]);

    }
}
