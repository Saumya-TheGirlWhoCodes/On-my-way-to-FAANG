/* LeetCode Problem 1672 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}
