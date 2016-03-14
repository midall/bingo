package bingo;

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
public class PlayerTest {
    private Player pl1;
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pl1 = new Player();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Player() {
        
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = null;
        String result = pl1.getName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetName1() {
        System.out.println("getName - 1");
        pl1.setName("Nick");
        String expResult = "Nick";
        String result = pl1.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        //pl1.setName(null);
        String expResult = null;
        String result = pl1.getName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSetName1() {
        System.out.println("setName - 1");
        pl1.setName("");
        String expResult = "";
        String result = pl1.getName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSetName2() {
        System.out.println("setName - 2");
        pl1.setName("Nick");
        String expResult = "Nick";
        String result = pl1.getName();
        assertEquals(expResult, result);
        
    }
    
}
