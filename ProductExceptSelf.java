//Time: O(N)
//space: O(N) constant space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //input[1,2,3,4]
        int output[] = new int[nums.length];
        int product = 1;
        
        // left [1,1,2,6]
        for(int i = 0; i< nums.length; i++){
            output[i] = product;
            product = output[i] * nums[i];
        }
        
        product = 1;
        //right[24,12,8,6]
        for(int j = nums.length - 1; j >= 0; j--){
            output[j] = output[j] * product;
            product = product * nums[j];
        }
        
        return output;
    }
}
