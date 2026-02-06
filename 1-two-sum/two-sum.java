class Solution {
    public int[] twoSum(int[] nums, int target) {
        int le = nums.length;
        int[] arr = new int[2];

        for (int i = 0; i < le; i++) {
            int sum = target - nums[i]; 

            for (int j = i + 1; j < le; j++) { 
                if (sum == nums[j]) {   
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
