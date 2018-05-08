/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personapplication;

/**
 *
 * @author adam
 */
public class PersonApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person osoba = new Person("Pieseł");
        //osoba.setName("Nowy");
        System.out.println(osoba.getName());
        Child dziecko = new Child("Marian",10);
        System.out.println(dziecko.getName());
    }
    
}
