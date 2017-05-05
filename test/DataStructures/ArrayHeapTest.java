/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher1
 */
public class ArrayHeapTest {
    
    public ArrayHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findMax method, of class ArrayHeap.
     */
    @Test
    public void testFindMax() throws Exception {
        System.out.println("findMax");
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        instance.addElement(9);
        assertEquals((int) instance.findMax(), 9);

        instance.addElement(7);
        assertEquals((int) instance.findMax(), 9);

        instance.addElement(3);
        instance.addElement(12);
        instance.addElement(2);
        instance.addElement(1);
        int expResult = 12;
        int result = instance.findMax();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeMax method, of class ArrayHeap.
     */
    @Test
    public void testRemoveMax() throws Exception {
        System.out.println("removeMax");
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        instance.addElement(9);
        instance.addElement(7);
        instance.addElement(3);
        instance.addElement(12);
        instance.addElement(2);
        instance.addElement(1);
        int expResult = 12;
        int result = instance.removeMax();
        assertEquals(expResult, result);
        assertEquals(instance.size(), 5);
        for (int i = 0; i < 5; i++){
            instance.removeMax();
        }
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of addElement method, of class ArrayHeap.
     */
    @Test
    public void testAddElement() throws EmptyCollectionException {
        System.out.println("addElement");
        long expResult = 12;
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        instance.addElement(9);
        instance.addElement(7);
        instance.addElement(3);
        instance.addElement(12);
        instance.addElement(2);
        instance.addElement(1);
        
        int result = instance.findMax();
        assertEquals(expResult, result);
        assertEquals(instance.size(), 6);
    }

    /**
     * Test of isEmpty method, of class ArrayHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of size method, of class ArrayHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        int expResult = 420;
        int result = 0;
        for(int i = 0; i < 420; i++){
        instance.addElement(1);
        result++;
        }
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class ArrayHeap.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        String expResult = "ArrayHeap{" + "count=" + instance.getCount() + ", heap=" + instance.getHeap() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    
    

    /**
     * Test of heapSort method, of class ArrayHeap.
     * @throws java.lang.Exception
     */
    @Test
    public void testHeapSort() throws Exception {
        System.out.println("heapSort");
        Integer[] data = {4, 2, 5};
        ArrayHeap<Integer> instance = new ArrayHeap<>();
        for (int i = 0; i < data.length; i++) {
            System.out.println("Adding data " + i);
            instance.addElement(data[i]);
        }
        Integer[] expResult = {2, 4, 5};
        Integer[] result = null;
        for (Integer x : instance.heapSort()) {
            System.out.println("h");
            System.out.println(x);
        }
        System.out.println(Arrays.toString(result));
        Assert.assertArrayEquals(expResult, result);
        System.out.println(Arrays.toString(instance.heapSort()));
    }
    
}
