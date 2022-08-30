import java.util.function.Function;
import java.util.function.Predicate;
class Test{
    public static void main (String[] args) {
        // Assess assess = new Assess();
        // assess.print(1);
        // Assessment.set(2);

        Predicate<Integer> predicate = (x) -> {return x == 0;};
        Function<Integer, Integer> fucntion = (x) -> {return x;};

        System.out.println(predicate.test(1));
        System.out.println(fucntion.apply(1));
        // Data data = (x) -> {System.out.println(x);};
        // data.put(12);
    }

    public void test(double x, Function<Double, Double> function) {
        System.out.println(function.apply(x));
    }
}

// interface Assessment {
//     final double i = 0;
    
//     default void print(double x) {
//         System.out.println(x);
//     }

//     static void set(double y) {
//         System.out.println(y);
//     }
// }


