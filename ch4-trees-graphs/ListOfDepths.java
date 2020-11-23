/*
Given a binary tree, design an algorithm which creates 
a linked list of all of the nodes at each depth 
(e.g., if you have a treee with depth D, you'll have 
D linked lists).
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfDepths {
    public List<LinkedList<TreeNode>> useBFS(TreeNode root) {
        List<LinkedList<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> current = new LinkedList<>();
        current.add(root);
        while (current.size() > 0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }
        return result;
    }

    public List<LinkedList<TreeNode>> useDFS(TreeNode root) {
        List<LinkedList<TreeNode>> result = new ArrayList<>();
        DFShelper(result, root, 0);
        return result;
    }

    private void DFShelper(List<LinkedList<TreeNode>> result, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        LinkedList<TreeNode> list = null;
        if (result.size() == level) {
            list = new LinkedList<>();
            result.add(list);
        } else {
            list = result.get(level);
        }
        list.add(node);
        DFShelper(result, node.left, level + 1);
        DFShelper(result, node.right, level + 1);
    }
}
