class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int n = nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        int cur = nums[0];
        for (int i = 1; i < n; i++) 
        {
            if (nums[i] == cur)
                continue;
            else if (nums[i] == cur + 1) 
                count++;
            else 
                count = 1;
            max = Math.max(max, count);
            cur = nums[i];
        }
        return max;
    }
}