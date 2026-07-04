class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]<=nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }
    
    int[] swap(int[] nums, int first, int sec){
        int temp = nums[first];
        nums[first] =  nums[sec];
        nums[sec] = temp;
        return nums;
    }
}