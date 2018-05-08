/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prices;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class Prices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] prices;
        int numofprices, numofdisc;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe cen: ");
        numofprices = in.nextInt();
        numofdisc = 2;
        prices = new double[numofprices][numofdisc];
        for(int i=0; i<numofprices; i++)
        {
            System.out.println("Podaj cene i znizke");
            for(int j=0; j<numofdisc; j++)
            {
                prices[i][j]= in.nextDouble();
            }            
        }
        for(int i=0; i<numofprices; i++)
        {
            double finalPrice = prices[i][0]*(100-prices[i][1])/100;
            System.out.println("Koncowa cena: " + finalPrice);
        }
    }
    
}
