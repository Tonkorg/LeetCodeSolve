package leetcode.leetcod_tasks.easy.task1;

class task1 {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;

    }
}

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(nums[i]+nums[j]==target) return new int[] {i,j};
                    if(nums[n-i-1]+nums[n-j-1]==target) return new int[] {n-j-1,n-i-1};
                }
            }
            return new int[] {-1,-1};
        }
    }

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    int[] outcomes = {i,j};
                    return outcomes;
                }
            }
        }
        return null;
    }
}

