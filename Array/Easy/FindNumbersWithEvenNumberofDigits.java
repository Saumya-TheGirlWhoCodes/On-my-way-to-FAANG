/* Leetcode Problem 1295 */

class Solution {
    public int findNumbers(int[] nums) {
        int max=0,even=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}
