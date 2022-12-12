package fibonacci;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().getFibonacciNumberProxy(90));
        System.out.println(Arrays.toString(new Fibonacci().getFibonacciList(90)));
    }
}
