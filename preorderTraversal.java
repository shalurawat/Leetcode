class Solution {
    public void helper(TreeNode root, List<Integer> preOrderList){
        if(root == null){
            return;
        }

        preOrderList.add(root.val);
        helper(root.left,preOrderList);
        helper(root.right, preOrderList);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();

        helper(root, preOrderList);

        return preOrderList;
    }
}
