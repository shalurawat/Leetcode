class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        
        Queue<TreeNode> myQueue = new LinkedList<>();
        List<List<Integer>> myList = new ArrayList<>();

        myQueue.add(root);

        while(!myQueue.isEmpty()){
            int size = myQueue.size();
            List<Integer> innerList = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode popped = myQueue.remove();
                innerList.add(popped.val);

                if(popped.left != null){
                    myQueue.add(popped.left);
                }

                if(popped.right != null){
                    myQueue.add(popped.right);
                }
            }

            myList.add(innerList);
        }

        return myList;
    }
}
