package old_code;

import java.util.Comparator;
import java.util.ArrayList;

/** A V L (old_code.AVL)*/
public class AVL<E> extends BST<E> {
    /** Create an empty old_code.AVL tree using natural comparators*/
    public AVL(){
        //super() is implicitly called
    }
    /** Create a old_code.BST with a specified comparator */
    public AVL(Comparator<E> c){
        super(c);
    }
    /** Create an old_code.AVL tree from an array of objects*/
    public AVL(E[] objects){
        super(objects);
    }
    /** Override createNewNode to create an AVLTreeNode*/
    @Override
    protected AVLNode<E> createNewNode(E e){
        return new AVLNode<E>(e);
    }
    /** Insert an element and re-balance if necessary*/
    @Override
    public boolean insert(E e){
        boolean successful = super.insert(e);
        if(!successful){
            //e is already in the tree
            return false;
        }
        else{
            //Balance from e to the root if necessary
            balancePath(e);
        }
        //e is inserted
        return true;
    }
    /** Update the height of the specified node*/
    private void updateHeight(AVLNode<E> node){
        if(node.left == null && node.right == null){
            //node is a leaf
            node.height = 0;
        }
        else if(node.left == null){
            //node has no left subtree
            node.height = 1 + ((AVLNode<E>)(node.right)).height;
        }
        else if(node.right == null){
            //node has no right subtree
            node.height = 1 + ((AVLNode<E>)(node.left)).height;
        }
        else{
            node.height = 1 + Math.max(((AVLNode<E>)(node.right)).height, ((AVLNode<E>)(node.left)).height);
        }
    }
    /** Balance the nodes in the path from the specified
     *  node to the root if necessary */
    private void balancePath(E e){
        ArrayList<TreeNode<E>> path = path(e);
        for(int i = path.size()-1;i>=0;i--){
            AVLNode<E> A = (AVLNode<E>)(path.get(i));
            updateHeight(A);
            AVLNode<E> parentOfA = (A == root) ? null : (AVLNode<E>)(path.get(i - 1));

            switch(balanceFactor(A)){
                case(-2):
                    if(balanceFactor((AVLNode<E>)A.left) <= 0){
                        //Preform LL rotation
                        balanceLL(A, parentOfA);
                    }
                    else{
                        //Preform LR rotation
                        balanceLR(A, parentOfA);
                    }
                    break;
                case(+2):
                    if(balanceFactor((AVLNode<E>)A.right) >= 0){
                        //Preform RR rotation
                        balanceRR(A, parentOfA);
                    }
                    else{
                        //Preform RL rotation
                        balanceRL(A, parentOfA);
                    }
                    break;
            }
        }
    }
    /** Return the Balance factor of the node */
    private int balanceFactor(AVLNode<E> node){
        //node has no right subtree
        if(node.right == null){
            return -node.height;
        }
        //node has no left subtree
        else if(node.left == null){
            return+node.height;
        }
        else{
            return ((AVLNode<E>)node.right).height - ((AVLNode<E>)node.left).height;
        }
    }
    /** Balance LL */
    private void balanceLL(TreeNode<E> A, TreeNode<E> parentOfA){
        //A is left-heavy and B is left-heavy
        TreeNode<E> B = A.left;
        if(A == root){
            root = B;
        }
        else{
            if(parentOfA.left == A){
                parentOfA.left = B;
            }
            else{
                parentOfA.right = B;
            }
        }
        //make T2 the left subtree of A
        A.left = B.right;
        B.left = A;
        updateHeight((AVLNode<E>)A);
        updateHeight((AVLNode<E>)B);
    }
    /** Balance RR */
    private void balanceRR(TreeNode<E> A, TreeNode<E> parentOfA){
        //A is right-heavy and B is right-heavy
        TreeNode<E> B = A.right;
        if(A == root){
            root = B;
        }
        else{
            if(parentOfA.right == A){
                parentOfA.right = B;
            }
            else{
                parentOfA.left = B;
            }
        }
        //make T2 the left subtree of A
        A.right = B.left;
        B.right = A;
        updateHeight((AVLNode<E>)A);
        updateHeight((AVLNode<E>)B);
    }
    /** Balance RL */
    private void balanceRL(TreeNode<E> A, TreeNode<E> parentOfA){
        //A is right-heavy
        TreeNode<E> B = A.right;
        //B is left-heavy
        TreeNode<E> C = B.left;
        if(A == root){
            root = C;
        }
        else{
            if(parentOfA.left == A){
                parentOfA.left = C;
            }
            else{
                parentOfA.right = C;
            }
        }
        //make T2 the right subtree of A
        A.right = C.left;
        //make T3 the left subtree of B
        B.left = C.right;
        C.left = A;
        C.right = B;
        updateHeight((AVLNode<E>)A);
        updateHeight((AVLNode<E>)B);
    }
    /** Balance LR */
    private void balanceLR(TreeNode<E> A, TreeNode<E> parentOfA){
        //A is left-heavy
        TreeNode<E> B = A.left;
        //B is right-heavy
        TreeNode<E> C = B.right;
        if(A == root){
            root = C;
        }
        else{
            if(parentOfA.right == A){
                parentOfA.right = C;
            }
            else{
                parentOfA.left = C;
            }
        }
        //make T2 the right subtree of A
        A.left = C.right;
        //make T3 the left subtree of B
        B.right = C.left;
        C.right = A;
        C.left = B;
        updateHeight((AVLNode<E>)A);
        updateHeight((AVLNode<E>)B);
    }

    public static class AVLNode<E> extends TreeNode<E>{
        protected int height;
        public AVLNode(E o) {
            super(o);
        }
    }
}
