class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int num : nums) s.add(num);

        int res = 0;
        for (int num : s) {
            int seq = 0;
            int val = num;
            if (s.contains(num-1)) continue;
            while (s.contains(val)) {
                val++;
                seq++;
            }
            res = Math.max(res, seq);
        }
        return res;
    }
}
