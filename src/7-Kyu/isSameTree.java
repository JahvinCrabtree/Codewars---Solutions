// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         // Base case: if both trees are null, they are identical
//         if (p == null && q == null) {
//             return true;
//         }
//         // If only one tree is null or the values are different, they are not identical
//         if (p == null || q == null || p.val != q.val) {
//             return false;
//         }
//         // Recursively check if the left and right subtrees are identical
//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }
// }

/*

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
 */