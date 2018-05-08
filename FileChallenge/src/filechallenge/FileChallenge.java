/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechallenge;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class FileChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File menuItems = new File("menuNoPrices.txt");
        File menuPrices = new File("menuWithPrices.txt");
        String menuItem;
        double price;
        try
        {
            Scanner input = new Scanner(menuItems);
            PrintWriter output = new PrintWriter(menuPrices);
            Scanner in = new Scanner(System.in);
            while(input.hasNextLine())
            {
                menuItem = input.nextLine();
                System.out.println("What is the price of this item: " + menuItem);
                price = in.nextDouble();
                output.print(menuItem+"\t");
                output.println(price);
                
            }
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.toString());
        }
    }
    
}
