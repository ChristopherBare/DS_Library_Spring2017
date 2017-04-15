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
 * @author christopher1
 */
public class AMGraphTest {

    public AMGraphTest() {
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
     * Test of addVertex method, of class AMGraph.
     */
    @Test
    public void testAddVertex() {
        System.out.println("addVertex");
        String vertex = "four Thousand!";
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
    for (int i = 0; i < 9; i++) {
            instance.addVertex(vertex);
            
        }
        
        assertTrue(instance.size() == 10);
        instance.removeVertex(vertex);
        assertTrue(instance.size() == 9);
    }

    /**
     * Test of removeVertex method, of class AMGraph.
     */
    @Test
    public void testRemoveVertex() {
        System.out.println("removeVertex");
        String vertex = "string";
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
        for (int i = 0; i < 4000; i++) {
            instance.addVertex(vertex);
        }
        assertTrue(instance.size() == 4001);
        instance.removeVertex(vertex);
        assertTrue(instance.size() == 4000);
    }

    /**
     * Test of addEdge method, of class AMGraph.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex(A);
        instance.addVertex(B);
        instance.addVertex(C);
        instance.addVertex(D);
        instance.addVertex(E);
        instance.addVertex(F);
        
        
        
    }

    /**
     * Test of removeEdge method, of class AMGraph.
     */
    @Test
    public void testRemoveEdge() {
        System.out.println("removeEdge");
        Object vertex1 = null;
        Object vertex2 = null;
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
    }

    /**
     * Test of depthFirstTraversal method, of class AMGraph.
     */
    @Test
    public void testDepthFirstTraversal() {
        System.out.println("depthFirstTraversal");
        String startVertex = null;
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
        ArrayList expResult = null;
        ArrayList<String> result = instance.depthFirstTraversal(startVertex);
        assertEquals(expResult, result);

    }

    /**
     * Test of breadthFirstTraversal method, of class AMGraph.
     */
    @Test
    public void testBreadthFirstTraversal() {
        System.out.println("breadthFirstTraversal");
        String startVertex = null;
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
        ArrayList expResult = null;
        ArrayList result = instance.breadthFirstTraversal(startVertex);
        assertEquals(expResult, result);

    }

    /**
     * Test of isConnected method, of class AMGraph.
     */
    @Test
    public void testIsConnected() {
        System.out.println("isConnected");
        AMGraph<String> instance = new AMGraph<>();
        instance.addVertex("Clara");
        boolean expResult = false;
        boolean result = instance.isConnected();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class AMGraph.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AMGraph<String> instance = new AMGraph<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class AMGraph.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AMGraph<String> instance = new AMGraph<>();
        //instance.addVertex("Clara");
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

}
