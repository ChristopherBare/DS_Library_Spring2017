/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author cbare3 , rnakhle
 */
public class LinkedStack<T> implements StackADT<T> {

    private int count;
    private LinearNode<T> top;

    public LinkedStack() {
        count = 0;
        top = null;

    }

    @Override
    public T pop() throws EmptyCollectionException {
        T result;
        if (count != 0) {
            result = top.getElement();
            top = top.getNext();
            count--;
        } else {
            throw new EmptyCollectionException("Linked List Stack");
        }
        return result;

    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "LinkedListStack{" + "count=" + count + ", top=" + top + '}';
    }

    public int getCount() {
        return count;
    }

    public LinearNode<T> getTop() {
        return top;
    }

    @Override
    public void push(T element) {
            LinearNode<T> result = new LinearNode<T>();
            result.setElement(element);
            result.setNext(top);
            top = result;
            count++;
        

    }

    @Override
    public T peek() throws EmptyCollectionException {

        T result;
        if (count != 0) {
            result = top.getElement();
            top = top.getNext();

        } else {
            throw new EmptyCollectionException("It's empty.");

        }
        return result;
    }
}
