/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Roller
 */
public class JavaCollections {
    
    public static void run(){
        //run all of the java collection in here
        JavaCollections.arrayListExample();
        JavaCollections.treeSetExample();
    }

    public static void arrayListExample() {
        System.out.println("Starting ArrayList examples");
        
        //make a new array list
        ArrayList arr = new ArrayList();
        
        //add to the list
        arr.add("First element");
        arr.add("Second element");
        
        //get size of array
        System.out.println("The size of the array is: " + arr.size());
        
        //remove from the list
        arr.remove(0);
        
        //get size of array after remove
        System.out.println("The size of the array is now: " + arr.size());
        
        
    }

    public static void treeSetExample() {
        System.out.println("Starting TreeSet examples");
        
        //make a new tree set
        TreeSet tree = new TreeSet();
        
        //add to the set
        tree.add(2);
        tree.add(50);
        tree.add(1);
        
        //get last object in list (which is the biggest in a sorted set)
        System.out.println("The last is: " + tree.last());
        
        //get size of set
        System.out.println("The set size is: " + tree.size());
        
        //is the set empty? (returns a boolean)
        System.out.println("Is the set empty? " + tree.isEmpty());
        
        //clear the list
        tree.clear();
        
        //get size of set
        System.out.println("The set size is now: " + tree.size());
        
    }
    
}
