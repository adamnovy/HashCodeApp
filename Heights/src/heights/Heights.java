/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heights;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class Heights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int numStudent;
        double [] heights;
        System.out.println("How many? ");
        numStudent = in.nextInt();
        heights = new double[numStudent];
        for(int i=0; i<heights.length; i++)
        {
            System.out.println("Enter height: ");
            heights[i] = in.nextDouble();
        }
        double maxHeight = heights[0];
        for(int i = 0; i<heights.length; i++)
        {
            if(heights[i]>maxHeight)
                maxHeight=heights[i];
        }
        System.out.println("Max height: " + maxHeight);
        double total = 0;
        for(int i=0; i<heights.length; i++)
        {
            total+=heights[i];
        }
        System.out.println("Total heights: " + total);
    }
    
}
