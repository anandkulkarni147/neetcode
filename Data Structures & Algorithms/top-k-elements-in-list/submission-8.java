class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> [] l = new List[nums.length+1];
        for (int i : freq.keySet()) {
            if (l[freq.get(i)] == null) l[freq.get(i)] = new ArrayList<>();
            l[freq.get(i)].add(i);
        }

        int [] res = new int[k];

        for (int i = l.length-1; i >= 0; --i) {
            if (l[i] != null) {
                for (int num : l[i]) {
                    res[--k] = num;
                }
                if (k == 0) return res;
            }
            
        }
        return res;
    }
}
