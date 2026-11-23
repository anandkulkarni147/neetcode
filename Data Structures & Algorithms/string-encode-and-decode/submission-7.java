class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            int len = str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int j = i;
            int len = 0;
            while (j < str.length() && str.charAt(j) != '#') {
                len = len*10 + (str.charAt(j)-'0');
                j++;
            }
            j++;
            res.add(str.substring(j, j+len));
            i = j+len;
        }
        return res;
    }
}
