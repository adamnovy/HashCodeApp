/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.myapp;
import javaapplication2.Adder;
import javaapplication2.CalculateHelper;
import javaapplication2.DynamicHelper;
import javaapplication2.InvalidStatementException;
import javaapplication2.MathProcessing;
import javaapplication2.PowerOf;
/**
 *
 * @author Adam
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d','a','s','m'};
//        double[] results = new double[opCodes.length];
//      
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.println(testEquation.getResult());
        String[] statements = {
            
            "add 25.0 92.0",
             "power 2.0 3.0"   
        };
        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
            new Adder(),
            new PowerOf()
                
        });
    
        for(String statement : statements)
        {
            String output = helper.process(statement);
            System.out.println(output);
        }
        //javaapplication2.MathCommand cmd;
        }
    }

//        MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation('d',100.0d,5.0d);
//        equations[1] = new MathEquation('a',50.0d,2.0d);
//        equations[2] = new MathEquation('s',50.0d,2.0d);
//        equations[3] = new MathEquation('m',50.0d,2.0d);
//        
//        
//        for(MathEquation equation : equations )
//        {
//           equation.execute();
//           System.out.println("Wynik = " + equation.getResult()); 
//        }
//        
//        System.out.println();
//        System.out.println("Using overloads");
//        System.out.println();
//        
//        double leftVal = 9.0d;
//        double rightVal = 4.0d;
//        int leftInt = 9;
//        int rightInt = 4;
//        
//        MathEquation equationOverload = new MathEquation('d');
//        equationOverload.execute(leftVal, rightVal);
//        
//        System.out.println(equationOverload.getResult());
//        
//        
//        equationOverload.execute(leftInt, rightInt);
//        
//        System.out.println(equationOverload.getResult());
//        
//        System.out.println("");
//        System.out.println("Using inheritance");
//        System.out.println("");
//        
//        CalculateBase[] calculators = {
//    new Divider(100.0d,50.0d),
//            new Adder(50.0d,2.0d),
//            new Multiplier(20.0d,3.0d),
//            new Substracter(30.0d,10.0d)
//    
//    };
//        for(CalculateBase calculator : calculators)
//        {
//        calculator.calculate();
//        System.out.println("Wynik=" + calculator.getResult());
//        }
//    }
//    
//    
//    
//    
////        public static MathEquation create(double leftVal, double rightVal, char opCode)
////        {
////        MathEquation equation = new MathEquation();
////        equation.setLeftVal(leftVal);
////        equation.setRightVal(rightVal);
////        equation.setOpCode(opCode);
////        
////        return equation;
////        }
//    }


