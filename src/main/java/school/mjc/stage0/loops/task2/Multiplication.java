package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0){
            return;
        } else if (multiplyByAndToInclusive > 0) {
            int i = 0;
            while (i <= multiplyByAndToInclusive){
                int multi = i;
                multi *= multiplyByAndToInclusive;
                System.out.println(multi);
                i++;
            }
        }else {
            int length = multiplyByAndToInclusive * -1;
            int i = 0;
            while (i <= length){
                int multi = i;
                multi *= multiplyByAndToInclusive;
                System.out.println(multi);
                i++;
             }
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(-5);
    }
}
