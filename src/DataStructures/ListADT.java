package DataStructures;

/**
 * An interface for a List
 * Specific list implementations will implement this interface
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public interface ListADT<T> extends CollectionADT {
    
    /**
     * Removes and returns the specified element 
     * @return the element specified
     * @throws EmptyCollectionException, NonComparableElementException 
     */
    public T remove(T element) throws NonComparableElementException, EmptyCollectionException;
    
    /**
     * Removes and returns the first element 
     * @return the first element in the list
     * @throws EmptyCollectionException 
     */
    public T removeFirst() throws EmptyCollectionException;
    
    /**
     * Removes and returns the last element 
     * @return the last element in the list
     * @throws EmptyCollectionException 
     */
    public T removeLast()throws EmptyCollectionException;
    
    /**
     * Returns (without removing) the first element in the list
     * @return element at the beginning of the list
     * @throws EmptyCollectionException 
     */
    public T first() throws EmptyCollectionException;
    
    /**
     * Returns (without removing) the last element in the list
     * @return element at the end of the list
     * @throws EmptyCollectionException 
     */
    public T last() throws EmptyCollectionException;
    
    
}
