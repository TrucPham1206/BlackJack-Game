/*
 * Truc Pham
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phamt
 */
public class BlackJackTest {
    
    public BlackJackTest() {
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
     * Test of main method, of class BlackJack.
     */
    /**@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of checkNumber method, of class BlackJack.
     */
    @Test
    public void testCheckNumberGood() {
        System.out.println("checkNumber Good");
        int s = 3;
        boolean expResult = true;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckNumberBad() {
        System.out.println("checkNumber Bad");
        int s = 8;
        boolean expResult = false;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckNumberBoundary() {
        System.out.println("checkNumber Boundary");
        int s = 5;
        boolean expResult = false;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
