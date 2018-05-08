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
public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name!=null && name.length()>2)
            this.name=name;
    }
    public Person() {
        this.name="DEFAULT";
    }
    public Person(String name) {
        if(name!=null && name.length()>2)
            this.name=name;
    }
}
