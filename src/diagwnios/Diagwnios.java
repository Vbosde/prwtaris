/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagwnios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Βασίλης
 */
public class Diagwnios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listoula = new ArrayList();
        int num, count;
        num = input.nextInt();
        for(count = 1; count <= num; count ++){
            listoula.add(count);
            System.out.println(listoula);
        }
    }
    
}
