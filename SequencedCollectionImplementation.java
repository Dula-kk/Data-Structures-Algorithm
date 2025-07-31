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
import java.util.SequencedCollection;

public class SequencedCollectionImplementation {
    public static void main(String[] args) {
        new SequencedCollectionImplementation();
    }
    
    public SequencedCollectionImplementation() {
        SequencedCollection<Integer> sc = new LinkedList<>();
        sc.addFirst(5);
        sc.addFirst(3);
        sc.addLast(7);
        System.out.println(sc.getFirst()); // 3
        System.out.println(sc.removeLast()); // 7
        System.out.println(sc); // [3, 5]
        System.out.println(sc.reversed()); // [5, 3]
    }
}