package bingo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class NumberCollectionTest {
    
    NumberCollection nc1;
    NumberCollection nc2;
    ArrayList<Number> newarr_test1;
    ArrayList<Number> newarr_test2;
    Number n1;
    Number n2;
    
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
        nc1 = new NumberCollection();
        nc2 = new NumberCollection();
        newarr_test1 = new ArrayList<Number>();
        newarr_test2 = new ArrayList<Number>();
        n1 = new Number(1);
        n2 = new Number(2);
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
        nc1.addNumber(n1);
        newarr_test1.add(n1);
        assertEquals(newarr_test1, nc1.ncarr);
        
    }

    /**
     * Test of containsNumber method, of class NumberCollection.
     */
    @Test(timeout = 1000)
    public void testContainsNumber() {
        System.out.println("containsNumber");
        nc1.addNumber(n1);
        boolean expResult = false;
        boolean result = nc1.containsNumber(n2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testContainsNumber1() {
        System.out.println("containsNumber - 1");
        nc1.addNumber(n1);
        boolean expResult = true;
        boolean result = nc1.containsNumber(n1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of containsCollection method, of class NumberCollection.
     */
    @Ignore
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
        nc1.addNumber(n1);
        int expResult = 1;
        int result = nc1.count();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCount1() {
        System.out.println("count - 1");
        int expResult = 0;
        int result = nc2.count();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get method, of class NumberCollection.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Number expResult = new Number(index);
        Number result = nc1.get(index);
        assertArrayEquals(expResult, result);
        
    }

    private boolean assertArrayEquals(Number expResult, Number result) {
        
        boolean eq = expResult.getNumber() == result.getNumber();
        return eq;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
