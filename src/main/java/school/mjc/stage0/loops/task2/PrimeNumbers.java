package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int value = 2;
        while (value <= printToInclusive){
            boolean isPrime = true;
            int divisor = 2;
            while (divisor <= value / 2) {
                if (value % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                System.out.println(value);
            }
            value++;
        }
    }
}
