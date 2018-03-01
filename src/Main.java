public class Main {

    public static void main(String[] args) {

        FibCalculator fibCalculator = new NaiveRecursiveFib();

        System.out.println(fibCalculator.fib(80));

    }
}
