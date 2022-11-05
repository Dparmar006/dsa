package recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(1342));
    }

    static int sumOfNumber(int num) {
        if(num == 0)
            return 0;
        return (num % 10) + sumOfNumber(num / 10);
    }
}

