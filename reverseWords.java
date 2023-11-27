class Solution {
    public String reverseWords(String s) {
        //trim from start
        int start = 0;
        while(s.charAt(start) == ' '){
            start++;
        }

        //trim from end
        int end = s.length() - 1;
        while(s.charAt(end) == ' '){
            end--;
        }

        StringBuilder result = new StringBuilder();

        StringBuilder currWord = new StringBuilder();

        while(start <= end){
            if(s.charAt(end) != ' '){
                currWord.append(s.charAt(end));
            }
            else{
                if(currWord.length() > 0){
                    result.append(currWord.reverse());
                    result.append(' ');
                    currWord.setLength(0);
                }
            }
            end--;
        }
        result.append(currWord.reverse());

        return result.toString();
    }
}
