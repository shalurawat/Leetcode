class Solution {
    public int maxDepth(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int max = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                arr.add('(');
            }
            else if(s.charAt(i) == ')'){
                int curr = arr.size();
                max = Math.max(curr,max);
                arr.remove(arr.size() - 1);
            }
        }

        return max;
    }
}
