package primenumber;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    public ArrayList<Integer> getPrimeNumberTo(int limit) {
        return (ArrayList<Integer>) IntStream
            .rangeClosed(2, limit).filter(this::isPrimeNumber)
            .boxed()
            .collect(Collectors.toList());
    }


    public ArrayList<Integer> getPrimeNumbers(int indexNumbers) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        int numberToCheck = 2;

        while (true) {
            if (primeNumbers.size() == indexNumbers) break;
            boolean isPrimeNumber = isPrimeNumber(numberToCheck);
            if (isPrimeNumber) {
                primeNumbers.add(numberToCheck);
            }
            numberToCheck++;
        }
        return primeNumbers;
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
