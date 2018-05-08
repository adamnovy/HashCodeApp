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
public class Child extends Parent{
    public Child() {
        super("John", 42);
    }
    public Child(String name, int age) {
        super(name,age);
    }
    public String getName() {
        return super.getName();
    }
}
