
package DataStructures;

/**
 * Exception class for when trying to compare collection elements that
 * haven't implemented Comparable (and don't have a compareTo(..) method)
 * @author clatulip
 */
public class NonComparableElementException extends Exception {
    /**
     * 
     * @param collection 
     */
    public NonComparableElementException(String collection) {
        super("The element passed in to " + collection + " does not implement Comparable.");
    }
    
}
