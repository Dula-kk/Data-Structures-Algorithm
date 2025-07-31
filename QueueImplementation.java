/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author user
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>();
        
        pQueue.add(20);
        pQueue.add(10);
        pQueue.add(15);
        
        System.out.println(pQueue); // [10, 20, 15]
        
        int size = pQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(pQueue.poll()); // 10, 15, 20 (in priority order)
        }
    }
}