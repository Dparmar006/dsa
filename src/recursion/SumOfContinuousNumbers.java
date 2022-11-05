package recursion;

public class SumOfContinuousNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfContinuousNumbers(5));
    }

    static int sumOfContinuousNumbers(int num) {
        if(num == 1)
            return 1;
        return num + sumOfContinuousNumbers(num - 1);
    }
}
