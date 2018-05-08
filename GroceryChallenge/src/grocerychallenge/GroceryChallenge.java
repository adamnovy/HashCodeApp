/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerychallenge;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class GroceryChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("Milk 2%");
        groceries.add("Wheat bread");
        
        System.out.println("Here is the current list: \n" +
        groceries.toString());
        System.out.println("Enter another item or \"quit\" to exit");
        String newItem = in.nextLine();
        boolean found = false;
        while(newItem.equalsIgnoreCase("quit")==false)
        {
            for(int i=0; i<groceries.size(); i++)
            {
                if(newItem.equalsIgnoreCase(groceries.get(i)))
                {
                    System.out.println("This item is already in the list");
                    found = true;
                }
            }
            if(found == false)
            {
                groceries.add(newItem);
            }
            System.out.println("Enter another item or \"quit\" to exit");
            newItem=in.nextLine();
        }
        System.out.println("\nHere is the final list: \n" +
        groceries.toString());
    }
    
}
