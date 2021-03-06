package bingo;

import bingo.BingoGame;
import bingo.BingoCard;
import bingo.Number;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BingoGameTest {
    
    public BingoGameTest() {
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
     * Test of getNextNumber method, of class BingoGame.
     */
    @Test
    public void testGetNextNumber() {
        System.out.println("getNextNumber");
        BingoGame instance = new BingoGame();
        Number expResult = null;
        Number result = instance.getNextNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of random method, of class BingoGame.
     */
    @Test
    public void testRandom() {
        System.out.println("random");
        BingoGame instance = new BingoGame();
        Number expResult = null;
        Number result = instance.random();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of house method, of class BingoGame.
     */
    @Test
    public void testHouse() {
        System.out.println("house");
        BingoCard card = null;
        BingoGame instance = new BingoGame();
        boolean expResult = false;
        boolean result = instance.house(card);
        assertEquals(expResult, result);
        
    }
    
}
