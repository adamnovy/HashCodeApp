/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Adam
 */
public class RealEstate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Property> mls = new ArrayList<>();
        Property p1 = new Property(100000,"Estate",3);
        mls.add(p1);
        System.out.println("Inserted Real Estate: " + mls.toString());
        mls.remove(p1);
        System.out.println("After: " + mls.toString());
        
    }
    
}
