package DataStructures;

/**
 * A general class for an ordered list, implemented with a doubly-linked list
 * Note: this is simplified, as we don't provide an iterator
 *
 * @author clatulip
 */
public class LinkedOrderedList<T extends Comparable> implements OrderedListADT<T> {

    private int count;
    private LinearNode<T> first;
    private LinearNode<T> last;

    public LinkedOrderedList() {
        count = 0;
        first = null;
        last = null;
    }

    @Override
    public void add(T element) {

        LinearNode temp = new LinearNode(element);
        //System.out.println("adding, element is: " + element.toString());
        if (first == null) {
            // list is empty, adding first node, easiest case
            first = temp;
            last = temp;
            count = 1;
            //System.out.println("adding first");

            return;
        }

        // scan the list from first to last
        int scan = 0;
        LinearNode current = first;
        LinearNode previous = null;
        T curElement = (T) current.getElement();
        while (scan < count && curElement.compareTo(element) < 0) {
            //System.out.println("scan is: " + scan + ", count is: " + count);
            previous = current;
            current = current.getNext();
            scan++;
            if (scan != count && current != null) {
                curElement = (T) current.getElement();
                if (current == null) {
                    break;
                }
            }

        }

        temp.setNext(current);
        temp.setPrev(previous);

        if (scan == 0) {
            // adding before the first node
            //System.out.println("adding to beginning");
            temp.setNext(first);
            first = temp;
        } else {

            //System.out.println("Adding to middle or end");
            if (previous != null) {
                previous.setNext(temp);
            }

            if (current != null) {
                current.setPrev(temp);
            }
        }

        // handle if adding at end
        if (scan == count) {
            //System.out.println("Adding to end");
            last = temp;
            previous.setNext(temp);
            //System.out.println("Last is: " + last.getElement() + ", prev is: " + last.getPrev().getElement());
        }

        count++;
        //System.out.println("End add. First is: " + first.getElement() + ", last is: " + last.getElement());
        //if (count > 1) System.out.println("second-last is: " + last.getPrev().getElement());

    }

    @Override
    public Object remove(Object element) throws NonComparableElementException, EmptyCollectionException {
        T result = null;
        if (!(element instanceof Comparable)) {
            throw new NonComparableElementException("OrderedList");
        }
        if (count == 0) {
            throw new EmptyCollectionException("Ordered List");
        }

        Comparable<T> comparableElement = (Comparable<T>) element;

        int scan = 0;
        // scan the list from first to last
        LinearNode current = first;
        LinearNode previous = null;
        T currentElement = (T) (current.getElement());
        while (scan < count && currentElement.compareTo(comparableElement) != 0) {
            previous = current;
            current = current.getNext();
            scan++;
            if (scan != count) {
                currentElement = (T) (current.getElement());
            }
        }

        // check if we found it
        if (currentElement.compareTo(comparableElement) == 0) {
            // we found it
            result = currentElement;

            if (previous == null) {
                // removing first
                first = current.getNext();
            } else {
                previous.setNext(current.getNext());
            }
            LinearNode next = current.getNext();
            if (next == null) {
                // removing last
                last = current.getPrev();
            } else {
                next.setPrev(current.getPrev());
            }
            count--;
        }
        //System.out.println("Removed object. List is now: " + count);
        //System.out.println(this.toString());
        return result;
    }

    @Override
    public Object removeFirst() throws EmptyCollectionException {

        // TODO: implement this for Week7 Lab
        /* Pseudocode  */
        // check if list is empty, if so throw exception
        // save element from first node in temp var to return it
        // set first to point at second element
        // set prev ref in new first to null
        // decrement count
        // return temp var element 
        T element;
        if (count == 0) {
            throw new EmptyCollectionException("Ordered List");
        }
        element = first.getElement();
        first = first.getNext();
        first.setPrev(null);
        count--;
        return element;

    }

    @Override
    public Object removeLast() throws EmptyCollectionException {

        T element;
        if (count == 0) {
            throw new EmptyCollectionException("Ordered List");
        }
        element = last.getElement();
        last = last.getPrev();
        last.setNext(null);
        count--;
        //System.out.println("Removed last. List is now:");
        //System.out.println(this.toString());
        return element;
    }

    @Override
    public Object first() throws EmptyCollectionException {
        T element;
        if (count == 0) {
            throw new EmptyCollectionException("Ordered List");
        }
        element = first.getElement();
        return element;

    }

    @Override
    public Object last() throws EmptyCollectionException {
        T element;
        if (count == 0) {
            throw new EmptyCollectionException("Ordered List");
        }
        element = last.getElement();
        return element;
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
        return "LinkedOrderedList{" + "count=" + count + ", head=" + first + ", tail=" + last + '}';
    }

}
