package fibonacci;

public class Fibonacci {

    // fibonacci : [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ......]

    long[] fibonacciCash;

    public Long getFibonacciNumberProxy(Integer n) {
        fibonacciCash = new long[n + 1];
        return getFibonacci(n);
    }

    public long[] getFibonacciList(int limit) {
        fibonacciCash = new long[limit + 1];
        getFibonacci(limit);
        return fibonacciCash;
    }


    public long getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCash[n] != 0) {
            return fibonacciCash[n];
        }

        Long nthFibonacci = getFibonacci(n - 1) + getFibonacci(n - 2);
        fibonacciCash[n] = nthFibonacci;
        return nthFibonacci;
    }
}
