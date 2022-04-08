import java.util.ArrayList;
import java.util.List;

public class Task {
    //Create a public static inner class called Triplet with generics for a first, second and third element. All variables should be public.
    public static class Triplet<T1, T2, T3> {
        public T1 obj1;
        public T2 obj2;
        public T3 obj3;
        public Triplet(T1 obj1, T2 obj2, T3 obj3) {
            this.obj1 = obj1;
            this.obj2 = obj2;
            this.obj3 = obj3;
        }
    }

    public static String result = "";
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
        // Add the code to add a multiplication of 4.5 x 5.4, a division by zero, and divide 56.0/28.0
        t.add(new Triplet<>(4.5, 5.4, "*"));
        t.add(new Triplet<>(10.0, 0.0, "/"));
        t.add(new Triplet<>(56.0, 28.0, "/"));

        //Utilizing a lambda expression, use the calculator to compute the operation specified in each Triplet with the corresponding numbers.);
        t.forEach(obj -> result += c.compute(obj.obj1, obj.obj2, obj.obj3) + " ");
        System.out.println(result);
    }
}