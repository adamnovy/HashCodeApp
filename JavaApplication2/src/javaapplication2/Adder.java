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
public class Adder extends CalculateBase implements MathProcessing{
    public Adder(){}
    public Adder(double leftVal, double rightVal){
    super(leftVal, rightVal);
    }
    
    @Override
    public void calculate(){
    double value = getLeftVal() + getRightVal();
    setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getSymbol() {
        return '+'; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();//To change body of generated methods, choose Tools | Templates.
    }
}
