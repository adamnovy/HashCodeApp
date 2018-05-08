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
public class Parent {
    private String name;
    private int age;
    
    public Parent() {}
    
    public String getName() {
        String tempage = Integer.toString(this.age);
        return name+" "+tempage;
    }
 
    public Parent(String tName, int tAge) {
        name=tName;
        age=tAge;
    }
}
