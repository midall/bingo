package bingo;

import bingo.BingoCard;
import bingo.NumberCollection;
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
public class BingoCardTest {
    
    public BingoCardTest() {
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
     * Test of stampNumber method, of class BingoCard.
     */
    @Test
    public void testStampNumber() {
        System.out.println("stampNumber");
        int n = 0;
        BingoCard instance = new BingoCard();
        instance.stampNumber(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of containsNumber method, of class BingoCard.
     */
    @Test
    public void testContainsNumber() {
        System.out.println("containsNumber");
        int n = 0;
        BingoCard instance = new BingoCard();
        boolean expResult = false;
        boolean result = instance.containsNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of numbersStamped method, of class BingoCard.
     */
    @Test
    public void testNumbersStamped() {
        System.out.println("numbersStamped");
        BingoCard instance = new BingoCard();
        int expResult = 0;
        int result = instance.numbersStamped();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of numberMissing method, of class BingoCard.
     */
    @Test
    public void testNumberMissing() {
        System.out.println("numberMissing");
        BingoCard instance = new BingoCard();
        NumberCollection instance1 = new NumberCollection();
        NumberCollection expResult = instance1;
        NumberCollection result = instance.numberMissing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
