/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graded_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 *
 * @author Logan Conley
 */
public class Graded_0 {
    
    public static List<Integer> randomList() {
        
        Random rand = new Random();
            
        int length = rand.nextInt(20);
        List<Integer> random = new ArrayList<>();
                
        for (int i = 0; i < length; i++) {
            int num = 10 + rand.nextInt(90);
            random.add(num);
        }
        
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (random.get(i) > random.get(i+1)) {
                    int temp = random.get(i);
                    int index = random.indexOf(temp);
                    random.set(index, random.get(i+1));
                    random.set((index +1), temp);
                    sorted = false;
                }
            }
        }
        
        return random;
    }
    
    public static void linear(List<Integer> l) {
        
        Random rand = new Random();
        int check = 10 + rand.nextInt(90);
        
        boolean exists = l.contains(check);
        if (exists == true) {
            System.out.println("The list contains " + check + " at: " + l.indexOf(check));
        } else {
            System.out.println("List does not contain " + check);
        }
    }
    
    public static void binary() {
        
        Random rand = new Random();
        int check = 10 + rand.nextInt(90);
        
        
        
        
    }   
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = randomList();
        linear(list);
    }
    
}
