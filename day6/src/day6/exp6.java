package day6;


import java.util.LinkedList;
import java.util.Iterator;
  public class exp6 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
        // print original list
   System.out.println("Original linked list:" + l_list);
   l_list.sort(null);
   System.out.println("the sorted list is :"+l_list);
 
    Iterator it = l_list.descendingIterator();

     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}