class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for( int i = 0; i < n ; i++)
        {
            if(arr.contains(nums[i]))
            return true;
            arr.add(nums[i]);
        }
        return false;
    }
}