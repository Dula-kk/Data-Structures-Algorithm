/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author user
 */



import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetImplementation {
    public static void main(String[] args) {
        new SequencedSetImplementation();
    }
    
    public SequencedSetImplementation() {
        SequencedSet<Integer> myset = new LinkedHashSet<>();
        myset.add(5);
        myset.add(3);
        myset.add(5); // duplicate won't be added
        myset.add(2);
        myset.add(4);
        myset.remove(3);
        System.out.println(myset); // [5, 2, 4]
    }
}