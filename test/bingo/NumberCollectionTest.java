package bingo;

import bingo.NumberCollection;
import bingo.Number;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michalis
 */
public class NumberCollectionTest {
    
    public NumberCollectionTest() {
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
     * Test of addNumber method, of class NumberCollection.
     */
    @Test
    public void testAddNumber() {
        System.out.println("addNumber");
        Number n = null;
        NumberCollection instance = new NumberCollection();
        instance.addNumber(n);
        
    }

    /**
     * Test of containsNumber method, of class NumberCollection.
     */
    @Test
    public void testContainsNumber() {
        System.out.println("containsNumber");
        Number n = null;
        NumberCollection instance = new NumberCollection();
        boolean expResult = false;
        boolean result = instance.containsNumber(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of containsCollection method, of class NumberCollection.
     */
    @Test
    public void testContainsCollection() {
        System.out.println("containsCollection");
        NumberCollection nc = null;
        NumberCollection instance = new NumberCollection();
        boolean expResult = false;
        boolean result = instance.containsCollection(nc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class NumberCollection.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        NumberCollection instance = new NumberCollection();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get method, of class NumberCollection.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        NumberCollection instance = new NumberCollection();
        Number expResult = null;
        Number result = instance.get(index);
        assertEquals(expResult, result);
        
    }
    
}
