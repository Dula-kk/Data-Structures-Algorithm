/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author user
 */


import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
    public static void main(String[] args) {
        new SetImplementation();
    }
    
    public SetImplementation() {
        Set<Integer> myset = new HashSet<>();
        myset.add(5);
        myset.add(3);
        myset.add(5); 
        myset.add(2);
        myset.add(4);
        myset.remove(3);
        System.out.println(myset); // [2, 4, 5]
    }
}