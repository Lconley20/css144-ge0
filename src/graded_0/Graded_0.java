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
    public static void randomList() {
        Random rand = new Random();
    
        int check = 10 + rand.nextInt(90);
        int length = rand.nextInt(20);
        List random = new ArrayList();
                
        for (int i = 0; i < length; i++) {
            int num = 10 + rand.nextInt(90);
            System.out.println(num);
            random.add(num);
        }
        
        boolean exists = random.contains(check);
        
        if (exists == true) {
            System.out.println("The list contains " + check + " at:" + random.indexOf(check));
        } else {
            System.out.println("List does not contain " + check);
        }
    }
        
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        randomList();
    }
    
}
