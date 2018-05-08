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
public class PowerOf implements MathProcessing{
    @Override
    public String getKeyword() {
        return "power"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getSymbol() {
        return '^'; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        
        return Math.pow(leftVal, rightVal);//To change body of generated methods, choose Tools | Templates.
    }
}
