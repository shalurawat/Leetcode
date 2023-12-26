class Solution {
    public void helper(TreeNode root, List<Integer> inOrderList){
        if(root == null){
            return;
        }

        helper(root.left, inOrderList);
        inOrderList.add(root.val);
        helper(root.right, inOrderList);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();

        helper(root, inOrderList);

        return inOrderList;
    }
}
