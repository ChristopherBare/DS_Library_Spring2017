/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cbare3
 */
public class LinkedBinarySearchTreeTest {
    
    public LinkedBinarySearchTreeTest() {
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
     * Test of addElement method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testAddElement() throws Exception {
        System.out.println("addElement");
        String element = "StringyString";
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        assertTrue(!(instance.isEmpty()));
        assertEquals(instance.getRootElement(), element);
        
    }

    /**
     * Test of removeElement method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveElement() throws Exception {
        System.out.println("removeElement");
        int element1 = 1;
        int element2 = 2;
        LinkedBinarySearchTree<Integer> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element1);
        instance.addElement(element2);
        int expResult = 1;
        Object result = instance.removeElement(element1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeAllOccurrences method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveAllOccurrences() throws Exception {
        System.out.println("removeAllOccurrences");
        int element = 1;
        int element2 = 2;
        LinkedBinarySearchTree<Integer> instance = new LinkedBinarySearchTree<>();
        for (int i = 0; i < 4000; i++) {
            instance.addElement(element);
        }
        instance.addElement(element2);
        instance.removeAllOccurrences(element);
        assertTrue(instance.getRootElement().equals(element2));
        
    }

    /**
     * Test of removeMin method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveMin() throws Exception {
        System.out.println("removeMin");
        int element = 1;
        int element2 = 2;
        LinkedBinarySearchTree<Integer> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        instance.addElement(element2);
        int expResult = 1;
        Object result = instance.removeMin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findMin method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testFindMin() throws Exception {
        System.out.println("findMin");
        int element = 1;
        int element2 = 2;
        LinkedBinarySearchTree<Integer> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        instance.addElement(element2);
        int expResult = 1;
        Object result = instance.findMin();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testContains() throws Exception {
        System.out.println("contains");
        String element = "stuff";
        String element2 = "stuff too";
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        instance.addElement(element2);
        boolean expResult = true;
        Object result = instance.contains(element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        String element = "stuff";
        String element2 = "stuff too";
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        instance.addElement(element2);
        String expResult = element;
        Object result = instance.find(element);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNodeDepth() throws Exception {
        System.out.println("nodeDepth");
        String element = "stuff";
        String element2 = "stuff too";
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree<>();
        instance.addElement(element);
        instance.addElement(element2);
        int expResult = 1;
        Object result = instance.nodeDepth(element2);
        assertEquals(expResult, result);
    }

    

    
    
}
