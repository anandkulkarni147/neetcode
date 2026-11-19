class Solution {
    // SORT - TC O(nlogn) | SC O(1) or O(logn)
    // public boolean hasDuplicate(int[] nums) {
    //     if (nums.length == 0 || nums.length == 1) return false;

    //     Arrays.sort(nums);

    //     for (int i = 1; i < nums.length; ++i) {
    //         if (nums[i-1] == nums[i]) return true;
    //     }
    //     return false;
    // }

    // SET - TC O(n) | SC O(n)
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return false;

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (s.contains(nums[i])) return true;
            s.add(nums[i]);
        }
        return false;
    }
}