class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int j = -1;
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int len = Math.min(s1.length(), s2.length());

        for(int i=0; i<len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                break;
            }
            j++;
        }

        if(j == -1){
            return "";
        }

        return s1.substring(0,j+1);
    }
}
