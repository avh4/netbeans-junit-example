/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package junitexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avh4
 */
public class MathModelTest {

    public MathModelTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MathModel.
     */
    @Test
    public void testAddZeros() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        MathModel instance = new MathModel();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MathModel.
     */
    @Test
    public void testAddNumbers() {
        System.out.println("add");
        int a = 3;
        int b = 4;
        MathModel instance = new MathModel();
        int expResult = 7;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class MathModel.
     */
    @Test
    public void testSubtractZeros() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        MathModel instance = new MathModel();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class MathModel.
     */
    @Test
    public void testSubtractNumbers() {
        System.out.println("subtract");
        int a = 10;
        int b = 9;
        MathModel instance = new MathModel();
        int expResult = 1;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
    }

}