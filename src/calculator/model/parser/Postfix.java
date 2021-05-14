package calculator.model.parser;

import java.util.Hashtable;

public class Postfix {
    public static double evaluate(String expr) {
        if (expr.isEmpty()) return 0;

        int start = 0;

        Stack stack = new Stack();

        do
        {
            int space = expr.substring(start).indexOf(' ');
            int end = space == -1 ? expr.length() : start + space;
            String current = expr.substring(start,end);
            if("+-*/".indexOf(current.charAt(0)) != -1)
            {
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operate(current.charAt(0),b,a));
            }
            else
            {
                stack.push(Double.parseDouble(current));
            }
            start = end + 1;
        }while(start < expr.length());

        double result = stack.pop();

        while(!stack.isEmpty())
        {
            double current = stack.pop();
            result = current > result ? current : result;
        }

        return result;
    }
    
    public static double operate(char operand,double a, double b){

        Hashtable<Character,Double> opHash = new Hashtable<Character,Double>();
        opHash.put('+',a + b);
        opHash.put('-',a - b);
        opHash.put('*',a * b);
        opHash.put('/',a / b);

        return opHash.get(operand);
    }
}