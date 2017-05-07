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
 * @author cbare3 , rnakhle
 */
public class LinkedStackTest {

    public LinkedStackTest() {
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
     * Test of pop method, of class LinkedStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        String element = "pop test";
        String element2 = "pop test 2";
        LinkedStack<String> instance = new LinkedStack<>();

        instance.push(element);
        instance.push(element2);
        String result = instance.pop();
        assertEquals(instance.size(), 1);
        assertEquals(result, element2);
        String result2 = instance.pop();
        assertEquals(instance.size(), 0);
        assertTrue(instance.isEmpty());

    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedStack<String> instance = new LinkedStack<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedStack<String> instance = new LinkedStack<>();
        String element = "test something real";
        instance.push(element);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class LinkedStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedStack<String> instance = new LinkedStack<>();
        String element = "";
        instance.push(element);
        String expResult = "LinkedListStack{" + "count=" + instance.getCount() + ", top=" + instance.getTop() + "}"; 
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element = null;
        LinkedStack<String> instance = new LinkedStack<>();
        instance.push(element);

    }

    /**
     * Test of peek method, of class LinkedStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        String element = "push test";
        String element2 = "push test 2";
        LinkedStack<String> instance = new LinkedStack<>();
        instance.push(element);
        instance.push(element2);

        String expResult = element2;
        String result = instance.peek();
        assertEquals(expResult, result);

    }
    /**
     * Tests the bonus to push pop stuff. 
     * @throws EmptyCollectionException 
     */
    @Test
    public void testStack() throws EmptyCollectionException {
        LinkedStack<Integer> instance = new LinkedStack<>();

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            if (random < 7) {
                instance.push(random);
            }
            else if (random >= 7) {
                if (!instance.isEmpty()) {
                    instance.pop();
                }
            }
        }
        System.out.println(instance.size());
        //Assertions go here:
        //Stack should not be empty
        assertTrue(!instance.isEmpty());
        //Checking the size is less than 100
        assertTrue(instance.size() < 100);
    }

}
