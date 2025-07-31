/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author user
 */


import java.util.LinkedList;
import java.util.Collection;

public class CollectionImplementation {
    public static void main(String[] args) {
        new CollectionImplementation();
    }
    
    public CollectionImplementation() {
        Collection c = new LinkedList();
        c.add(5);
        c.add(3);
        System.out.println(c.isEmpty()); // false
        System.out.println(c.size());    // 2
        System.out.println(c.contains(5)); // true
        c.remove(5);
        System.out.println(c); // [3]
    }
}