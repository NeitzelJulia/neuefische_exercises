public class Main {
    public static void main(String[] args) {
        StaticExample instance1 = new StaticExample();
        instance1.incrementInstanceCount();
        instance1.incrementTotalCount();

        StaticExample instance2 = new StaticExample();
        instance2.incrementInstanceCount();
        instance2.incrementTotalCount();

        StaticExample instance3 = new StaticExample();
        instance3.incrementInstanceCount();
        instance3.incrementTotalCount();

        StaticExample instance4 = new StaticExample();
        instance4.incrementInstanceCount();
        instance4.incrementTotalCount();

        System.out.println(instance4.toString());

        System.out.println(Calculator.add(3, 4));
        System.out.println(Calculator.add(1, 5));
        System.out.println(Calculator.subtract(10, 8));
        System.out.println(Calculator.multiply(3, 4));
        System.out.println(Calculator.divide(9, 3));

    }
}
