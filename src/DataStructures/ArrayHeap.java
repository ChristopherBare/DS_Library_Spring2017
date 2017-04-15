/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An array-based maxHeap implementation.
 *
 * @author clatulip
 */
public class ArrayHeap<T> implements HeapADT<T> {

    private int count; // count points to next empty slot, also is size
    private T[] heap;
    private final int INIT_CAPACITY = 10;

    public ArrayHeap() {
        heap = (T[]) (new Object[INIT_CAPACITY]);
        count = 0;
    }

    /**
     * returns (without removing) the maximum element in the heap
     *
     * @return T the maximum element
     * @throws EmptyCollectionException
     */
    @Override
    public T findMax() throws EmptyCollectionException {
        if (count == 0) {
            throw new EmptyCollectionException("Heap");
        }
        return heap[0];

    }

    /**
     * Removes and returns the maximum element in the heap The heap then changes
     * in order to maintain validity
     *
     * @return T the maximum element
     * @throws EmptyCollectionException
     */
    @Override
    public T removeMax() throws EmptyCollectionException {
        if (count == 0) {
            throw new EmptyCollectionException("Heap");
        }
        T element = heap[0];
        // swap item at top of heap, with last item added
        heap[0] = heap[count - 1];
        // call heapify to see if new root needs to swap down
        heapifyRemove();

        count--;
        return element;
    }

    public T removeMin() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Heap");
        }

        T minElement = heap[0];
        heap[0] = heap[count - 1];
        heapifyRemove();
        count--;

        return minElement;
    }

    /**
     * Adds the element to the heap, making sure that the heap remains valid
     *
     * @param element to be added
     */
    @Override
    public void addElement(T element) {
        // TODO. 
        // Pseudocode: 
        // Check if array is at capacity, if so expand it. 
        // add element to the array
        // increment count
        // if this is not the first element, then call heapifyAdd to check if the newly added
        // element needs to be swapped up the heap
        if (count == heap.length) {
            expandCapacity();

        }
        heap[count] = element;
        count++;

        if (count > 1) {
            heapifyAdd();
        }

    }

    /**
     * Returns true if heap is empty, false otherwise
     *
     * @return boolean true if empty
     */
    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    /**
     * Returns the number of elements in the heap
     *
     * @return int the count of elements in the heap
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * private method that swaps out the new root, and swaps it down the heap
     * until it is in the correct position
     */
    private void heapifyRemove() {
        // this is called after the item at the bottom-left has been put at the root
        // we need to see if this item should swap down
        int node = 0;
        int left = 1;
        int right = 2;
        int next;

        // store the item at the root in temp
        T temp = heap[node];

        // find out where we might want to swap root 
        if ((heap[left] == null) && (heap[right] == null)) {
            next = count; // no children, so no swapping
            return;
        } else if (heap[right] == null) {
            next = left; // we will check left child
        } else if (((Comparable) heap[left]).compareTo(heap[right]) > 0) { // figure out which is the biggest of the two children
            next = left; // left is bigger than right, so check left child
        } else {
            next = right; // check right child
        }

        // compare heap[next] to item temp, if bigger, swap, and then repeat process
        while ((next < count) && (((Comparable) heap[next]).compareTo(temp) > 0)) {
            heap[node] = heap[next];
            node = next;
            left = 2 * node + 1; // left child of current node
            right = 2 * (node + 1); // right child of current node
            if ((heap[left] == null) && (heap[right] == null)) {
                next = count;
            } else if (heap[right] == null) {
                next = left;
            } else if (((Comparable) heap[left]).compareTo(heap[right]) > 0) {
                next = left;
            } else {
                next = right;
            }
        }
        heap[node] = temp;

    }

    /*
    Private method to double capacity of the heap array
     */
    private void expandCapacity() {
        heap = Arrays.copyOf(heap, heap.length * 2);
    }

    /*
    Private method to do swapping up the heap as needed, 
    to put the newly added element into the right position in the heap
     */
    private void heapifyAdd() {
        // TODO. The general idea of this method is that we are checking whether the 
        // most recently added item, which has been put at the end of the array, 
        //needs to be swapped with its parent. We do this in a loop, until a swap isn’t needed or we reach the root.  This is not recursive.

        // Pseudocode:
        // assign newly added item to a temp var.
        // use an index variable to keep track of the index where that value was added
        // while the index isn’t pointing at the root, and while the node at this index is greater than the node at its parent:
        // copy the parent node to the index location (move parent node down the heap)
        // set the index to the parent index
        // when we are at the root, or the parent of current index isn’t bigger, we are done
        // copy the temp variable to the location of the current index. 
        T temp;
        int next = count - 1;

        temp = heap[next];

        while ((next != 0) && (((Comparable) temp).compareTo(heap[(next - 1) / 2]) > 0)) {
            heap[next] = heap[(next - 1) / 2];
            next = (next - 1) / 2;
        }
        heap[next] = temp;
    }

    public int getCount() {
        return count;
    }

    public T[] getHeap() {
        return heap;
    }

    public int getINIT_CAPACITY() {
        return INIT_CAPACITY;
    }

    @Override
    public String toString() {

        return "ArrayHeap{" + "count=" + count + ", heap=" + heap + '}';
    }

    public T[] heapSort() throws EmptyCollectionException {
        //Bonus: add a heapsort method to the array heap 
        //that returns a sorted array of generic elements.
        
        ArrayHeap<T> temp = new ArrayHeap<>();

        //copy array into heap
        for (int i = 0; i < heap.length; i++) {
            if (heap[i] != null) {
                temp.addElement(heap[i]);
            } else {
                break;
            }
        }

        //place the sorted elements back into the array
        int c = 0;
        while (!temp.isEmpty()) {
            if (heap[c] != null) {
                heap[c] = temp.removeMin();
                c++;
            } else {
                break;
            }
            

        }
        return heap;

    }

}
