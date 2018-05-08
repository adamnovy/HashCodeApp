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
public interface MathProcessing {
    String SEPARATOR =" ";
    String getKeyword();//add
    char getSymbol();//"+"
    double doCalculation(double leftVal, double rightVal);
}
