package bingo;

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
public class NumberTest {
    
    public NumberTest() {
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
     * Test of getNumber method, of class Number.
     */
    @Test
    public void testGetNumber1() {
        System.out.println("getNumber1");
        Number instance = new Number(4);
        int expResult = 4;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetNumber2() {
        System.out.println("getNumber2");
        Number instance = new Number(7);
        int expResult = 7;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumber method, of class Number.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        Number instance = new Number(0);
        instance.setNumber(3);
        int expResult = 3;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        /*
        int val = 0;
        Number instance = null;
        instance.setNumber(val);
        */
        
    }
    
    

}
