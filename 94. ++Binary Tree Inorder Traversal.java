import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//题意：求二叉树的中序遍历

//把root的所有左节点都放入stack中，若左节点遍历完了，就取栈顶元素，加入rst的list中
//然后再看该节点的右子树，若右子树有左节点，同样也遍历所有左节点
//最后直到堆栈为空，且cur==null
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur!=null||!s.isEmpty()){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            rst.add(cur.val);
            cur = cur.right;
        }
        return rst;
    }
}
