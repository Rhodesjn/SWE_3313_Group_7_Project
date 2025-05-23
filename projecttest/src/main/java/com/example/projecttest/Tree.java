package com.example.projecttest;
import java.util.Collection;

public interface Tree<E extends Object> extends Collection<E>{
    /** Return true if the element is in the tree*/
    public boolean search(E e);

    /** Insert element e into the binary tree
     * Return true if the element is inserted successfully*/
    public boolean insert(E e);
    /** Delete the specified element from the tree
     * Return true if the element is deleted successfully*/
    public boolean delete(E e);
    /** Get the number of elements in the tree*/
    public int getSize();
    /** Inorder traversal from the root*/
    public default void inorder(){

    }
    /** Postorder traversal from the root*/
    public default void postorder(){

    }
    /** Preorder traversal from the root*/
    public default void preorder(){

    }
    @Override/** Return true if the tree is empty*/
    public default boolean isEmpty(){
        return this.size() == 0;
    }
    @SuppressWarnings("unchecked")
    @Override
    public default boolean contains(Object e){
        return search((E)e);
    }
    @Override
    public default boolean add(E e){
        return insert(e);
    }
    @SuppressWarnings("unchecked")
    @Override
    public default boolean remove(Object e){
        return delete((E)e);
    }
    @Override
    public default int size(){
        return getSize();
    }

    @Override
    public default Object[] toArray() {
        return new Object[0];
    }

    @Override
    public default <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public default boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public default boolean retainAll(Collection<?> c) {
        return false;
    }
}
