package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0){
            System.out.println("too much power");
        }
        int i = 0;
        int result;
        while (i <= power){
            result = (int)(Math.pow(2,i));
            System.out.println(result);
            i++;
        }

    }
}
