public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+":
                //Use a lambda expression to set "res" to the correct function.
                res = ((obj1, obj2) -> obj1 + obj2);
                break;
            case "-":
                //Use a lambda expression to set "res" to the correct function.-x2;
                res = ((obj1, obj2) -> obj1 - obj2);
                break;
            case "*":
                //Use a lambda expression to set "res" to the correct function.->x1*x2;
                res = ((obj1, obj2) -> obj1 * obj2);
                break;
            case "/":
                //Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.INITY:x1/x2;
                res = ((obj1, obj2) -> {
                    if (obj2 == 0)  return Double.POSITIVE_INFINITY;
                    return obj1 / obj2;
                });
                break;
            default:
                //In the default value, the res function should return the minimun possible value.ouble.MIN_VALUE;
                return ((obj1, obj2) -> Double.MIN_VALUE);
        }

        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        // set calc to the correct function calling the method above.toOperation(op);
        DoMath calc = toOperation(op);
        // return the result of calc.compute with the numbers given..compute(n1,n2);
        return calc.compute(n1, n2);
    }
}
