/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

/**
 *
 * @author Adam
 */
public class Property {
    private int price,rooms;
    private String type;
    public Property(int Cena, String Typ, int Lpokoi)
    {
        this.price=Cena;
        this.type=Typ;
        this.rooms=Lpokoi;
    }
    @Override
        public String toString()
    {
        return price + " " +  type + " " + rooms;
    }
}
