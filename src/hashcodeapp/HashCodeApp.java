/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeapp;

/**
 *
 * @author adam
 */
public class HashCodeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Foo foo1 = new Foo(1,1,"1");
        Foo foo2 = new Foo(1,2,"1");
        boolean isEqual = foo2.equals(foo1);
        System.out.println(isEqual);
        System.out.println(foo2.hashCode());
    }
    
}
