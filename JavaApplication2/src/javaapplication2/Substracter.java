/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Adam
 */
public class Substracter extends CalculateBase{
    public Substracter(){}
    public Substracter(double leftVal, double rightVal){
    super(leftVal, rightVal);
    }
    
    @Override
    public void calculate(){
    double value = getLeftVal() - getRightVal();
    setResult(value);
    }
}
