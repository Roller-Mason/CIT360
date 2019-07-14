/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Mason
 */
public class JavaCollectionsIT {
    
    public JavaCollectionsIT() {
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
     * Test of arrayListExample method, of class JavaCollections.
     */
    @Test
    public void testArrayListExample() {

        //make a new array list
        ArrayList arr = new ArrayList();
        
        //add to the list
        arr.add("First element");
        arr.add("Second element");
        arr.add("First element"); //duplicate
        
        //remove from the list
        arr.remove(0);
        
        //make sure the array isn't null
        assertNotNull(arr);
        //make sure the array is what we think it is
        assertArrayEquals(new String[]{"Second element", "First element"}, ArrayUtils.toStringArray(arr.toArray()));
        //make sure the first element does not equal "First Element" since we removed it
        assertFalse(arr.get(0).equals("First Element"));
    }

    /**
     * Test of treeSetExample method, of class JavaCollections.
     */
    @Test
    public void testTreeSetExample() {

        //make a new tree set
        TreeSet tree = new TreeSet();
        
        //add to the set
        tree.add(2);
        tree.add(50);
        tree.add(1);
        tree.add(2); //duplicate 
        
        //clear the list
        tree.clear();
        
        //make sure that after clearing the treeset that it equals an empty set
        assertEquals(tree, new TreeSet());
        assertThat(tree, is(new TreeSet()));
        assertSame(tree.contains(50), false);
    }
        /**
     * Test of hashMapExample method, of class JavaCollections.
     */
    @Test
    public void hashMapExample() {
        //make a new hash map
        HashMap hash = new HashMap();
        
        //Add elements into the hash map (Produce prices)
        hash.put("Apple", 3.74);
        hash.put("Banana", 0.68);
        hash.put("Pear", 1.25);
        hash.put("Apple", 5.20);
        
        //Make sure we don't have any Kiwis
        assertNull(hash.get("Kiwi"));
        //Make sure we have Bananas
        assertTrue(hash.containsKey("Banana"));
        //since inserting duplicates, the actual value should be 5.2 not the first 3.74
        assertNotSame(hash.get("Apple"), 3.74);
    }
    
}
