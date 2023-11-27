class Solution {
    public String removeOuterParentheses(String s) {
        //Use Stack to track the parantheses
        Stack<Character> myStack = new Stack<>();

        //Use StringBuilder for mutability
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(myStack.isEmpty()){
                myStack.push('(');
            }
            else if(myStack.size() == 1 && s.charAt(i) == ')'){
                myStack.pop();
            }
            else if(s.charAt(i) == '('){
                myStack.push('(');
                ans.append('(');
            }
            else{
                myStack.pop();
                ans.append(')');
            }
        }

        return ans.toString();
    }
}
