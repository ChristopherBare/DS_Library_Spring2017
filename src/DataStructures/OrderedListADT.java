package DataStructures;

/**
 * An interface for an Ordered List (simplified - no iterator)
 * Specific ordered list implementations will implement this interface
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public interface OrderedListADT<T extends Comparable> extends ListADT {
    
    /**
     * Adds the specified element to the list, maintaining list order
     * @param element: the element to be added
     * @throws NonComparableElementException
     */
    public void add(T element) throws NonComparableElementException;
    
    
    
}
