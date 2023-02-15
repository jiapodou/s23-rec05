package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList{
  private int totalAdded;

  public InheritanceSortedIntList() {
    totalAdded = 0;
  }

  @Override
  public boolean add(int num) {
    totalAdded += 1;
    return super.add(num);
  }

  @Override
  public boolean addAll(IntegerList list) {
    // totalAdded += list.size(); 
    // need to know its super class, super.addAll calls a loop which has this.add,
    // we will add totalAdd twice
    return super.addAll(list);
  }
  
  public int getTotalAdded() {
    return totalAdded;
  }
}