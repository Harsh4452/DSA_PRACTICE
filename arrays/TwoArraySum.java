package arrays;

public class TwoArraySum {
    
    public static int[] twoArraySum(int[] nums1, int[] nums2) {
        // Determine the length of the result array
        int maxLength = Math.max(nums1.length, nums2.length);
        int[] result = new int[maxLength];
        
        // Add corresponding elements from both arrays
        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < nums1.length) ? nums1[i] : 0; // If index out of bounds, use 0
            int num2 = (i < nums2.length) ? nums2[i] : 0; // If index out of bounds, use 0
            result[i] = num1 + num2;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example inputs
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6, 7};
        
        // Call the function and print the result
        int[] result = twoArraySum(nums1, nums2);
        
        // Output the result
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


}
