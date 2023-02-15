package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    //Write you tests below
    InheritanceSortedIntList list1;
    InheritanceSortedIntList list2;

    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    @Test
    public void stestAdd() {
        list1.add(1);
        list1.add(2);
        list1.remove(1);
        assertEquals(2, list1.getTotalAdded());
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private void printList(IntegerList list) {
       for (int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i));
           System.out.print(", ");
       }
       System.out.println();
   }

}