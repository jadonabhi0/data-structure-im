package adt;

public interface SinglyLinkedListADT {

    void add(int n);
    void add(int value,int position);
    void deleteWithPosition(int position);
    void deleteWithValue(int value);
    void print();
    int size();
    void deleteList();
    boolean isEmpty();
    void nthNodeFromStart(int position);
    void nthNodeFromEnd(int position);
    int search(int value);
    void middleNode();
    int nodeFrequency(int value);
    void reverseIterative();
    void reverseRecursively();





}
