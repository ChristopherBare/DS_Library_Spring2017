/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher1
 */
public class LinkedOrderedListTest {
    
    public LinkedOrderedListTest() {
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
     * Test of add method, of class LinkedOrderedList.
     */
    @Test
    public void testAdd() throws Exception{
        System.out.println("add");
        String element = "string";
       String element2 = "string1";
       String element3 = "string3";
       String element4 = "string4";
        LinkedOrderedList<String> instance = new LinkedOrderedList<>();
        assertTrue(instance.isEmpty() == true);
        instance.add(element);
        assertTrue((instance.size()) == 1);
        instance.add(element2);
        assertTrue((instance.size()) == 2);
        instance.add(element3);
        assertTrue((instance.size()) == 3);
        instance.add(element4);
        assertTrue((instance.size()) == 4);
        assertTrue(instance.size() != 0);
        instance.remove(element);
        instance.remove(element2);
        instance.remove(element3);
        instance.remove(element4);
        assertTrue(instance.isEmpty() == true);
        assertTrue(instance.size() == 0);
        
    }

    /**
     * Test of remove method, of class LinkedOrderedList.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        String element = "string";
        String element2 = "string 2";
        LinkedOrderedList instance = new LinkedOrderedList();
        Object expResult = element;
        assertTrue(instance.size() == 0);
        instance.add(element);
        instance.add(element2);
        assertTrue(instance.size() == 2);
        assertTrue(instance.isEmpty() == false);
        Object result = instance.remove(element);
        assertTrue(instance.size() == 1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeFirst method, of class LinkedOrderedList.
     */
    @Test
    public void testRemoveFirst() throws Exception {
        System.out.println("removeFirst");
        String element = "string";
        String element2 = "string 2";
        LinkedOrderedList<String> instance = new LinkedOrderedList<>();
        Object expResult = element;
        instance.add(element);
        instance.add(element2);
        assertTrue(instance.isEmpty() == false);
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeLast method, of class LinkedOrderedList.
     */
    @Test
    public void testRemoveLast() throws Exception {
        System.out.println("removeLast");
        String element = "string";
        String element2 = "string 2";
        LinkedOrderedList instance = new LinkedOrderedList();
        Object expResult = element2;
        assertTrue(instance.size() == 0);
        instance.add(element);
        instance.add(element2);
        assertTrue(instance.size() == 2);
        assertTrue(instance.isEmpty() == false);
        Object result = instance.removeLast();
        assertTrue(instance.size() == 1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of first method, of class LinkedOrderedList.
     */
    @Test
    public void testFirst() throws Exception {
        System.out.println("first");
        String element = "stuff";
        LinkedOrderedList instance = new LinkedOrderedList();
        instance.add(element);
        Object expResult = element;
        Object result = instance.first();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of last method, of class LinkedOrderedList.
     */
    @Test
    public void testLast() throws Exception {
        System.out.println("last");
        String element = "stuff";
        String element2 = "stuff 2";
        LinkedOrderedList instance = new LinkedOrderedList();
        assertTrue(instance.size() == 0);
        instance.add(element);
        instance.add(element2);
        assertTrue(instance.size() == 2);
        Object expResult = element2;
        Object result = instance.last();
        assertTrue(instance.size() == 2);
        assertEquals(expResult, result);
        
    }

 

  
    
}
