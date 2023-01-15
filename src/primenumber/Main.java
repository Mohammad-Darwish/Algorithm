package primenumber;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(new PrimeNumber().getPrimeNumberTo(5));
        ArrayList<Integer> primeNumbers = new PrimeNumber().getPrimeNumbers(5);
        System.out.println(primeNumbers);
        System.out.println(primeNumbers.size());
    }
}
