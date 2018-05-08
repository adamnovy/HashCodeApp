/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Adam
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {4,5,6,7,8};
        SelectionSort(numbers);
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        SelectionMaxSort(numbers);
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void SelectionSort (int[] num)
    {
        int i,j,first,temp;
        
        for(i = num.length - 1; i>0; i--)
        {
            first = 0;
            for(j=1; j<=i; j++)
            {
                if(num[j]<num[first])
                    first=j;
            }
            temp=num[first];
            num[first]=num[i];
            num[i]=temp;
        }
    }
    public static void SelectionMaxSort (int[] num)
    {
        int i,j,temp,first;
        
        for(i=num.length-1; i>0; i--)
        {
            first=0;
            for(j=1; j<=i; j++)
            {
                if(num[first]<num[j])
                    first=j;
            }
            temp=num[first];
            num[first]=num[i];
            num[i]=temp;
        }
    }
    
}
