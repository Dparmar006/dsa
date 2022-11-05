package maths;

public class MathsQuestions {
    public static void main(String[] args) {
        int number = 1;
        for (int index = 0; index < 14; index++) {
            System.out.println(isPrime(index) ? index + " is prime number." : index + " is not a prime number.");
        }
    }

    static boolean isPrime(int num) {
        if(num <= 1)
            return false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
