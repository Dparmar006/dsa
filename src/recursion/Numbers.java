package recursion;

public class Numbers {
    public static void main(String[] args) {
//        printDecreasingNumber(5);
//        printIncreasingOrder(5);
        printBothOrder(5);
    }
    static void printDecreasingNumber(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasingNumber(n - 1);
    }

    static void printIncreasingOrder(int n) {
        if(n==0) return;
        printIncreasingOrder(n-1);
        System.out.println(n);
    }
    static void printBothOrder(int n) {
        if(n==0) return;
        System.out.println("UP PRINTS : " +  n);
        printBothOrder(n-1);
        System.out.println("DOWN PRINTS : " +  n);
    }
}

