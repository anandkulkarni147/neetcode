class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();

        for (String str : strs) {
            char [] sorted = new char[26];
            for (int i = 0; i < str.length(); ++i) {
                sorted[str.charAt(i)-'a']++;
            }
            String s = new String(sorted);
            m.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(m.values());
    }
}
